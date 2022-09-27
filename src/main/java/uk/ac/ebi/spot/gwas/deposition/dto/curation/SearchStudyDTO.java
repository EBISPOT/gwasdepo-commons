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


    @JsonProperty("efoTrait")
    private String efoTrait;

    @JsonProperty("pmid")
    private String pmid;

    @JsonProperty("submissionId")
    private String submissionId;

    @JsonProperty("bowId")
    private String bowId;

    @JsonProperty("reportedTrait")
    private String reportedTrait;

    @JsonProperty("sumstatsFlag")
    private Boolean sumstatsFlag;

    @JsonProperty("pooledFlag")
    private Boolean pooledFlag;

    @JsonProperty("gxeFlag")
    private Boolean gxeFlag;

    @JsonProperty("note")
    private String note;

    @JsonProperty("accessionId")
    private String accessionId;

    public SearchStudyDTO(@JsonProperty("efo-trait") String efoTrait,
                          @JsonProperty("reported-trait") String reportedTrait,
                          @JsonProperty("pmid") String pmid,
                          @JsonProperty("submissionId") String submissionId,
                          @JsonProperty("bowId") String bowId,
                          @JsonProperty("sumstatsFlag") Boolean sumstatsFlag,
                          @JsonProperty("pooledFlag") Boolean pooledFlag,
                          @JsonProperty("gxeFlag") Boolean gxeFlag,
                          @JsonProperty("note") String note,
                          @JsonProperty("accessionId") String accessionId) {
        this.efoTrait = efoTrait;
        this.reportedTrait = reportedTrait;
        this.pmid = pmid;
        this.submissionId = submissionId;
        this.bowId = bowId;
        this.sumstatsFlag = sumstatsFlag;
        this.pooledFlag = pooledFlag;
        this.gxeFlag = gxeFlag;
        this.note = note;
        this.accessionId = accessionId;
    }


    public String getEfoTrait() {
        return efoTrait;
    }

    public String getReportedTrait() {
        return reportedTrait;
    }

    public String getPmid() {
        return pmid;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public String getBowId() {
        return bowId;
    }

    public Boolean getSumstatsFlag() {
        return sumstatsFlag;
    }

    public Boolean getPooledFlag() {
        return pooledFlag;
    }

    public Boolean getGxeFlag() {
        return gxeFlag;
    }

    public String getNote() {
        return note;
    }

    public String getAccessionId() {
        return accessionId;
    }
}
