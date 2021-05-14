package uk.ac.ebi.spot.gwas.deposition.javers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentVersionSummary {

    @JsonProperty("totalStudies")
    private Integer totalStudies;

    @JsonProperty("totalAcscns")
    private Integer totalAssociations;

    @JsonProperty("totalSamples")
    private Integer totalSamples;

    public Integer getTotalStudies() {
        return totalStudies;
    }

    public void setTotalStudies(Integer totalStudies) {
        this.totalStudies = totalStudies;
    }

    public Integer getTotalAssociations() {
        return totalAssociations;
    }

    public void setTotalAssociations(Integer totalAssociations) {
        this.totalAssociations = totalAssociations;
    }

    public Integer getTotalSamples() {
        return totalSamples;
    }

    public void setTotalSamples(Integer totalSamples) {
        this.totalSamples = totalSamples;
    }
}
