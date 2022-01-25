package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.core.Relation;

@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(value = "diseaseTrait", collectionRelation = "diseaseTraits")
public class DiseaseTraitWrapperDTO {

    private static final long serialVersionUID = 3496077591012596749L;

    @JsonProperty("trait")
    private String trait;

    public DiseaseTraitWrapperDTO(@JsonProperty("trait") String trait) {
        this.trait = trait;
    }

    public String getTrait() {
        return trait;
    }
}
