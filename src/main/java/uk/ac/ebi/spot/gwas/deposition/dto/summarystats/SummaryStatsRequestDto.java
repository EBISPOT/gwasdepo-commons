package uk.ac.ebi.spot.gwas.deposition.dto.summarystats;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SummaryStatsRequestDto implements Serializable {

    private static final long serialVersionUID = 6104751696747101714L;

    @NotEmpty
    @JsonProperty("requestEntries")
    private final List<SummaryStatsRequestEntryDto> requestEntries;

    @JsonProperty("skipValidation")
    private final String skipValidation;

    @JsonCreator
    public SummaryStatsRequestDto(@JsonProperty("requestEntries") List<SummaryStatsRequestEntryDto> requestEntries, @JsonProperty("skipValidation") String skipValidation) {
        this.requestEntries = requestEntries;
        this.skipValidation = skipValidation;
    }

    public List<SummaryStatsRequestEntryDto> getRequestEntries() {
        return requestEntries;
    }

    public String getSkipValidation() { return skipValidation; }
}
