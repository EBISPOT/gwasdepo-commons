package uk.ac.ebi.spot.gwas.deposition.dto.gwas;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class GWASCatalogDiseaseTraitDto implements Serializable {

    private static final long serialVersionUID = 1033868424762208408L;

    @JsonProperty("trait")
    private final String trait;

    @JsonCreator
    public GWASCatalogDiseaseTraitDto(@JsonProperty("trait") String trait) {
        this.trait = trait;
    }

    public String getTrait() {
        return trait;
    }
}
