package uk.ac.ebi.spot.gwas.deposition.dto.curation;

public enum ImportStatus {
    READY("Ready"),
    NOT_READY("Not ready");

    public final String label;

    private ImportStatus(String label) {
        this.label = label;
    }
}