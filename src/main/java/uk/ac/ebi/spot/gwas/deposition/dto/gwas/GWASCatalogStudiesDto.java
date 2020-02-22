package uk.ac.ebi.spot.gwas.deposition.dto.gwas;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class GWASCatalogStudiesDto implements Serializable {

    private static final long serialVersionUID = 7835324854256055024L;

    @JsonProperty("studies")
    private final List<GWASCatalogStudyDto> studies;

    @JsonCreator
    public GWASCatalogStudiesDto(@JsonProperty("studies") List<GWASCatalogStudyDto> studies) {
        this.studies = studies;
    }

    public List<GWASCatalogStudyDto> getStudies() {
        return studies;
    }
}
