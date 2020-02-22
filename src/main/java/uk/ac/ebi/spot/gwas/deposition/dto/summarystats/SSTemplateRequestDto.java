package uk.ac.ebi.spot.gwas.deposition.dto.summarystats;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SSTemplateRequestDto implements Serializable {

    private static final long serialVersionUID = 202543470215612520L;

    @JsonProperty("summaryStats")
    private final boolean summaryStats;

    @JsonProperty("prefillData")
    private final SSTemplateRequestStudyDto prefillData;

    @JsonCreator
    public SSTemplateRequestDto(@JsonProperty("summaryStats") boolean summaryStats,
                                @JsonProperty("prefillData") SSTemplateRequestStudyDto prefillData) {
        this.summaryStats = summaryStats;
        this.prefillData = prefillData;
    }

    public boolean isSummaryStats() {
        return summaryStats;
    }

    public SSTemplateRequestStudyDto getPrefillData() {
        return prefillData;
    }
}
