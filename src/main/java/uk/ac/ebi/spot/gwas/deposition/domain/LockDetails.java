package uk.ac.ebi.spot.gwas.deposition.domain;

public class LockDetails {

    private Provenance lockedBy;

    private String status;

    public LockDetails(Provenance lockedBy, String status) {
        this.lockedBy = lockedBy;
        this.status = status;
    }

    public Provenance getLockedBy() {
        return lockedBy;
    }

    public String getStatus() {
        return status;
    }
}
