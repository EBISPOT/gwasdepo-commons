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

    @JsonProperty("oldFileName")
    private String oldFileName;

    @JsonProperty("newFileName")
    private String newFileName;


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

    public String getOldFileName() {
        return oldFileName;
    }

    public void setOldFileName(String oldFileName) {
        this.oldFileName = oldFileName;
    }

    public String getNewFileName() {
        return newFileName;
    }

    public void setNewFileName(String newFileName) {
        this.newFileName = newFileName;
    }
}
