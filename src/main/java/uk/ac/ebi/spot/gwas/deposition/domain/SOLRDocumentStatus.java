package uk.ac.ebi.spot.gwas.deposition.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "solrDocumentStatuses")
public class SOLRDocumentStatus {

    public static final String OP_SAVE = "SAVE";

    public static final String OP_DELETE = "DELETE";

    @Id
    private String id;

    @Indexed
    private String pmid;

    @Indexed
    private String profile;

    private String operation;

    public SOLRDocumentStatus() {
    }

    public SOLRDocumentStatus(String pmid, String operation, String profile) {
        this.pmid = pmid;
        this.operation = operation;
        this.profile = profile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPmid() {
        return pmid;
    }

    public void setPmid(String pmid) {
        this.pmid = pmid;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
