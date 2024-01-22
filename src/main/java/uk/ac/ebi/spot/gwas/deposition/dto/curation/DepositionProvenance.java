package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;
import uk.ac.ebi.spot.gwas.deposition.util.JsonJodaDateTimeDeserializer;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepositionProvenance {
    @JsonDeserialize(using= JsonJodaDateTimeDeserializer.class)

    private DateTime timestamp;
    private DepositionUser user;}
