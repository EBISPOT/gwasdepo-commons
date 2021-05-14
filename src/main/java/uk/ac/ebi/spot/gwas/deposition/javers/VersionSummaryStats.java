package uk.ac.ebi.spot.gwas.deposition.javers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VersionSummaryStats {

    @JsonProperty("studiesAdded")
    private Integer studiesAdded;

    @JsonProperty("studiesRemoved")
    private Integer studiesRemoved;

    @JsonProperty("ascnsAdded")
    private Integer ascnsAdded;

    @JsonProperty("ascnsRemoved")
    private Integer ascnsRemoved;

    @JsonProperty("samplesAdded")
    private Integer samplesAdded;

    @JsonProperty("samplesRemoved")
    private Integer samplesRemoved;


    @JsonProperty("reportedTraitsAdded")
    private Integer reportedTraitsAdded;

    @JsonProperty("efoTraitsAdded")
    private Integer efoTraitsAdded;

    public Integer getStudiesAdded() {
        return studiesAdded;
    }

    public void setStudiesAdded(Integer studiesAdded) {
        this.studiesAdded = studiesAdded;
    }

    public Integer getStudiesRemoved() {
        return studiesRemoved;
    }

    public void setStudiesRemoved(Integer studiesRemoved) {
        this.studiesRemoved = studiesRemoved;
    }

    public Integer getAscnsAdded() {
        return ascnsAdded;
    }

    public void setAscnsAdded(Integer ascnsAdded) {
        this.ascnsAdded = ascnsAdded;
    }

    public Integer getAscnsRemoved() {
        return ascnsRemoved;
    }

    public void setAscnsRemoved(Integer ascnsRemoved) {
        this.ascnsRemoved = ascnsRemoved;
    }

    public Integer getSamplesAdded() {
        return samplesAdded;
    }

    public void setSamplesAdded(Integer samplesAdded) {
        this.samplesAdded = samplesAdded;
    }

    public Integer getSamplesRemoved() {
        return samplesRemoved;
    }

    public void setSamplesRemoved(Integer samplesRemoved) {
        this.samplesRemoved = samplesRemoved;
    }

    public Integer getReportedTraitsAdded() {
        return reportedTraitsAdded;
    }

    public void setReportedTraitsAdded(Integer reportedTraitsAdded) {
        this.reportedTraitsAdded = reportedTraitsAdded;
    }

    public Integer getEfoTraitsAdded() {
        return efoTraitsAdded;
    }

    public void setEfoTraitsAdded(Integer efoTraitsAdded) {
        this.efoTraitsAdded = efoTraitsAdded;
    }
}
