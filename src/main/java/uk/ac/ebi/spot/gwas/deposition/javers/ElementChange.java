package uk.ac.ebi.spot.gwas.deposition.javers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ElementChange {

    @JsonProperty("elementChangeType")
    private final String elementChangeType;

    @JsonProperty("index")
    private final Integer index;

    @JsonProperty("value")
    private final Object value;

    @JsonProperty("leftValue")
    private final Object leftValue;

    @JsonProperty("rightValue")
    private final Object rightValue;

    public ElementChange(@JsonProperty("elementChangeType") String elementChangeType,
                         @JsonProperty("index") Integer index,
                         @JsonProperty("value") Object value,
                         @JsonProperty("leftValue") Object leftValue,
                         @JsonProperty("rightValue") Object rightValue) {
        this.elementChangeType = elementChangeType;
        this.index = index;
        this.value = value;
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    public String getElementChangeType() {
        return elementChangeType;
    }

    public Integer getIndex() {
        return index;
    }

    public Object getValue() {
        return value;
    }

    public Object getLeftValue() {
        return leftValue;
    }

    public Object getRightValue() {
        return rightValue;
    }
}
