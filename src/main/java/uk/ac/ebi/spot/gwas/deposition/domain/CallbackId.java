package uk.ac.ebi.spot.gwas.deposition.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "callbackIds")
@CompoundIndexes({@CompoundIndex(name = "sub_compl", def = "{'submissionId': 1, 'completed': 1}")})
public class CallbackId {

    @Id
    private String id;

    @Indexed
    private String callbackId;

    private String submissionId;

    private boolean valid;

    @Indexed
    private boolean completed;

    private CallbackId() {

    }

    public CallbackId(String callbackId, String submissionId) {
        this.submissionId = submissionId;
        this.callbackId = callbackId;
        this.valid = true;
        this.completed = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCallbackId() {
        return callbackId;
    }

    public void setCallbackId(String callbackId) {
        this.callbackId = callbackId;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
