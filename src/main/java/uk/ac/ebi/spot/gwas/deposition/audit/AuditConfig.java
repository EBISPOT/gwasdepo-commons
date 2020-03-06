package uk.ac.ebi.spot.gwas.deposition.audit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "audit.enabled", havingValue = "true")
public class AuditConfig {

    @Value("${audit.url}")
    private String auditServiceUrl;

    @Value("${audit.endpoints.audit-entries}")
    private String auditEntriesEndpoint;

    public String getAuditServiceUrl() {
        return auditServiceUrl;
    }

    public String getAuditEntriesEndpoint() {
        return auditServiceUrl + auditEntriesEndpoint;
    }
}
