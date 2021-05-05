package uk.ac.ebi.spot.gwas.deposition.javers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JaversChangeWrapper {

    private static final long serialVersionUID = 2258719551854413859L;


    @JsonProperty("changeType")
    private final String changeType;

    @JsonProperty("globalId")
    private final GlobalId globalId;

    @JsonProperty("commitMetadata")
    private final CommitMetadata commitMetadata;

    @JsonProperty("property")
    private final String property;

    @JsonProperty("left")
    private final Object left;

    @JsonProperty("right")
    private final Object right;


    @JsonProperty("elementChanges")
    private final List<ElementChange> elementChanges;

    public JaversChangeWrapper(@JsonProperty("changeType") String changeType,
                               @JsonProperty("globalId") GlobalId globalId,
                               @JsonProperty("commitMetadata") CommitMetadata commitMetadata,
                               @JsonProperty("property") String property,
                               @JsonProperty("left") Object left,
                               @JsonProperty("right") Object right,
                               @JsonProperty("elementChanges") List<ElementChange> elementChanges) {
        this.changeType = changeType;
        this.globalId = globalId;
        this.commitMetadata = commitMetadata;
        this.property = property;
        this.left = left;
        this.right = right;
        this.elementChanges = elementChanges;
    }

    public String getChangeType() {
        return changeType;
    }

    public GlobalId getGlobalId() {
        return globalId;
    }

    public CommitMetadata getCommitMetadata() {
        return commitMetadata;
    }

    public String getProperty() {
        return property;
    }

    public Object getLeft() {
        return left;
    }

    public Object getRight() {
        return right;
    }

    public List<ElementChange> getElementChanges() {
        return elementChanges;
    }
}
