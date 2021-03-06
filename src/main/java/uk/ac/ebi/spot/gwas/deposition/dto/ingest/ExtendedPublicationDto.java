package uk.ac.ebi.spot.gwas.deposition.dto.ingest;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.EqualsAndHashCode;
import org.joda.time.LocalDate;
import uk.ac.ebi.spot.gwas.deposition.dto.CorrespondingAuthorDto;
import uk.ac.ebi.spot.gwas.deposition.dto.summarystats.SSTemplateEntryDto;
import uk.ac.ebi.spot.gwas.deposition.util.JsonJodaLocalDateDeserializer;
import uk.ac.ebi.spot.gwas.deposition.util.JsonJodaLocalDateSerializer;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ExtendedPublicationDto implements Serializable {

    private static final long serialVersionUID = -183037826658276173L;

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

    @JsonProperty("ssTemplateEntries")
    private final List<SSTemplateEntryDto> ssTemplateEntries;

    @JsonCreator
    public ExtendedPublicationDto(@JsonProperty("pmid") String pmid,
                                  @JsonProperty("title") String title,
                                  @JsonProperty("journal") String journal,
                                  @JsonProperty("firstAuthor") String firstAuthor,
                                  @JsonProperty("publicationDate") @JsonDeserialize(using = JsonJodaLocalDateDeserializer.class) LocalDate publicationDate,
                                  @JsonProperty("correspondingAuthor") CorrespondingAuthorDto correspondingAuthor,
                                  @JsonProperty("status") String status,
                                  @JsonProperty("ssTemplateEntries") List<SSTemplateEntryDto> ssTemplateEntries) {
        this.pmid = pmid;
        this.title = title;
        this.journal = journal;
        this.firstAuthor = firstAuthor;
        this.publicationDate = publicationDate;
        this.correspondingAuthor = correspondingAuthor;
        this.status = status;
        this.ssTemplateEntries = ssTemplateEntries;
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

    public List<SSTemplateEntryDto> getSsTemplateEntries() {
        return ssTemplateEntries;
    }
}
