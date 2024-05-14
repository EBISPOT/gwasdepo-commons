package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.LocalDate;
import uk.ac.ebi.spot.gwas.deposition.dto.ingest.BodyOfWorkDto;
import uk.ac.ebi.spot.gwas.deposition.util.JsonJodaLocalDateDeserializer;
import uk.ac.ebi.spot.gwas.deposition.util.JsonJodaLocalDateSerializer;

import java.util.List;

@Data
//@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepositionSubmission {

    @JsonProperty("submissionId")
    private String submissionId;

    @JsonProperty("publication")
    private DepositionPublication publication;

    @JsonProperty("bodyOfWork")
    private BodyOfWorkDto bodyOfWork;


    @JsonProperty("status")
    private String status;

    @JsonProperty("studies")
    private List<DepositionStudyDto> studies;

    @JsonProperty("samples")
    private List<DepositionSampleDto> samples;

    @JsonProperty("associations")
    private List<DepositionAssociationDto> associations;

    @JsonProperty("notes")
    private List<DepositionNoteDto> notes;

    @JsonProperty("globusFolder")
    private String globusFolder;

    @JsonProperty("globusOriginId")
    private String globusOriginId;

    @JsonProperty("provenanceType")
    private String provenanceType;

    @JsonProperty("date_submitted")
    @JsonDeserialize(using = JsonJodaLocalDateDeserializer.class)
    private LocalDate dateSubmitted;

    @JsonProperty("created")
    private DepositionProvenance created;

    @JsonProperty("agreedToCc0")
    private Boolean agreedToCc0;


    public DepositionSubmission(@JsonProperty("submissionId") String submissionId,
                                @JsonProperty("publication") DepositionPublication publication,
                                @JsonProperty("bodyOfWork") BodyOfWorkDto bodyOfWork,
                                @JsonProperty("status") String status,
                                @JsonProperty("studies") List<DepositionStudyDto> studies,
                                @JsonProperty("samples") List<DepositionSampleDto> samples,
                                @JsonProperty("associations") List<DepositionAssociationDto> associations,
                                @JsonProperty("notes") List<DepositionNoteDto> notes,
                                @JsonProperty("globusFolder") String globusFolder,
                                @JsonProperty("globusOriginId") String globusOriginId,
                                @JsonProperty("provenanceType") String provenanceType,
                                @JsonProperty("date_submitted") @JsonDeserialize(using = JsonJodaLocalDateDeserializer.class) LocalDate dateSubmitted,
                                @JsonProperty("created") DepositionProvenance created,
                                @JsonProperty("agreedToCc0") Boolean agreedToCc0) {
        this.submissionId = submissionId;
        this.publication = publication;
        this.bodyOfWork = bodyOfWork;
        this.status = status;
        this.studies = studies;
        this.samples = samples;
        this.associations = associations;
        this.notes = notes;
        this.globusFolder = globusFolder;
        this.globusOriginId = globusOriginId;
        this.provenanceType = provenanceType;
        this.dateSubmitted = dateSubmitted;
        this.created = created;
        this.agreedToCc0 = agreedToCc0;
    }
}
