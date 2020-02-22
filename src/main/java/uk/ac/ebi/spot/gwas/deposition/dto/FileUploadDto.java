package uk.ac.ebi.spot.gwas.deposition.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.core.Relation;
import uk.ac.ebi.spot.gwas.deposition.dto.summarystats.SummaryStatsStatusDto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(value = "fileUpload", collectionRelation = "fileUploads")
public class FileUploadDto extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = -446148751976288089L;

    @NotEmpty
    @JsonProperty("fileUploadId")
    private final String fileUploadId;

    @NotEmpty
    @JsonProperty("fileName")
    private final String fileName;

    @NotNull
    @JsonProperty("fileSize")
    private final Long fileSize;

    @NotEmpty
    @JsonProperty("status")
    private final String status;

    @JsonProperty("type")
    private final String type;

    @JsonProperty("errors")
    private final List<String> errors;

    @JsonProperty("summaryStatsStatuses")
    private final List<SummaryStatsStatusDto> summaryStatsStatuses;

    @JsonCreator
    public FileUploadDto(@JsonProperty("fileUploadId") String fileUploadId,
                         @JsonProperty("status") String status,
                         @JsonProperty("type") String type,
                         @JsonProperty("fileName") String fileName,
                         @JsonProperty("fileSize") Long fileSize,
                         @JsonProperty("errors") List<String> errors,
                         @JsonProperty("summaryStatsStatuses") List<SummaryStatsStatusDto> summaryStatsStatuses) {
        this.fileUploadId = fileUploadId;
        this.status = status;
        this.type = type;
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.errors = errors;
        this.summaryStatsStatuses = summaryStatsStatuses;
    }

    public String getFileUploadId() {
        return fileUploadId;
    }

    public String getStatus() {
        return status;
    }

    public String getFileName() {
        return fileName;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public String getType() {
        return type;
    }

    public List<String> getErrors() {
        return errors;
    }

    public List<SummaryStatsStatusDto> getSummaryStatsStatuses() {
        return summaryStatsStatuses;
    }
}
