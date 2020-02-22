package uk.ac.ebi.spot.gwas.deposition.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "fileUploads")
public class FileUpload {

    @Id
    private String id;

    private String fileId;

    private String fileName;

    private Long fileSize;

    private String type;

    private String status;

    private List<String> errors;

    private List<String> summaryStatsStatuses;

    @Indexed
    private String callbackId;

    private boolean latest;

    public FileUpload() {
        this.errors = new ArrayList<>();
    }

    public FileUpload(String fileId, String fileName, Long fileSize, String status, String type) {
        this.fileId = fileId;
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.status = status;
        this.type = type;
        this.summaryStatsStatuses = new ArrayList<>();
        this.latest = true;
        this.errors = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getSummaryStatsStatuses() {
        return summaryStatsStatuses;
    }

    public void setSummaryStatsStatuses(List<String> summaryStatsStatuses) {
        this.summaryStatsStatuses = summaryStatsStatuses;
    }

    public void addSummaryStatsStatus(String summaryStatsStatusId) {
        this.summaryStatsStatuses.add(summaryStatsStatusId);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public boolean isLatest() {
        return latest;
    }

    public void setLatest(boolean latest) {
        this.latest = latest;
    }

    public String getCallbackId() {
        return callbackId;
    }

    public void setCallbackId(String callbackId) {
        this.callbackId = callbackId;
    }
}
