package uk.ac.ebi.spot.gwas.deposition.dto.summarystats;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SummaryStatsAckDto implements Serializable {

    private static final long serialVersionUID = 2125959639470351232L;

    @NotEmpty
    @JsonProperty("callbackID")
    private final String callbackID;

    @JsonCreator
    public SummaryStatsAckDto(@JsonProperty("callbackID") String callbackID) {
        this.callbackID = callbackID;
    }

    public String getCallbackID() {
        return callbackID;
    }
}
