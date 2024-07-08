package uk.ac.ebi.spot.gwas.deposition.audit.constants;

public enum PublicationEventType {


     SUBMISSION_CREATED("Submission created"),
    TEMPLATE_UPLOAD("Template uploaded"),
    CURATION_STATUS_UPDATED("Curation status updated"),
    CURATOR_UPDATED("Curator updated"),
    PMID_CREATED("Publication created in database"),
    PMID_ADDED("PMID added to submission"),
    SUBMISSION_UPDATE("Submission updated"),
    TRAIT_UPDATED("Trait updated"),
    SAMPLE_UPDATED("Sample updated"),
    SNP_APPROVED("Associations approved"),
    IMPORTED("Imported to curation database"),
    MAPPING_COMPLETE("Mapping complete"),
    SS_VALIDATION_FAILED("Failed validation of sumstats"),
    SS_VALIDATION_SUCCESS("Successful validation of sumstats"),
    METADATA_VALIDATION_FAILED("Failed validation of metadata"),
    METADATA_VALIDATION_SUCCESS("Successful validation of metadata");

    private String value = null;
    PublicationEventType(String value) {
        this.value = value;
    }
}
