package uk.ac.ebi.spot.gwas.deposition.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "archivedSubmissions")
public class ArchivedSubmission {

    @Id
    private String id;

    @Indexed
    private String submissionId;

    private String publicationId;

    private List<String> studies;

    private List<String> associations;

    private List<String> samples;

    private List<String> notes;

    private List<String> fileUploads;

    private Provenance created;

    public ArchivedSubmission() {

    }

    public ArchivedSubmission(String submissionId, String publicationId, Provenance created) {
        this.submissionId = submissionId;
        this.publicationId = publicationId;
        this.created = created;
        this.studies = new ArrayList<>();
        this.associations = new ArrayList<>();
        this.samples = new ArrayList<>();
        this.notes = new ArrayList<>();
        this.fileUploads = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public String getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(String publicationId) {
        this.publicationId = publicationId;
    }

    public List<String> getStudies() {
        return studies;
    }

    public void setStudies(List<String> studies) {
        this.studies = studies;
    }

    public List<String> getAssociations() {
        return associations;
    }

    public void setAssociations(List<String> associations) {
        this.associations = associations;
    }

    public List<String> getSamples() {
        return samples;
    }

    public void setSamples(List<String> samples) {
        this.samples = samples;
    }

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public List<String> getFileUploads() {
        return fileUploads;
    }

    public void setFileUploads(List<String> fileUploads) {
        this.fileUploads = fileUploads;
    }

    public Provenance getCreated() {
        return created;
    }

    public void setCreated(Provenance created) {
        this.created = created;
    }

    public static ArchivedSubmission fromSubmission(Submission submission) {
        ArchivedSubmission archivedSubmission = new ArchivedSubmission(submission.getId(),
                submission.getPublicationId(),
                submission.getCreated());
        archivedSubmission.setStudies(submission.getStudies());
        archivedSubmission.setAssociations(submission.getAssociations());
        archivedSubmission.setSamples(submission.getSamples());
        archivedSubmission.setNotes(submission.getNotes());
        archivedSubmission.setFileUploads(submission.getFileUploads());
        return archivedSubmission;
    }


}
