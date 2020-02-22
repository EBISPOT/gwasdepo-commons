package uk.ac.ebi.spot.gwas.deposition.audit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "queue-audit.enabled", havingValue = "true")
public class QueueAuditConfig {

    private static final String QUEUE_TOKEN = "QUEUE_TOKEN";

    @Value("${queue-audit.url:#{NULL}}")
    private String queueAuditUrl;

    @Value("${queue-audit.endpoint:#{NULL}}")
    private String queueAuditEndpoint;

    public String getQueueAuditEndpoint() {
        return queueAuditUrl + queueAuditEndpoint;
    }

    public String getQueueAuthToken() {
        return System.getenv(QUEUE_TOKEN);
    }
}
