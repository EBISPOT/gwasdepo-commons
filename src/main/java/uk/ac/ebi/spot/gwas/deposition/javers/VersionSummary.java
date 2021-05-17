package uk.ac.ebi.spot.gwas.deposition.javers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VersionSummary {


    @JsonProperty("currentVersionSummary")
    private CurrentVersionSummary currentVersionSummary;

    @JsonProperty("versionSummaryStats")
    private VersionSummaryStats versionSummaryStats;

    @JsonProperty("versionDiffStats")
    private VersionDiffStats versionDiffStats;

    @JsonProperty("oldFileDetails")
    private FileSummaryStats oldFileDetails;

    @JsonProperty("newFileDetails")
    private FileSummaryStats newFileDetails;


    public CurrentVersionSummary getCurrentVersionSummary() {
        return currentVersionSummary;
    }

    public void setCurrentVersionSummary(CurrentVersionSummary currentVersionSummary) {
        this.currentVersionSummary = currentVersionSummary;
    }

    public VersionSummaryStats getVersionSummaryStats() {
        return versionSummaryStats;
    }

    public void setVersionSummaryStats(VersionSummaryStats versionSummaryStats) {
        this.versionSummaryStats = versionSummaryStats;
    }

    public VersionDiffStats getVersionDiffStats() {
        return versionDiffStats;
    }

    public void setVersionDiffStats(VersionDiffStats versionDiffStats) {
        this.versionDiffStats = versionDiffStats;
    }

    public FileSummaryStats getOldFileDetails() {
        return oldFileDetails;
    }

    public void setOldFileDetails(FileSummaryStats oldFileDetails) {
        this.oldFileDetails = oldFileDetails;
    }

    public FileSummaryStats getNewFileDetails() {
        return newFileDetails;
    }

    public void setNewFileDetails(FileSummaryStats newFileDetails) {
        this.newFileDetails = newFileDetails;
    }
}
