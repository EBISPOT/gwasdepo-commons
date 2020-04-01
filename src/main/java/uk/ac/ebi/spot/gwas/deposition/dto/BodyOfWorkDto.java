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
@Relation(value = "manuscript", collectionRelation = "manuscripts")
public class BodyOfWorkDto extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = -3319925385278963907L;

    @JsonProperty("manuscriptId")
    private final String manuscriptId;

    @NotEmpty
    @JsonProperty("title")
    private final String title;

    @JsonProperty("description")
    private final String description;

    @JsonProperty("firstAuthorFirstName")
    private final String firstAuthorFirstName;

    @JsonProperty("firstAuthorLastName")
    private final String firstAuthorLastName;

    @JsonProperty("journal")
    private final String journal;

    @JsonProperty("doi")
    private final String doi;

    @JsonProperty("url")
    private final String url;

    @JsonProperty("correspondingAuthors")
    private final List<CorrespondingAuthorDto> correspondingAuthors;

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
    public BodyOfWorkDto(@JsonProperty("manuscriptId") String manuscriptId,
                         @JsonProperty("title") String title,
                         @JsonProperty("description") String description,
                         @JsonProperty("firstAuthorFirstName") String firstAuthorFirstName,
                         @JsonProperty("firstAuthorLastName") String firstAuthorLastName,
                         @JsonProperty("journal") String journal,
                         @JsonProperty("doi") String doi,
                         @JsonProperty("url") String url,
                         @JsonProperty("correspondingAuthors") List<CorrespondingAuthorDto> correspondingAuthors,
                         @JsonProperty("prePrintServer") String prePrintServer,
                         @JsonProperty("preprintServerDOI") String preprintServerDOI,
                         @JsonProperty("embargoDate") @JsonDeserialize(using = JsonJodaLocalDateDeserializer.class) LocalDate embargoDate,
                         @JsonProperty("embargoUntilPublished") Boolean embargoUntilPublished,
                         @JsonProperty("pmids") List<String> pmids,
                         @JsonProperty("status") String status) {
        this.manuscriptId = manuscriptId;
        this.title = title;
        this.description = description;
        this.firstAuthorFirstName = firstAuthorFirstName;
        this.firstAuthorLastName = firstAuthorLastName;
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

    public String getManuscriptId() {
        return manuscriptId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getFirstAuthorFirstName() {
        return firstAuthorFirstName;
    }

    public String getFirstAuthorLastName() {
        return firstAuthorLastName;
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

    public List<CorrespondingAuthorDto> getCorrespondingAuthors() {
        return correspondingAuthors;
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
