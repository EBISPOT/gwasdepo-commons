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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"GCST", "Study Tag", "Efo Trait ShortForm", "Reported Trait Name"})
public class MultiTraitStudyMappingDto {
    @JsonProperty("GCST")
    private String gcst;

    @JsonProperty("Study Tag")
    private String studyTag;

    @JsonProperty("EFO Trait ShortForm")
    private String efoTraitShortForm;

    @JsonProperty("Reported Trait Name")
    private String reportedTrait;
}
