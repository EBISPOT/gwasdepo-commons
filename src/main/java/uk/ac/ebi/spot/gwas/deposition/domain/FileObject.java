package uk.ac.ebi.spot.gwas.deposition.domain;

public class FileObject {

    private String fileName;

    private byte[] content;

    public FileObject(String fileName, byte[] content) {
        this.fileName = fileName;
        this.content = content;
    }

    public String getFileName() {
        return fileName;
    }

    public byte[] getContent() {
        return content;
    }
}
