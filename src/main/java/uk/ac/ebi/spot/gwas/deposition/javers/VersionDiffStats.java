package uk.ac.ebi.spot.gwas.deposition.javers;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class VersionDiffStats {

    @JsonProperty("entity")
    private String entity;


    @JsonProperty("ascnadded")
    private Integer ascnsAdded;

    @JsonProperty("ascnremoved")
    private Integer ascnsRemoved;

    @JsonProperty("sampleadded")
    private Integer samplesAdded;

    @JsonProperty("samplesremoved")
    private Integer samplesRemoved;

    @JsonProperty("studyTagsAdded")
    private String studyTagsAdded;

    @JsonProperty("studyTagsRemoved")
    private String studyTagsRemoved;

    @JsonProperty("edited")
    List<DiffPropertyObject> edited;

    @JsonProperty("studies")
    List<VersionDiffStats> studies;

    @JsonProperty("associations")
    List<VersionDiffStats> associations;

    @JsonProperty("samples")
    List<VersionDiffStats> sampleGroups;


    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getEntity() {
        return entity;
    }



    public void setEdited(List<DiffPropertyObject> edited) {
        this.edited = edited;
    }

    public List<DiffPropertyObject> getEdited() {
        return edited;
    }

    public List<VersionDiffStats> getStudies() {
        return studies;
    }

    public void setStudies(List<VersionDiffStats> studies) {
        this.studies = studies;
    }

    public List<VersionDiffStats> getAssociations() {
        return associations;
    }

    public void setAssociations(List<VersionDiffStats> associations) {
        this.associations = associations;
    }

    public List<VersionDiffStats> getSampleGroups() {
        return sampleGroups;
    }

    public void setSampleGroups(List<VersionDiffStats> sampleGroups) {
        this.sampleGroups = sampleGroups;
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

    public String getStudyTagsAdded() {
        return studyTagsAdded;
    }

    public void setStudyTagsAdded(String studyTagsAdded) {
        this.studyTagsAdded = studyTagsAdded;
    }

    public String getStudyTagsRemoved() {
        return studyTagsRemoved;
    }

    public void setStudyTagsRemoved(String studyTagsRemoved) {
        this.studyTagsRemoved = studyTagsRemoved;
    }
}
