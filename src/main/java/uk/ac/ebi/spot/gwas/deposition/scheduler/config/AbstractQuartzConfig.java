package uk.ac.ebi.spot.gwas.deposition.scheduler.config;

import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.quartz.TriggerKey;

import java.util.Date;

public abstract class AbstractQuartzConfig {

    private TriggerKey triggerKey;

    public AbstractQuartzConfig(String triggerKeyValue, String pollingGroupValue) {
        triggerKey = new TriggerKey(triggerKeyValue, pollingGroupValue);
    }

    public abstract JobDetail getjobDetail();

    public abstract Trigger createNewTrigger(Date startTime);

    public TriggerKey getTriggerKey() {
        return triggerKey;
    }
}
