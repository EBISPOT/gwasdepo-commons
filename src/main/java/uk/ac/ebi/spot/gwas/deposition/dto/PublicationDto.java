package uk.ac.ebi.spot.gwas.deposition.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import org.joda.time.LocalDate;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.core.Relation;
import uk.ac.ebi.spot.gwas.deposition.dto.curation.CurationStatusDTO;
import uk.ac.ebi.spot.gwas.deposition.dto.curation.CuratorDTO;
import uk.ac.ebi.spot.gwas.deposition.dto.curation.PublicationAuthorDto;
import uk.ac.ebi.spot.gwas.deposition.util.JsonJodaLocalDateDeserializer;
import uk.ac.ebi.spot.gwas.deposition.util.JsonJodaLocalDateSerializer;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@Builder
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(value = "publication", collectionRelation = "publications")
public class PublicationDto extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = 4614819124284486530L;

    @JsonProperty("publicationId")
    private final String publicationId;

    @JsonProperty("pmid")
    private final String pmid;

    @JsonProperty("journal")
    private final String journal;

    @NotEmpty
    @JsonProperty("title")
    private final String title;

    @JsonProperty("firstAuthor")
    private final String firstAuthor;

    @JsonProperty("publicationDate")
    @JsonSerialize(using = JsonJodaLocalDateSerializer.class)
    private final LocalDate publicationDate;

    @JsonProperty("correspondingAuthor")
    private final CorrespondingAuthorDto correspondingAuthor;

    @JsonProperty("status")
    private final String status;


    @JsonProperty("created")
    private  ProvenanceDto created;

    @JsonProperty("updated")
    private  ProvenanceDto updated;

    @JsonProperty("authors")
    private List<PublicationAuthorDto> authors;

    @JsonProperty("curationStatus")
    private CurationStatusDTO curationStatus;

    @JsonProperty("curator")
    private CuratorDTO curator;

    @JsonProperty("submitter")
    private String submitter;


    @JsonCreator
    public PublicationDto(@JsonProperty("publicationId") String publicationId,
                          @JsonProperty("pmid") String pmid,
                          @JsonProperty("journal") String journal,
                          @JsonProperty("title") String title,
                          @JsonProperty("firstAuthor") String firstAuthor,
                          @JsonProperty("publicationDate") @JsonDeserialize(using = JsonJodaLocalDateDeserializer.class) LocalDate publicationDate,
                          @JsonProperty("correspondingAuthor") CorrespondingAuthorDto correspondingAuthor,
                          @JsonProperty("status") String status,
                          @JsonProperty("created") ProvenanceDto created,
                          @JsonProperty("updated") ProvenanceDto updated,
                          @JsonProperty("authors") List<PublicationAuthorDto> authors,
                          @JsonProperty("curationStatus") CurationStatusDTO curationStatus,
                          @JsonProperty("curator") CuratorDTO curator,
                          @JsonProperty("submitter") String submitter) {
        this.publicationId = publicationId;
        this.pmid = pmid;
        this.title = title;
        this.journal = journal;
        this.firstAuthor = firstAuthor;
        this.publicationDate = publicationDate;
        this.correspondingAuthor = correspondingAuthor;
        this.status = status;
        this.created = created;
        this.updated = updated;
        this.authors = authors;
        this.curationStatus = curationStatus;
        this.curator = curator;
        this.submitter = submitter;
    }

    public String getPublicationId() {
        return publicationId;
    }

    public String getPmid() {
        return pmid;
    }

    public String getJournal() {
        return journal;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstAuthor() {
        return firstAuthor;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public CorrespondingAuthorDto getCorrespondingAuthor() {
        return correspondingAuthor;
    }

    public String getStatus() {
        return status;
    }

    public ProvenanceDto getCreated() {
        return created;
    }

    public void setCreated(ProvenanceDto created) {
        this.created = created;
    }

    public ProvenanceDto getUpdated() {
        return updated;
    }

    public void setUpdated(ProvenanceDto updated) {
        this.updated = updated;
    }

    public List<PublicationAuthorDto> getAuthors() {
        return authors;
    }

    public void setAuthors(List<PublicationAuthorDto> authors) {
        this.authors = authors;
    }

    public CurationStatusDTO getCurationStatus() {
        return curationStatus;
    }

    public void setCurationStatus(CurationStatusDTO curationStatus) {
        this.curationStatus = curationStatus;
    }

    public CuratorDTO getCurator() {
        return curator;
    }

    public void setCurator(CuratorDTO curator) {
        this.curator = curator;
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }
}
