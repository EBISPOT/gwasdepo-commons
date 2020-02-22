package uk.ac.ebi.spot.gwas.deposition.dto.summarystats;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SSTemplateEntryDto implements Serializable {

    private static final long serialVersionUID = 5691025752742183894L;

    @JsonProperty("study_tag")
    private final String studyTag;

    @JsonProperty("study_accession")
    private final String studyAccession;

    @JsonProperty("trait")
    private final String trait;

    @JsonProperty("sample_description")
    private final String sampleDescription;

    @JsonProperty("hasSummaryStats")
    private final Boolean hasSummaryStats;

    @JsonCreator
    public SSTemplateEntryDto(@JsonProperty("study_accession") String studyAccession,
                              @JsonProperty("study_tag") String studyTag,
                              @JsonProperty("trait") String trait,
                              @JsonProperty("sample_description") String sampleDescription,
                              @JsonProperty("hasSummaryStats") Boolean hasSummaryStats) {
        this.studyAccession = studyAccession;
        this.studyTag = studyTag;
        this.trait = trait;
        this.sampleDescription = sampleDescription;
        this.hasSummaryStats = hasSummaryStats;
    }

    public String getStudyAccession() {
        return studyAccession;
    }


    public String getStudyTag() {
        return studyTag;
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
