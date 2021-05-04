package uk.ac.ebi.spot.gwas.deposition.javers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommitMetadata {

    @JsonProperty("author")
    private final String author;

    @JsonProperty("properties")
    private final String[] properties;

    @JsonProperty("commitDate")
    private final String commitDate;

    @JsonProperty("id")
    private final Double id;

    public CommitMetadata(@JsonProperty("author") String author,
                          @JsonProperty("properties") String[] properties,
                          @JsonProperty("commitDate") String commitDate,
                          @JsonProperty("id") Double id) {
        this.author = author;
        this.properties = properties;
        this.commitDate = commitDate;
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public String[] getProperties() {
        return properties;
    }

    public String getCommitDate() {
        return commitDate;
    }

    public Double getId() {
        return id;
    }
}
