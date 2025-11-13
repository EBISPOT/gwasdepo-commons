package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FileTypeUpdateRequestDto {
    @JsonProperty("file_type")
    private String fileType;
    @JsonProperty("gcst_id")
    private String[] gcstId;
    @JsonProperty("is_harmonised_included")
    private String isHarmonisedIncluded;
}