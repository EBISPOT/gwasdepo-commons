package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DiseaseTraitRabbitMessage {

    @JsonProperty("trait")
    private String trait;

    @JsonProperty("mongoSeqId")
    private String mongoSeqId;

    @JsonProperty("operation")
    private String operation;

}
