package uk.ac.ebi.spot.gwas.deposition.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "publicationIngestEntries")
@CompoundIndexes({@CompoundIndex(name = "status_env", def = "{'status': 1, 'environment': 1}")})
public class PublicationIngestEntry {

    @Id
    private String id;

    private String publicationId;

    @Indexed
    private String status;

    @Indexed
    private String environment;

    public PublicationIngestEntry() {

    }

    public PublicationIngestEntry(String publicationId, String status, String environment) {
        this.publicationId = publicationId;
        this.status = status;
        this.environment = environment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(String publicationId) {
        this.publicationId = publicationId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
