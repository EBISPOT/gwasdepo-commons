package uk.ac.ebi.spot.gwas.deposition.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LockDetailsDto implements Serializable {


    private static final long serialVersionUID = 4301897456269236643L;

    @NotNull
    @JsonProperty("lockedBy")
    private final ProvenanceDto lockedBy;

    @NotNull
    @JsonProperty("status")
    private String status;

    public LockDetailsDto(@JsonProperty("lockedBy") ProvenanceDto lockedBy, @JsonProperty("status") String status){
        this.lockedBy = lockedBy;
        this.status = status;
    }

    public ProvenanceDto getLockedBy() { return lockedBy; }

    public String getStatus() { return status; }
}

