package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;

@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchPublicationDTO {

    private static final long serialVersionUID = -4441942976925174984L;

    @JsonProperty("pmid")
    private String pmid;

    @JsonProperty("curator")
    private String curator;

    @JsonProperty("curationStatus")
    private String curationStatus;

    @JsonProperty("title")
    private String title;

    @JsonProperty("submitter")
    private String submitter;

    public SearchPublicationDTO(@JsonProperty("pmid") String pmid,
                                @JsonProperty("curator") String curator,
                                @JsonProperty("curationStatus") String curationStatus,
                                @JsonProperty("title") String title,
                                @JsonProperty("submitter") String submitter) {
        this.pmid = pmid;
        this.curator = curator;
        this.curationStatus = curationStatus;
        this.title = title;
        this.submitter = submitter;
    }

    public String getPmid() {
        return pmid;
    }

    public String getCurator() {
        return curator;
    }

    public String getCurationStatus() {
        return curationStatus;
    }

    public String getTitle() {
        return title;
    }

    public String getSubmitter() {
        return submitter;
    }
}
