package uk.ac.ebi.spot.gwas.deposition.dto.curation;

public class SnpStatusReportDto {

    private Integer noApprovedSnps;

    private Integer noValidSnps;

    public Integer getNoApprovedSnps() {
        return noApprovedSnps;
    }

    public void setNoApprovedSnps(Integer noApprovedSnps) {
        this.noApprovedSnps = noApprovedSnps;
    }

    public Integer getNoValidSnps() {
        return noValidSnps;
    }

    public void setNoValidSnps(Integer noValidSnps) {
        this.noValidSnps = noValidSnps;
    }
}
