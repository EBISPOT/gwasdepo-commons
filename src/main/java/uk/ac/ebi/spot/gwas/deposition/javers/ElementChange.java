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
    private final String value;

    @JsonProperty("leftValue")
    private final String leftValue;

    @JsonProperty("rightValue")
    private final String rightValue;

    public ElementChange(@JsonProperty("elementChangeType") String elementChangeType,
                         @JsonProperty("index") Integer index,
                         @JsonProperty("value") String value,
                         @JsonProperty("leftValue") String leftValue,
                         @JsonProperty("rightValue") String rightValue) {
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

    public String getValue() {
        return value;
    }

    public String getLeftValue() {
        return leftValue;
    }

    public String getRightValue() {
        return rightValue;
    }
}
