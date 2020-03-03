package uk.ac.ebi.spot.gwas.deposition.dto.ingest;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.EqualsAndHashCode;
import org.joda.time.LocalDate;
import uk.ac.ebi.spot.gwas.deposition.dto.CorrespondingAuthorDto;
import uk.ac.ebi.spot.gwas.deposition.util.JsonJodaLocalDateDeserializer;
import uk.ac.ebi.spot.gwas.deposition.util.JsonJodaLocalDateSerializer;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ManuscriptDto implements Serializable {

    private static final long serialVersionUID = -3319925385278963907L;

    @JsonProperty("manuscriptId")
    private final String manuscriptId;

    @JsonProperty("journal")
    private final String journal;

    @NotEmpty
    @JsonProperty("title")
    private final String title;

    @JsonProperty("firstAuthor")
    private final String firstAuthor;

    @JsonProperty("submissionDate")
    @JsonSerialize(using = JsonJodaLocalDateSerializer.class)
    private final LocalDate submissionDate;

    @JsonProperty("acceptanceDate")
    @JsonSerialize(using = JsonJodaLocalDateSerializer.class)
    private final LocalDate acceptanceDate;

    @JsonProperty("correspondingAuthor")
    private final CorrespondingAuthorDto correspondingAuthor;

    @JsonProperty("status")
    private final String status;

    @JsonCreator
    public ManuscriptDto(@JsonProperty("manuscriptId") String manuscriptId,
                         @JsonProperty("title") String title,
                         @JsonProperty("journal") String journal,
                         @JsonProperty("firstAuthor") String firstAuthor,
                         @JsonProperty("submissionDate") @JsonDeserialize(using = JsonJodaLocalDateDeserializer.class) LocalDate submissionDate,
                         @JsonProperty("acceptanceDate") @JsonDeserialize(using = JsonJodaLocalDateDeserializer.class) LocalDate acceptanceDate,
                         @JsonProperty("correspondingAuthor") CorrespondingAuthorDto correspondingAuthor,
                         @JsonProperty("status") String status) {
        this.manuscriptId = manuscriptId;
        this.title = title;
        this.journal = journal;
        this.firstAuthor = firstAuthor;
        this.submissionDate = submissionDate;
        this.acceptanceDate = acceptanceDate;
        this.correspondingAuthor = correspondingAuthor;
        this.status = status;
    }

    public String getManuscriptId() {
        return manuscriptId;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public LocalDate getAcceptanceDate() {
        return acceptanceDate;
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

    public CorrespondingAuthorDto getCorrespondingAuthor() {
        return correspondingAuthor;
    }

    public String getStatus() {
        return status;
    }
}
