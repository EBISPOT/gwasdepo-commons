package uk.ac.ebi.spot.gwas.deposition.scheduler.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import java.util.Properties;

@Configuration
@ConditionalOnProperty(name = "quartz.scheduler.active", havingValue = "true")
public class QuartzSchedulerConfig {

    private static Logger log = LoggerFactory.getLogger(QuartzSchedulerConfig.class);

    @Value("${quartz.scheduler.class:uk.ac.ebi.spot.gwas.deposition.scheduler.GWASQuartzJobScheduler}")
    private String quartzClass;

    @Value("${quartz.scheduler.collectionPrefix:quartz_}")
    private String quartzCollectionPrefix;

    @Value("${quartz.scheduler.threadCount:10}")
    private String quartzThreadCount;

    @Value("${quartz.scheduler.skipUpdateCheck:true}")
    private String quartzSkipUpdateCheck;

    @Value("${quartz.scheduler.isClustered:true}")
    private String quartzIsClustered;

    @Value("${quartz.scheduler.instanceId:AUTO}")
    private String quartzInstanceId;

    @Value("${quartz.scheduler.instanceName}")
    private String quartzInstanceName;

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean() {
        SchedulerFactoryBean scheduler = new SchedulerFactoryBean();
        scheduler.setApplicationContextSchedulerContextKey("applicationContext");
        scheduler.setQuartzProperties(getSchedulerDefaultProperties());
        scheduler.setWaitForJobsToCompleteOnShutdown(true);

        return scheduler;
    }

    private Properties getSchedulerDefaultProperties() {
        Properties properties = new Properties();

        properties.setProperty("org.quartz.jobStore.class", quartzClass);
        properties.setProperty("org.quartz.jobStore.collectionPrefix", quartzCollectionPrefix);
        properties.setProperty("org.quartz.threadPool.threadCount", quartzThreadCount);
        properties.setProperty("org.quartz.scheduler.skipUpdateCheck", quartzSkipUpdateCheck);
        properties.setProperty("org.quartz.jobStore.isClustered", quartzIsClustered);
        properties.setProperty("org.quartz.scheduler.instanceId", quartzInstanceId);
        properties.setProperty("org.quartz.scheduler.instanceName", quartzInstanceName);

        return properties;
    }

}
