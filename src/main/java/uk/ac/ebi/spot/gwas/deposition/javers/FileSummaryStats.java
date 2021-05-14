package uk.ac.ebi.spot.gwas.deposition.javers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FileSummaryStats {

    @JsonProperty("fileName")
    private String fileName;

    @JsonProperty("fileId")
    private String fileId;

    @JsonProperty("fileUploadDate")
    private String fileUploadDate;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileUploadDate() {
        return fileUploadDate;
    }

    public void setFileUploadDate(String fileUploadDate) {
        this.fileUploadDate = fileUploadDate;
    }
}
