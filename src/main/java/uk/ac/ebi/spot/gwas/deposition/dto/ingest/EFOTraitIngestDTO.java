package uk.ac.ebi.spot.gwas.deposition.dto.ingest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.core.Relation;

@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(value = "efoTrait", collectionRelation = "efoTraits")
public class EFOTraitIngestDTO {

    private static final long serialVersionUID = 1079889060127420259L;

    @JsonProperty("trait")
    private String trait;

    @JsonProperty("uri")
    private String uri;

    @JsonProperty("shortForm")
    private String shortForm;

    @JsonProperty("mongoSeqId")
    private String mongoSeqId;

    public EFOTraitIngestDTO(@JsonProperty("trait") String trait,
                             @JsonProperty("uri") String uri,
                             @JsonProperty("shortForm") String shortForm,
                             @JsonProperty("mongoSeqId") String mongoSeqId) {
        this.trait = trait;
        this.uri = uri;
        this.shortForm = shortForm;
        this.mongoSeqId = mongoSeqId;

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

    public String getMongoSeqId() {
        return mongoSeqId;
    }
}
