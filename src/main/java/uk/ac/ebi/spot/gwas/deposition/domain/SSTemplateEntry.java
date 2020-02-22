package uk.ac.ebi.spot.gwas.deposition.domain;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class SSTemplateEntry {

    private String studyAccession;

    private String studyTag;

    private String trait;

    private String sampleDescription;

    private Boolean hasSummaryStats;

    public SSTemplateEntry(String studyAccession, String studyTag, String trait, String sampleDescription, Boolean hasSummaryStats) {
        this.studyAccession = studyAccession;
        this.studyTag = studyTag;
        this.trait = trait;
        this.sampleDescription = sampleDescription;
        this.hasSummaryStats = hasSummaryStats;
    }

    public String getStudyTag() {
        return studyTag;
    }

    public String getStudyAccession() {
        return studyAccession;
    }

    public String getTrait() {
        return trait;
    }

    public String getSampleDescription() {
        return sampleDescription;
    }

    public Boolean getHasSummaryStats() {
        return hasSummaryStats;
    }
}
