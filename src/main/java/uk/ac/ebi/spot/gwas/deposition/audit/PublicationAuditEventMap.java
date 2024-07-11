package uk.ac.ebi.spot.gwas.deposition.audit;

import org.springframework.stereotype.Component;
import uk.ac.ebi.spot.gwas.deposition.audit.constants.PublicationEventType;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class PublicationAuditEventMap {

    private Map<String, String> auditEventMap = new HashMap<>();

    public void populateEventMap() {
        this.auditEventMap.put(PublicationEventType.SUBMISSION_CREATED.name(), "Submission created");
        this.auditEventMap.put(PublicationEventType.TEMPLATE_UPLOAD.name(), "Template uploaded");
        this.auditEventMap.put(PublicationEventType.CURATION_STATUS_UPDATED.name(), "Curation status updated");
        this.auditEventMap.put(PublicationEventType.CURATOR_UPDATED.name(), "Curator updated");
        this.auditEventMap.put(PublicationEventType.PMID_CREATED.name(), "Publication created in database");
        this.auditEventMap.put(PublicationEventType.PMID_ADDED.name(), "PMID added to submission");
        this.auditEventMap.put(PublicationEventType.SUBMISSION_UPDATE.name(), "Submission updated");
        this.auditEventMap.put(PublicationEventType.TRAIT_UPDATED.name(), "Trait updated");
        this.auditEventMap.put(PublicationEventType.SAMPLE_UPDATED.name(), "Sample updated");
        this.auditEventMap.put(PublicationEventType.SNP_APPROVED.name(), "Associations approved");
        this.auditEventMap.put(PublicationEventType.IMPORTED.name(), "Imported to curation database");
        this.auditEventMap.put(PublicationEventType.MAPPING_COMPLETE.name(), "Mapping complete");
        this.auditEventMap.put(PublicationEventType.SS_VALIDATION_FAILED.name(), "Failed validation of sumstats");
        this.auditEventMap.put(PublicationEventType.SS_VALIDATION_SUCCESS.name(), "Successful validation of sumstats");
        this.auditEventMap.put(PublicationEventType.METADATA_VALIDATION_FAILED.name(), "Failed validation of metadata");
        this.auditEventMap.put(PublicationEventType.METADATA_VALIDATION_SUCCESS.name(), "Successful validation of metadata");
    }

    public Map<String, String> getAuditEventMap() {
        return this.auditEventMap;
    }


    @PostConstruct
    public void init() {
        populateEventMap();
    }
}
