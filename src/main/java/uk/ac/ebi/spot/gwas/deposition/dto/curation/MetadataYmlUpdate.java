package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
public class MetadataYmlUpdate implements Serializable {

    private static final long serialVersionUID = -8798172291691050974L;

    @JsonProperty("gsct")
    private String gsct;


}
