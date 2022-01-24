package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchSubmissionDTO {

    private static final long serialVersionUID = -1758794003971528562L;

    @JsonProperty("pmid")
    public String pmid;

    @JsonProperty("bowId")
    public String bowId;

    @JsonProperty("metaStatus")
    public String metaStatus;

    @JsonProperty("ssStatus")
    public String ssStatus;

    @JsonProperty("submissionStatus")
    public String submissionStatus;

    @JsonProperty("lockStatus")
    public String lockStatus;

    public SearchSubmissionDTO(@JsonProperty("pmid") String pmid,
                               @JsonProperty("bowId") String bowId,
                               @JsonProperty("metaStatus") String metaStatus,
                               @JsonProperty("ssStatus") String ssStatus,
                               @JsonProperty("submissionStatus") String submissionStatus,
                               @JsonProperty("lockStatus") String lockStatus) {
        this.pmid = pmid;
        this.bowId = bowId;
        this.metaStatus = metaStatus;
        this.ssStatus = ssStatus;
        this.submissionStatus = submissionStatus;
        this.lockStatus = lockStatus;
    }

    public String getPmid() {
        return pmid;
    }

    public String getBowId() {
        return bowId;
    }

    public String getMetaStatus() {
        return metaStatus;
    }

    public String getSsStatus() {
        return ssStatus;
    }

    public String getSubmissionStatus() {
        return submissionStatus;
    }

    public String getLockStatus() {
        return lockStatus;
    }
}
