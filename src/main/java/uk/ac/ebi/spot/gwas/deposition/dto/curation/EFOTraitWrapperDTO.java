package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.core.Relation;

@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(value = "efoTrait", collectionRelation = "efoTraits")
public class EFOTraitWrapperDTO {

    private static final long serialVersionUID = 1079889060127420259L;

    @JsonProperty("trait")
    private String trait;

    private String uri;

    private String shortForm;

    public EFOTraitWrapperDTO(@JsonProperty("trait") String trait,
                              @JsonProperty("uri") String uri,
                              @JsonProperty("shortForm") String shortForm) {
        this.trait = trait;
        this.uri = uri;
        this.shortForm = shortForm;
    }

    public String getTrait() {
        return trait;
    }

    public String getUri() {
        return uri;
    }

    public String getShortForm() {
        return shortForm;
    }
}
