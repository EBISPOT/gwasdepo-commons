package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.core.Relation;
import uk.ac.ebi.spot.gwas.deposition.dto.ProvenanceDto;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = false)
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Relation(value = "efoTraits", collectionRelation = "efoTraits")
public class EfoTraitDto extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = 1533009019093824947L;

    @JsonProperty("efoTraitId")
    private String efoTraitId;

    @JsonProperty("trait")
    private String trait;

    private String uri;

    private String shortForm;

    @JsonProperty("created")
    private final ProvenanceDto created;

    @JsonProperty("updated")
    private final ProvenanceDto updated;

    public EfoTraitDto(@JsonProperty("efoTraitId") String efoTraitId,
                       @JsonProperty("trait") String trait,
                       @JsonProperty("uri") String uri,
                       @JsonProperty("shortForm") String shortForm,
                       @JsonProperty("created") ProvenanceDto created,
                       @JsonProperty("updated") ProvenanceDto updated) {
        this.efoTraitId = efoTraitId;
        this.trait = trait;
        this.uri = uri;
        this.shortForm = shortForm;
        this.created = created;
        this.updated = updated;
    }
}
