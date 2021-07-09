package uk.ac.ebi.spot.gwas.deposition.javers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FileSummaryStats {

    @JsonProperty("fileName")
    private String fileName;

    @JsonProperty("fileId")
    private String fileId;

    public FileSummaryStats(@JsonProperty("fileName") String fileName,
                            @JsonProperty("fileId") String fileId) {
        this.fileName = fileName;
        this.fileId = fileId;
    }

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


}
