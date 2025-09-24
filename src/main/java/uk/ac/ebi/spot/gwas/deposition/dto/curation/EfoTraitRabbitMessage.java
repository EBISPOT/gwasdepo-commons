package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EfoTraitRabbitMessage {

    @JsonProperty("trait")
    private String trait;

    @JsonProperty("uri")
    private String uri;

    @JsonProperty("shortForm")
    private String shortForm;

    @JsonProperty("mongoSeqId")
    private String mongoSeqId;

    @JsonProperty("operation")
    private String operation;
}
