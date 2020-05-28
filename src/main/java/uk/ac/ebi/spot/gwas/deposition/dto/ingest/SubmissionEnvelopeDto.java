package uk.ac.ebi.spot.gwas.deposition.dto.ingest;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.EqualsAndHashCode;
import org.joda.time.LocalDate;
import uk.ac.ebi.spot.gwas.deposition.dto.ProvenanceDto;
import uk.ac.ebi.spot.gwas.deposition.util.JsonJodaLocalDateDeserializer;
import uk.ac.ebi.spot.gwas.deposition.util.JsonJodaLocalDateSerializer;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SubmissionEnvelopeDto implements Serializable {

    private static final long serialVersionUID = 1024024073602434591L;

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

    @JsonCreator
    public SubmissionEnvelopeDto(@JsonProperty("submissionId") String submissionId,
                                 @JsonProperty("publication") PublicationDto publication,
                                 @JsonProperty("bodyOfWork") BodyOfWorkDto bodyOfWork,
                                 @JsonProperty("provenanceType") String provenanceType,
                                 @JsonProperty("status") String status,
                                 @JsonProperty("globusFolder") String globusFolder,
                                 @JsonProperty("globusOriginId") String globusOriginId,
                                 @JsonProperty("date_submitted") @JsonDeserialize(using = JsonJodaLocalDateDeserializer.class) LocalDate dateSubmitted,
                                 @JsonProperty("created") ProvenanceDto created) {
        this.submissionId = submissionId;
        this.publication = publication;
        this.bodyOfWork = bodyOfWork;
        this.provenanceType = provenanceType;
        this.status = status;
        this.globusFolder = globusFolder;
        this.globusOriginId = globusOriginId;
        this.dateSubmitted = dateSubmitted;
        this.created = created;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public PublicationDto getPublication() {
        return publication;
    }

    public BodyOfWorkDto getBodyOfWork() {
        return bodyOfWork;
    }

    public String getStatus() {
        return status;
    }

    public String getGlobusFolder() {
        return globusFolder;
    }

    public String getGlobusOriginId() {
        return globusOriginId;
    }

    public String getProvenanceType() {
        return provenanceType;
    }

    public LocalDate getDateSubmitted() {
        return dateSubmitted;
    }

    public ProvenanceDto getCreated() {
        return created;
    }
}
