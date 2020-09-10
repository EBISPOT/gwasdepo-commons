package uk.ac.ebi.spot.gwas.deposition.audit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AuditProxy {

    @Autowired(required = false)
    private AuditService auditService;

    @Async
    public void addAuditEntry(AuditEntryDto auditEntryDto) {
        if (auditService != null) {
            auditService.addAuditEntry(auditEntryDto);
        }
    }
}
