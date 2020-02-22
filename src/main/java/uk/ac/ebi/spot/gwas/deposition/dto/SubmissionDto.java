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
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(value = "submission", collectionRelation = "submissions")
public class SubmissionDto extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = 3158029215487618051L;

    @NotEmpty
    @JsonProperty("submissionId")
    private final String submissionId;

    @NotNull
    @JsonProperty("publication")
    private final PublicationDto publication;

    @NotEmpty
    @JsonProperty("submission_status")
    private final String submissionStatus;

    @NotEmpty
    @JsonProperty("metadata_status")
    private final String metadataStatus;

    @NotEmpty
    @JsonProperty("summary_statistics_status")
    private final String summaryStatisticsStatus;

    @JsonProperty("files")
    private final List<FileUploadDto> files;

    @JsonProperty("study_count")
    private final Integer studyCount;

    @JsonProperty("sample_count")
    private final Integer sampleCount;

    @JsonProperty("association_count")
    private final Integer associationCount;

    @JsonProperty("globusFolder")
    private final String globusFolder;

    @JsonProperty("globusOriginId")
    private final String globusOriginId;

    @NotNull
    @JsonProperty("date_submitted")
    @JsonSerialize(using = JsonJodaLocalDateSerializer.class)
    private final LocalDate dateSubmitted;

    @NotNull
    @JsonProperty("created")
    private final ProvenanceDto created;

    @JsonProperty("lastUpdated")
    private final ProvenanceDto lastUpdated;

    @JsonCreator
    public SubmissionDto(@JsonProperty("submissionId") String submissionId,
                         @JsonProperty("publication") PublicationDto publication,
                         @JsonProperty("files") List<FileUploadDto> files,
                         @JsonProperty("globusFolder") String globusFolder,
                         @JsonProperty("globusOriginId") String globusOriginId,
                         @JsonProperty("study_count") Integer studyCount,
                         @JsonProperty("sample_count") Integer sampleCount,
                         @JsonProperty("association_count") Integer associationCount,
                         @JsonProperty("submission_status") String submissionStatus,
                         @JsonProperty("metadata_status") String metadataStatus,
                         @JsonProperty("summary_statistics_status") String summaryStatisticsStatus,
                         @JsonProperty("date_submitted") @JsonDeserialize(using = JsonJodaLocalDateDeserializer.class) LocalDate dateSubmitted,
                         @JsonProperty("created") ProvenanceDto created,
                         @JsonProperty("lastUpdated") ProvenanceDto lastUpdated) {
        this.submissionId = submissionId;
        this.publication = publication;
        this.studyCount = studyCount;
        this.files = files;
        this.globusFolder = globusFolder;
        this.globusOriginId = globusOriginId;
        this.sampleCount = sampleCount;
        this.associationCount = associationCount;
        this.submissionStatus = submissionStatus;
        this.dateSubmitted = dateSubmitted;
        this.metadataStatus = metadataStatus;
        this.summaryStatisticsStatus = summaryStatisticsStatus;
        this.created = created;
        this.lastUpdated = lastUpdated;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public PublicationDto getPublication() {
        return publication;
    }

    public String getSubmissionStatus() {
        return submissionStatus;
    }

    public String getMetadataStatus() {
        return metadataStatus;
    }

    public String getSummaryStatisticsStatus() {
        return summaryStatisticsStatus;
    }

    public List<FileUploadDto> getFiles() {
        return files;
    }

    public Integer getStudyCount() {
        return studyCount;
    }

    public Integer getSampleCount() {
        return sampleCount;
    }

    public Integer getAssociationCount() {
        return associationCount;
    }

    public LocalDate getDateSubmitted() {
        return dateSubmitted;
    }

    public ProvenanceDto getCreated() {
        return created;
    }

    public ProvenanceDto getLastUpdated() {
        return lastUpdated;
    }

    public String getGlobusFolder() {
        return globusFolder;
    }

    public String getGlobusOriginId() {
        return globusOriginId;
    }
}
