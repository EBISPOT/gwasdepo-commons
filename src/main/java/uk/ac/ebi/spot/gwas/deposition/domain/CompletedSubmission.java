package uk.ac.ebi.spot.gwas.deposition.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "completedSubmissions")
public class CompletedSubmission {

    @Id
    private String id;

    private String submissionId;

    private String publicationId;

    public CompletedSubmission() {
    }

    public CompletedSubmission(String submissionId, String publicationId) {
        this.submissionId = submissionId;
        this.publicationId = publicationId;
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
}

