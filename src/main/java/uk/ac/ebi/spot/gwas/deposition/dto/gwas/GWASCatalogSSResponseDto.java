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
public final class GWASCatalogSSResponseDto implements Serializable {

    private static final long serialVersionUID = 7835324854256055024L;

    @JsonProperty("_embedded")
    private final GWASCatalogStudiesDto embedded;

    @JsonProperty("_links")
    private final GWASCatalogLinksDto links;

    @JsonCreator
    public GWASCatalogSSResponseDto(@JsonProperty("_embedded") GWASCatalogStudiesDto embedded,
                                    @JsonProperty("_links") GWASCatalogLinksDto links) {
        this.embedded = embedded;
        this.links = links;
    }

    public GWASCatalogStudiesDto getEmbedded() {
        return embedded;
    }

    public GWASCatalogLinksDto getLinks() {
        return links;
    }
}
