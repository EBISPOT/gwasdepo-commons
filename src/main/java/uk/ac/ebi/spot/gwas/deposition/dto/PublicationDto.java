package uk.ac.ebi.spot.gwas.deposition.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.EqualsAndHashCode;
import org.joda.time.LocalDate;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.core.Relation;
import uk.ac.ebi.spot.gwas.deposition.util.JsonJodaLocalDateDeserializer;
import uk.ac.ebi.spot.gwas.deposition.util.JsonJodaLocalDateSerializer;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(value = "publication", collectionRelation = "publications")
public class PublicationDto extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = 4614819124284486530L;

    @JsonProperty("publicationId")
    private final String publicationId;

    @NotEmpty
    @JsonProperty("pmid")
    private final String pmid;

    @NotEmpty
    @JsonProperty("journal")
    private final String journal;

    @NotEmpty
    @JsonProperty("title")
    private final String title;

    @NotEmpty
    @JsonProperty("firstAuthor")
    private final String firstAuthor;

    @NotNull
    @JsonProperty("publicationDate")
    @JsonSerialize(using = JsonJodaLocalDateSerializer.class)
    private final LocalDate publicationDate;

    @JsonProperty("correspondingAuthor")
    private final CorrespondingAuthorDto correspondingAuthor;

    @JsonProperty("status")
    private final String status;

    @JsonCreator
    public PublicationDto(@JsonProperty("publicationId") String publicationId,
                          @JsonProperty("pmid") String pmid,
                          @JsonProperty("title") String title,
                          @JsonProperty("journal") String journal,
                          @JsonProperty("firstAuthor") String firstAuthor,
                          @JsonProperty("publicationDate") @JsonDeserialize(using = JsonJodaLocalDateDeserializer.class) LocalDate publicationDate,
                          @JsonProperty("correspondingAuthor") CorrespondingAuthorDto correspondingAuthor,
                          @JsonProperty("status") String status) {
        this.publicationId = publicationId;
        this.pmid = pmid;
        this.title = title;
        this.journal = journal;
        this.firstAuthor = firstAuthor;
        this.publicationDate = publicationDate;
        this.correspondingAuthor = correspondingAuthor;
        this.status = status;
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
}
