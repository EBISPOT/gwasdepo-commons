package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.core.Relation;
import uk.ac.ebi.spot.gwas.deposition.domain.Provenance;
import uk.ac.ebi.spot.gwas.deposition.dto.ProvenanceDto;

import javax.validation.constraints.NotNull;
import java.util.List;

@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(value = "diseaseTrait", collectionRelation = "diseaseTraits")
public class DiseaseTraitDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("trait")
    private String trait;

    @JsonProperty("studies")
    private List<String> studies;


    @JsonProperty("created")
    private final ProvenanceDto created;



    public DiseaseTraitDto(@JsonProperty("id") String id,
                           @JsonProperty("trait") String trait,
                           @JsonProperty("studies") List<String> studies,
                            @JsonProperty("created") ProvenanceDto created) {
        this.id = id;
        this.trait = trait;
        this.studies = studies;
        this.created = created;
    }

    public String getId() {
        return id;
    }

    public String getTrait() {
        return trait;
    }

    public List<String> getStudies() {
        return studies;
    }

    public ProvenanceDto getCreated() {
        return created;
    }
}
