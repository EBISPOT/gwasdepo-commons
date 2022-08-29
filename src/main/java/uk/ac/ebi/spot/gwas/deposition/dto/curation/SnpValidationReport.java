package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@JsonPropertyOrder({"rsId", "Invalid Reason"})
public class SnpValidationReport {

    public SnpValidationReport(@JsonProperty("rsId") String rsId, @JsonProperty("Invalid Reason") String invalidReason) {
        this.rsId = rsId;
        this.invalidReason = invalidReason;
    }

    @JsonProperty("rsId")
    String rsId;

    @JsonProperty("Invalid Reason")
    String invalidReason;
}
