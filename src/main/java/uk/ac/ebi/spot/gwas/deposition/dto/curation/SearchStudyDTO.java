package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchStudyDTO {

    private static final long serialVersionUID = -5261952713215430422L;

    @JsonProperty("gcst")
    private String gcst;

    @JsonProperty("efo-trait")
    private String efoTrait;

    @JsonProperty("reported-trait")
    private String reportedTrait;

    @JsonProperty("study-flag")
    private String studyFlag;

    @JsonProperty("note")
    private String note;

    public SearchStudyDTO(@JsonProperty("gcst") String gcst,
                          @JsonProperty("efo-trait") String efoTrait,
                          @JsonProperty("reported-trait") String reportedTrait,
                          @JsonProperty("study-flag") String studyFlag,
                          @JsonProperty("note") String note) {
        this.gcst = gcst;
        this.efoTrait = efoTrait;
        this.reportedTrait = reportedTrait;
        this.studyFlag = studyFlag;
        this.note = note;
    }

    public String getGcst() {
        return gcst;
    }

    public String getEfoTrait() {
        return efoTrait;
    }

    public String getReportedTrait() {
        return reportedTrait;
    }

    public String getStudyFlag() {
        return studyFlag;
    }

    public String getNote() {
        return note;
    }
}
