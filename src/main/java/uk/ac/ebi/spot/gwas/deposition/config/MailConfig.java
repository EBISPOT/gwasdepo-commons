package uk.ac.ebi.spot.gwas.deposition.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "email.enabled", havingValue = "true")
public class MailConfig {

    @Value("${email.config.from-address:#{NULL}}")
    private String fromAddress;

    @Value("${email.config.from-name:#{NULL}}")
    private String fromName;

    @Value("${email.config.retries:3}")
    private int retryCount;

    public String getFromAddress() {
        return fromAddress;
    }

    public String getFromName() {
        return fromName;
    }

    public int getRetryCount() {
        return retryCount;
    }

}
