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
public final class GWASCatalogLinkDto implements Serializable {

    private static final long serialVersionUID = 1033868424762208408L;

    @JsonProperty("href")
    private final String href;

    @JsonCreator
    public GWASCatalogLinkDto(@JsonProperty("href") String href) {
        this.href = href;
    }

    public String getHref() {
        return href;
    }
}
