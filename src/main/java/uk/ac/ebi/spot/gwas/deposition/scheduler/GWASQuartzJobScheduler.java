package uk.ac.ebi.spot.gwas.deposition.scheduler;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;
import com.novemberain.quartz.mongodb.MongoDBJobStore;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.mongodb.core.MongoTemplate;
import uk.ac.ebi.spot.gwas.deposition.scheduler.domain.EnvironmentConfiguration;
import uk.ac.ebi.spot.gwas.deposition.scheduler.util.QuartzConfigurationReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GWASQuartzJobScheduler extends MongoDBJobStore {

    private static Logger log = LoggerFactory.getLogger(GWASQuartzJobScheduler.class);

    // The following properties are needed here since this class does not run within a spring context
    private static final String ENVIRONMENT = "spring.profiles.active";
    private static final String MONGO_URI = "spring.data.mongodb.uri";
    private static final String DB_USER = "DB_USER";
    private static final String DB_PASSWORD = "DB_PASSWORD";
    private static final String QUARTZ_ENV_CONFIG = "quartz.scheduler.environment-config";
    private static final String QUARTZ_MONGO_POOL_SIZE = "quartz.scheduler.mongodb-pool-size";
    private static final String DEFAULT_QUARTZ_ENV_CONFIG = "quartz/environment-config.yaml";
    private static final String QUARTZ_SCHEDULER_DB_NAME = "quartz.scheduler.dbName";
    private static String mongoAddresses;
    private static String userName;
    private static String password;
    private static String dbName;
    private static String poolSize;
    private static MongoClient mongoClient;

    static {
        initializeMongo();
    }

    public GWASQuartzJobScheduler() {
        super(mongoClient);
        setDbName(dbName);
        try {
            MongoTemplate mongoTemplate = new MongoTemplate(mongoClient, dbName);
            mongoTemplate.dropCollection("quartz__locks");
        } catch (Exception e) {
            log.error("Exception occurred while trying to clear the quartz tables : {}", e);
            //do nothing
        }
    }

    private static void initializeMongo() {
        String env = System.getProperty(ENVIRONMENT);
        env = StringUtils.isNotBlank(env) ? env : "dev";

        YamlPropertiesFactoryBean commonProperties = new YamlPropertiesFactoryBean();
        commonProperties.setResources(new ClassPathResource("application.yml"));

        userName = StringUtils.trimToEmpty(System.getenv(DB_USER));
        password = StringUtils.trimToEmpty(System.getenv(DB_PASSWORD));

        poolSize = commonProperties.getObject().getProperty(QUARTZ_MONGO_POOL_SIZE);
        YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();

        String envConfigFileName = StringUtils.trimToEmpty(commonProperties.getObject()
                .getProperty(QUARTZ_ENV_CONFIG));
        if (StringUtils.isEmpty(envConfigFileName)) {
            log.info("Using default configuration: {}", DEFAULT_QUARTZ_ENV_CONFIG);
            envConfigFileName = DEFAULT_QUARTZ_ENV_CONFIG;
        }

        Map<String, EnvironmentConfiguration> environmentConfigurations =
                QuartzConfigurationReader.readConfiguration(envConfigFileName);
        log.info("Environment configurations: {}", environmentConfigurations);
        if (environmentConfigurations != null) {
            EnvironmentConfiguration environmentConfiguration = environmentConfigurations.get(env);
            log.info("Environment configuration for env [{}]: {}", env, environmentConfigurations);

            if (environmentConfiguration != null) {
                yaml.setResources(new ClassPathResource(environmentConfiguration.getConfig()));
                mongoAddresses = yaml.getObject().getProperty(MONGO_URI);
                dbName = yaml.getObject().getProperty(QUARTZ_SCHEDULER_DB_NAME);
                log.info("Using Mongo URI: {}", mongoAddresses);
                log.info("Using Mongo DB: {}", dbName);

                if (environmentConfiguration.isDev()) {
                    mongoClient = getMongoForDev();
                } else {
                    mongoClient = getMongoForNonDev(environmentConfiguration.isGcp());
                }
            }
        }
    }

    private static MongoClient getMongoForDev() {
        String[] addresses = mongoAddresses.split(",");
        List<ServerAddress> servers = new ArrayList<>();
        for (String address : addresses) {
            String[] split = address.trim().split(":");
            servers.add(new ServerAddress(split[0].trim(),
                    Integer.parseInt(split[1].trim())));
        }
        return new MongoClient(servers);
    }

    private static MongoClient getMongoForNonDev(boolean gcp) {
        int connectionsPoolSize = StringUtils.isNotEmpty(poolSize) ? Integer.parseInt(poolSize.trim()) : 2;
        String credentials = "";
        if (userName != null && password != null) {
            userName = userName.trim();
            password = password.trim();
            if (!userName.equalsIgnoreCase("") &&
                    !password.equalsIgnoreCase("")) {
                credentials = userName + ":" + password + "@";
            }
        }

        String prefix = gcp ? "mongodb+srv://" : "mongodb://";
        MongoClientURI uri = new MongoClientURI(prefix + credentials + mongoAddresses,
                MongoClientOptions.builder()
                        .sslInvalidHostNameAllowed(true)
                        .connectionsPerHost(connectionsPoolSize));
        return new MongoClient(uri);
    }
}
