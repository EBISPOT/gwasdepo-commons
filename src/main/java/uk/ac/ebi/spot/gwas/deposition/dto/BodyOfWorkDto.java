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
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(value = "bodyofwork", collectionRelation = "bodyOfWorks")
public class BodyOfWorkDto extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = -3319925385278963907L;

    @JsonProperty("bodyOfWorkId")
    private final String bodyOfWorkId;

    @NotEmpty
    @JsonProperty("title")
    private final String title;

    @JsonProperty("description")
    private final String description;

    @JsonProperty("firstAuthor")
    private final AuthorDto firstAuthor;

    @JsonProperty("lastAuthor")
    private final AuthorDto lastAuthor;

    @JsonProperty("journal")
    private final String journal;

    @JsonProperty("doi")
    private final String doi;

    @JsonProperty("url")
    private final String url;

    @JsonProperty("correspondingAuthors")
    private final List<AuthorDto> correspondingAuthors;

    @JsonProperty("prePrintServer")
    private final String prePrintServer;

    @JsonProperty("preprintServerDOI")
    private final String preprintServerDOI;

    @JsonProperty("embargoDate")
    @JsonSerialize(using = JsonJodaLocalDateSerializer.class)
    private final LocalDate embargoDate;

    @JsonProperty("embargoUntilPublished")
    private final Boolean embargoUntilPublished;

    @JsonProperty("pmids")
    private final List<String> pmids;

    @JsonProperty("status")
    private final String status;

    @JsonCreator
    public BodyOfWorkDto(@JsonProperty("bodyOfWorkId") String bodyOfWorkId,
                         @JsonProperty("title") String title,
                         @JsonProperty("description") String description,
                         @JsonProperty("firstAuthor") AuthorDto firstAuthor,
                         @JsonProperty("lastAuthor") AuthorDto lastAuthor,
                         @JsonProperty("journal") String journal,
                         @JsonProperty("doi") String doi,
                         @JsonProperty("url") String url,
                         @JsonProperty("correspondingAuthors") List<AuthorDto> correspondingAuthors,
                         @JsonProperty("prePrintServer") String prePrintServer,
                         @JsonProperty("preprintServerDOI") String preprintServerDOI,
                         @JsonProperty("embargoDate") @JsonDeserialize(using = JsonJodaLocalDateDeserializer.class) LocalDate embargoDate,
                         @JsonProperty("embargoUntilPublished") Boolean embargoUntilPublished,
                         @JsonProperty("pmids") List<String> pmids,
                         @JsonProperty("status") String status) {
        this.bodyOfWorkId = bodyOfWorkId;
        this.title = title;
        this.description = description;
        this.firstAuthor = firstAuthor;
        this.lastAuthor = lastAuthor;
        this.journal = journal;
        this.doi = doi;
        this.url = url;
        this.correspondingAuthors = correspondingAuthors;
        this.prePrintServer = prePrintServer;
        this.preprintServerDOI = preprintServerDOI;
        this.embargoDate = embargoDate;
        this.embargoUntilPublished = embargoUntilPublished;
        this.pmids = pmids;
        this.status = status;
    }

    public String getBodyOfWorkId() {
        return bodyOfWorkId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public AuthorDto getFirstAuthor() {
        return firstAuthor;
    }

    public AuthorDto getLastAuthor() {
        return lastAuthor;
    }

    public List<AuthorDto> getCorrespondingAuthors() {
        return correspondingAuthors;
    }

    public String getJournal() {
        return journal;
    }

    public String getDoi() {
        return doi;
    }

    public String getUrl() {
        return url;
    }

    public String getPrePrintServer() {
        return prePrintServer;
    }

    public String getPreprintServerDOI() {
        return preprintServerDOI;
    }

    public LocalDate getEmbargoDate() {
        return embargoDate;
    }

    public Boolean getEmbargoUntilPublished() {
        return embargoUntilPublished;
    }

    public List<String> getPmids() {
        return pmids;
    }

    public String getStatus() {
        return status;
    }
}
