package uk.ac.ebi.spot.gwas.deposition.scheduler.config;

import org.joda.time.DateTime;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
public class QuartzSchedulerJobConfig {

    @Autowired
    private SchedulerFactoryBean schedulerFactoryBean;

    private List<AbstractQuartzConfig> abstractQuartzConfigList;

    @PostConstruct
    private void initialize() throws SchedulerException {
        abstractQuartzConfigList = new ArrayList<>();
    }

    public void addJob(AbstractQuartzConfig quartzJob) {
        abstractQuartzConfigList.add(quartzJob);
    }

    public void initializeJobs() throws SchedulerException {
        for (AbstractQuartzConfig abstractQuartzConfig : abstractQuartzConfigList) {
            schedulerFactoryBean.getScheduler().addJob(abstractQuartzConfig.getjobDetail(), true, true);
            if (!schedulerFactoryBean.getScheduler().checkExists(abstractQuartzConfig.getTriggerKey())) {
                schedulerFactoryBean.getScheduler()
                        .scheduleJob(abstractQuartzConfig.createNewTrigger(DateTime.now().plusSeconds(3).toDate()));
            } else {
                Date startTime = schedulerFactoryBean.getScheduler().getTrigger(abstractQuartzConfig.getTriggerKey()).getNextFireTime();
                schedulerFactoryBean.getScheduler().rescheduleJob(abstractQuartzConfig.getTriggerKey(),
                        abstractQuartzConfig.createNewTrigger(startTime));
            }
        }
    }
}
