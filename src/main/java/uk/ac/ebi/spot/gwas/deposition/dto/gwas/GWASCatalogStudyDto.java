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
public final class GWASCatalogStudyDto implements Serializable {

    private static final long serialVersionUID = -6046898206746584763L;

    @JsonProperty("initialSampleSize")
    private final String initialSampleSize;

    @JsonProperty("accessionId")
    private final String accessionId;

    @JsonProperty("diseaseTrait")
    private final GWASCatalogDiseaseTraitDto diseaseTrait;

    @JsonCreator
    public GWASCatalogStudyDto(@JsonProperty("initialSampleSize") String initialSampleSize,
                               @JsonProperty("accessionId") String accessionId,
                               @JsonProperty("diseaseTrait") GWASCatalogDiseaseTraitDto diseaseTrait) {
        this.initialSampleSize = initialSampleSize;
        this.accessionId = accessionId;
        this.diseaseTrait = diseaseTrait;
    }

    public String getInitialSampleSize() {
        return initialSampleSize;
    }

    public String getAccessionId() {
        return accessionId;
    }

    public GWASCatalogDiseaseTraitDto getDiseaseTrait() {
        return diseaseTrait;
    }
}
