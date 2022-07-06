package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonPropertyOrder({"studytag","GCST","Short form"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EfoTraitStudyMappingDto {

    @JsonProperty("Short form")
    private String shortForm;

    @JsonProperty("studytag")
    private String studyTag;

    @JsonProperty("GCST")
    private String gcst;
}
