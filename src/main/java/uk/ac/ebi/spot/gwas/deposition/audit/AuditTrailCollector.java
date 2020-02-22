package uk.ac.ebi.spot.gwas.deposition.audit;

import uk.ac.ebi.spot.gwas.deposition.util.QueueAuditTrailDto;

import java.util.ArrayList;
import java.util.List;

public class AuditTrailCollector {

    private String queue;

    private List<String> auditTrail;

    private List<String> ids;

    public AuditTrailCollector(String queue) {
        this.queue = queue;
        this.auditTrail = new ArrayList<>();
        this.ids = new ArrayList<>();
    }

    public void addAuditEntry(String id, String auditHash) {
        this.ids.add(id);
        this.auditTrail.add(auditHash);
    }

    public QueueAuditTrailDto getAuditTrail() {
        return new QueueAuditTrailDto(queue, auditTrail);
    }

    public List<String> getIds() {
        return ids;
    }
}
