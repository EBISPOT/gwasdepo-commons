package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.core.Relation;
import uk.ac.ebi.spot.gwas.deposition.dto.ProvenanceDto;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(value = "diseaseTrait", collectionRelation = "diseaseTraits")
public class DiseaseTraitDto extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = -5011438835557665049L;

    @JsonProperty("diseaseTraitId")
    private String diseaseTraitId;

    @JsonProperty("trait")
    private String trait;


    @JsonProperty("created")
    private final ProvenanceDto created;

    @JsonProperty("updated")
    private final ProvenanceDto updated;



    public DiseaseTraitDto(@JsonProperty("diseaseTraitId") String diseaseTraitId,
                           @JsonProperty("trait") String trait,
                           @JsonProperty("created") ProvenanceDto created,
                           @JsonProperty("updated") ProvenanceDto updated) {
        this.diseaseTraitId = diseaseTraitId;
        this.trait = trait;
        this.created = created;
        this.updated = updated;
    }

    public String getDiseaseTraitId() {
        return diseaseTraitId;
    }

    public String getTrait() {
        return trait;
    }


    public ProvenanceDto getCreated() {
        return created;
    }

    public ProvenanceDto getUpdated() { return updated; }
}
