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
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SubmissionDto implements Serializable {

    private static final long serialVersionUID = 3158029215487618051L;

    @NotEmpty
    @JsonProperty("submissionId")
    private final String submissionId;

    @JsonProperty("publication")
    private final PublicationDto publication;

    @JsonProperty("bodyOfWork")
    private final BodyOfWorkDto bodyOfWork;

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

    @JsonProperty("provenanceType")
    private final String provenanceType;

    @JsonProperty("date_submitted")
    @JsonSerialize(using = JsonJodaLocalDateSerializer.class)
    private final LocalDate dateSubmitted;

    @JsonProperty("created")
    private final ProvenanceDto created;

    @JsonProperty("metadata")
    private final MetadataDto metadata;

    @JsonProperty("agreedToCc0")
    private final Boolean agreedToCc0;

    @JsonProperty("opentargets_flag")
    private final Boolean openTargetsFlag;

    @JsonProperty("userrequested_flag")
    private final Boolean userRequestedFlag;

    @JsonCreator
    public SubmissionDto(@JsonProperty("submissionId") String submissionId,
                         @JsonProperty("publication") PublicationDto publication,
                         @JsonProperty("bodyOfWork") BodyOfWorkDto bodyOfWork,
                         @JsonProperty("provenanceType") String provenanceType,
                         @JsonProperty("status") String status,
                         @JsonProperty("globusFolder") String globusFolder,
                         @JsonProperty("globusOriginId") String globusOriginId,
                         @JsonProperty("studies") List<StudyDto> studies,
                         @JsonProperty("associations") List<AssociationDto> associations,
                         @JsonProperty("samples") List<SampleDto> samples,
                         @JsonProperty("notes") List<NoteDto> notes,
                         @JsonProperty("date_submitted") @JsonDeserialize(using = JsonJodaLocalDateDeserializer.class) LocalDate dateSubmitted,
                         @JsonProperty("metadata") MetadataDto metadata,
                         @JsonProperty("created") ProvenanceDto created,
                         @JsonProperty("agreedToCc0") Boolean agreedToCc0,
                         @JsonProperty("opentargets_flag") Boolean openTargetsFlag,
                         @JsonProperty("userrequested_flag") Boolean userRequestedFlag) {
        this.submissionId = submissionId;
        this.publication = publication;
        this.bodyOfWork = bodyOfWork;
        this.provenanceType = provenanceType;
        this.status = status;
        this.globusFolder = globusFolder;
        this.globusOriginId = globusOriginId;
        this.studies = studies;
        this.associations = associations;
        this.samples = samples;
        this.notes = notes;
        this.dateSubmitted = dateSubmitted;
        this.metadata = metadata;
        this.created = created;
        this.agreedToCc0 = agreedToCc0;
        this.openTargetsFlag = openTargetsFlag;
        this.userRequestedFlag = userRequestedFlag;
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

    public BodyOfWorkDto getBodyOfWork() {
        return bodyOfWork;
    }

    public String getProvenanceType() {
        return provenanceType;
    }

    public MetadataDto getMetadata() {
        return metadata;
    }

    public Boolean isAgreedToCc0() {
        return agreedToCc0;
    }

    public Boolean getOpenTargetsFlag() {
        return openTargetsFlag;
    }

    public Boolean getUserRequestedFlag() {
        return userRequestedFlag;
    }
}
