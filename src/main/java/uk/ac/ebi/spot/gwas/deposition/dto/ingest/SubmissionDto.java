package uk.ac.ebi.spot.gwas.deposition.dto.ingest;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.EqualsAndHashCode;
import org.joda.time.LocalDate;
import uk.ac.ebi.spot.gwas.deposition.dto.*;
import uk.ac.ebi.spot.gwas.deposition.util.JsonJodaLocalDateDeserializer;
import uk.ac.ebi.spot.gwas.deposition.util.JsonJodaLocalDateSerializer;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SubmissionDto implements Serializable {

    private static final long serialVersionUID = 3158029215487618051L;

    @NotEmpty
    @JsonProperty("submissionId")
    private final String submissionId;

    @NotNull
    @JsonProperty("publication")
    private final PublicationDto publication;

    @NotEmpty
    @JsonProperty("status")
    private final String status;

    @JsonProperty("studies")
    private final List<StudyDto> studies;

    @JsonProperty("samples")
    private final List<SampleDto> samples;

    @JsonProperty("associations")
    private final List<AssociationDto> associations;

    @JsonProperty("notes")
    private final List<NoteDto> notes;

    @JsonProperty("globusFolder")
    private final String globusFolder;

    @JsonProperty("globusOriginId")
    private final String globusOriginId;

    @JsonProperty("date_submitted")
    @JsonSerialize(using = JsonJodaLocalDateSerializer.class)
    private final LocalDate dateSubmitted;

    @JsonProperty("created")
    private final ProvenanceDto created;

    @JsonCreator
    public SubmissionDto(@JsonProperty("submissionId") String submissionId,
                         @JsonProperty("publication") PublicationDto publication,
                         @JsonProperty("status") String status,
                         @JsonProperty("globusFolder") String globusFolder,
                         @JsonProperty("globusOriginId") String globusOriginId,
                         @JsonProperty("studies") List<StudyDto> studies,
                         @JsonProperty("associations") List<AssociationDto> associations,
                         @JsonProperty("samples") List<SampleDto> samples,
                         @JsonProperty("notes") List<NoteDto> notes,
                         @JsonProperty("date_submitted") @JsonDeserialize(using = JsonJodaLocalDateDeserializer.class) LocalDate dateSubmitted,
                         @JsonProperty("created") ProvenanceDto created) {
        this.submissionId = submissionId;
        this.publication = publication;
        this.status = status;
        this.globusFolder = globusFolder;
        this.globusOriginId = globusOriginId;
        this.studies = studies;
        this.associations = associations;
        this.samples = samples;
        this.notes = notes;
        this.dateSubmitted = dateSubmitted;
        this.created = created;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public PublicationDto getPublication() {
        return publication;
    }

    public String getStatus() {
        return status;
    }

    public List<StudyDto> getStudies() {
        return studies;
    }

    public List<SampleDto> getSamples() {
        return samples;
    }

    public List<AssociationDto> getAssociations() {
        return associations;
    }

    public List<NoteDto> getNotes() {
        return notes;
    }

    public LocalDate getDateSubmitted() {
        return dateSubmitted;
    }

    public ProvenanceDto getCreated() {
        return created;
    }

    public String getGlobusFolder() {
        return globusFolder;
    }

    public String getGlobusOriginId() {
        return globusOriginId;
    }
}
