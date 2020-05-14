package uk.ac.ebi.spot.gwas.deposition.dto.templateschema.gcst;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SSTemplateGCSTStudyDto implements Serializable {

    private static final long serialVersionUID = 3311730612323427379L;

    @JsonProperty("study_tag")
    private final String studyTag;

    @JsonProperty("study_accession")
    private final String studyAccession;

    @JsonProperty("trait")
    private final String trait;

    @JsonProperty("efo_trait")
    private final String efoTrait;

    @JsonProperty("background_trait")
    private final String backgroundTrait;

    @JsonProperty("background_efo_trait")
    private final String backgroundEfoTrait;

    @JsonProperty("summary_statistics_file")
    private final String summaryStatisticsFile;

    @JsonCreator
    public SSTemplateGCSTStudyDto(@JsonProperty("study_accession") String studyAccession,
                                  @JsonProperty("study_tag") String studyTag,
                                  @JsonProperty("trait") String trait,
                                  @JsonProperty("efo_trait") String efoTrait,
                                  @JsonProperty("background_trait") String backgroundTrait,
                                  @JsonProperty("background_efo_trait") String backgroundEfoTrait,
                                  @JsonProperty("summary_statistics_file") String summaryStatisticsFile) {
        this.studyAccession = studyAccession;
        this.studyTag = studyTag;
        this.trait = trait;
        this.efoTrait = efoTrait;
        this.backgroundTrait = backgroundTrait;
        this.backgroundEfoTrait = backgroundEfoTrait;
        this.summaryStatisticsFile = summaryStatisticsFile;
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

    public String getEfoTrait() {
        return efoTrait;
    }

    public String getBackgroundTrait() {
        return backgroundTrait;
    }

    public String getBackgroundEfoTrait() {
        return backgroundEfoTrait;
    }

    public String getSummaryStatisticsFile() {
        return summaryStatisticsFile;
    }
}
