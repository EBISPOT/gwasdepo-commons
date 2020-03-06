package uk.ac.ebi.spot.gwas.deposition.audit;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AuditProxy {

    @Autowired(required = false)
    private AuditService auditService;

    @Async
    public void addAuditEntry(AuditEntryEnvelopeDto auditEntryEnvelopeDto) {
        if (auditService != null) {
            auditService.addAuditEntry(new AuditEntryDto(null,
                    auditEntryEnvelopeDto.getUserId(),
                    auditEntryEnvelopeDto.getAction(),
                    auditEntryEnvelopeDto.getOutcome(),
                    auditEntryEnvelopeDto.getEntityId(),
                    auditEntryEnvelopeDto.getContext(),
                    auditEntryEnvelopeDto.getMetadata(),
                    DateTime.now()));
        }
    }
}
