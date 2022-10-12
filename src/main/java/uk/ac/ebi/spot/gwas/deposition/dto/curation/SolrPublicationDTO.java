package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import org.joda.time.LocalDate;
import org.springframework.hateoas.ResourceSupport;
import uk.ac.ebi.spot.gwas.deposition.util.JsonJodaLocalDateSerializer;

import java.io.Serializable;

@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SolrPublicationDTO extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = -6213537815539489447L;

    @JsonProperty("pmid")
    private String pmid;

    @JsonProperty("title")
    private String title;

    @JsonProperty("firstAuthor")
    private String firstAuthor;

    @JsonProperty("status")
    private String status;

    @JsonProperty("journal")
    private String journal;

    @JsonProperty("publicationDate")
    @JsonSerialize(using = JsonJodaLocalDateSerializer.class)
    private LocalDate publicationDate;

    @JsonProperty("correspondingAuthor")
    private String correspondingAuthor;

    @JsonProperty("curator")
    private String curator;

    @JsonProperty("curationStatus")
    private String curationStatus;

    @JsonProperty("submitter")
    private String submitter;

    public SolrPublicationDTO(@JsonProperty("pmid") String pmid,
                              @JsonProperty("title") String title,
                              @JsonProperty("firstAuthor") String firstAuthor,
                              @JsonProperty("status") String status,
                              @JsonProperty("journal") String journal,
                              @JsonProperty("publicationDate") LocalDate publicationDate,
                              @JsonProperty("correspondingAuthor") String correspondingAuthor,
                              @JsonProperty("curator") String curator,
                              @JsonProperty("curationStatus") String curationStatus,
                              @JsonProperty("submitter") String submitter) {
        this.pmid = pmid;
        this.title = title;
        this.firstAuthor = firstAuthor;
        this.status = status;
        this.journal = journal;
        this.publicationDate = publicationDate;
        this.correspondingAuthor = correspondingAuthor;
        this.curator = curator;
        this.curationStatus = curationStatus;
        this.submitter = submitter;
    }

    public String getPmid() {
        return pmid;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstAuthor() {
        return firstAuthor;
    }

    public String getStatus() {
        return status;
    }

    public String getJournal() {
        return journal;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public String getCorrespondingAuthor() {
        return correspondingAuthor;
    }

    public String getCurator() {
        return curator;
    }

    public String getCurationStatus() {
        return curationStatus;
    }

    public String getSubmitter() {
        return submitter;
    }
}
