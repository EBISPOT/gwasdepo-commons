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
public final class GWASCatalogLinksDto implements Serializable {

    private static final long serialVersionUID = 1033868424762208408L;

    @JsonProperty("first")
    private final GWASCatalogLinkDto first;

    @JsonProperty("prev")
    private final GWASCatalogLinkDto prev;

    @JsonProperty("self")
    private final GWASCatalogLinkDto self;

    @JsonProperty("next")
    private final GWASCatalogLinkDto next;

    @JsonProperty("last")
    private final GWASCatalogLinkDto last;

    @JsonCreator
    public GWASCatalogLinksDto(@JsonProperty("first") GWASCatalogLinkDto first,
                               @JsonProperty("prev") GWASCatalogLinkDto prev,
                               @JsonProperty("self") GWASCatalogLinkDto self,
                               @JsonProperty("next") GWASCatalogLinkDto next,
                               @JsonProperty("last") GWASCatalogLinkDto last) {
        this.first = first;
        this.prev = prev;
        this.self = self;
        this.next = next;
        this.last = last;
    }

    public GWASCatalogLinkDto getFirst() {
        return first;
    }

    public GWASCatalogLinkDto getPrev() {
        return prev;
    }

    public GWASCatalogLinkDto getSelf() {
        return self;
    }

    public GWASCatalogLinkDto getNext() {
        return next;
    }

    public GWASCatalogLinkDto getLast() {
        return last;
    }
}
