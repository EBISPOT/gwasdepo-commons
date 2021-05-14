package uk.ac.ebi.spot.gwas.deposition.javers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ValueChangeWrapper {

    @JsonProperty("changeType")
    private final String changeType;

    @JsonProperty("globalId")
    private final ValueChangeGlobalId globalId;

    @JsonProperty("property")
    private final String property;

    @JsonProperty("left")
    private final Object left;

    @JsonProperty("right")
    private final Object right;

    public ValueChangeWrapper(@JsonProperty("changeType") String changeType,
                              @JsonProperty("globalId") ValueChangeGlobalId globalId,
                              @JsonProperty("property") String property,
                              @JsonProperty("left") Object left,
                              @JsonProperty("right") Object right) {
        this.changeType = changeType;
        this.globalId = globalId;
        this.property = property;
        this.left = left;
        this.right = right;
    }

    public String getChangeType() {
        return changeType;
    }

    public ValueChangeGlobalId getGlobalId() {
        return globalId;
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
}
