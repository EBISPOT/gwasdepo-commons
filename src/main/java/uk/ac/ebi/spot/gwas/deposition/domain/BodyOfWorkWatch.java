package uk.ac.ebi.spot.gwas.deposition.domain;

import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bodyOfWorkWatch")
public class BodyOfWorkWatch {

    @Id
    private String id;

    @Indexed
    private String bowId;

    @Indexed
    private boolean visited;

    private DateTime lastUpdated;

    public BodyOfWorkWatch() {

    }

    public BodyOfWorkWatch(String bowId) {
        this.bowId = bowId;
        this.visited = false;
        this.lastUpdated = DateTime.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBowId() {
        return bowId;
    }

    public void setBowId(String bowId) {
        this.bowId = bowId;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public DateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(DateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
