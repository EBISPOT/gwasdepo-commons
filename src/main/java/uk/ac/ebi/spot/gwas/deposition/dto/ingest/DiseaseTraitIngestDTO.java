package uk.ac.ebi.spot.gwas.deposition.dto.ingest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.core.Relation;

@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(value = "diseaseTrait", collectionRelation = "diseaseTraits")
public class DiseaseTraitIngestDTO {

    private static final long serialVersionUID = -1332485232226948294L;

    @JsonProperty("trait")
    private String trait;

    @JsonProperty("mongoSeqId")
    private String mongoSeqId;

    public DiseaseTraitIngestDTO(@JsonProperty("trait") String trait,
                                 @JsonProperty("mongoSeqId") String mongoSeqId ) {
        this.trait = trait;
        this.mongoSeqId = mongoSeqId;
    }

    public String getTrait() {
        return trait;
    }

    public String getMongoSeqId() {
        return mongoSeqId;
    }
}
