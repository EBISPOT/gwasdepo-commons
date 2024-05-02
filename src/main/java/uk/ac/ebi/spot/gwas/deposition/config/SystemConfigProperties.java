package uk.ac.ebi.spot.gwas.deposition.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import uk.ac.ebi.spot.gwas.deposition.constants.GeneralCommon;

@Component
public class SystemConfigProperties {

    @Value("${spring.profiles.active}")
    private String activeSpringProfile;

    @Value("${server.name}")
    private String serverName;

    @Value("${server.port}")
    private String serverPort;

    @Value("${spring.data.mongodb.uri:#{NULL}}")
    private String mongoUri;

    public String getActiveSpringProfile() {
        return activeSpringProfile;
    }

    public String getServerName() {
        return serverName;
    }

    public String getServerPort() {
        return serverPort;
    }

    public String getMongoUri() {
        return mongoUri;
    }

    public String getDbUser() {
        return System.getenv(GeneralCommon.DB_USER);
    }

    public String getDbPassword() {
        return System.getenv(GeneralCommon.DB_PASSWORD);
    }

}
