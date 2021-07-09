package uk.ac.ebi.spot.gwas.deposition.javers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GlobalId {

    @JsonProperty("entity")
    private final String entity;

    @JsonProperty("cdoId")
    private final String cdoId;


    public GlobalId(@JsonProperty("entity") String entity,
                    @JsonProperty("cdoId") String cdoId) {
        this.entity = entity;
        this.cdoId = cdoId;
    }

    public String getEntity() {
        return entity;
    }

    public String getCdoId() {
        return cdoId;
    }
}
