package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@JsonPropertyOrder({"GCST", "Study Tag", "Efo Trait Comments", "Background Efo Comments", "Reported Trait Comments"})
public class MultiTraitStudyMappingReport {

    public MultiTraitStudyMappingReport(@JsonProperty("GCST") String gcst, @JsonProperty("Study Tag") String tag,
                                        @JsonProperty("Efo Trait Comments") String efoTraitComments//, @JsonProperty("Background Efo Comments") String backgroundEfoComments,
                                        , @JsonProperty("Reported Trait Comments") String reportedTraitComments) {
        this.gcst = gcst;
        this.tag = tag;
        this.efoTraitComments = efoTraitComments;
        //this.backgroundEfoComments = backgroundEfoComments;
        this.reportedTraitComments = reportedTraitComments;
    }

    @JsonProperty("GCST")
    private String gcst;

    @JsonProperty("Study Tag")
    private String tag;

    @JsonProperty("Efo Trait Comments")
    private String efoTraitComments;

    //@JsonProperty("Background Efo Comments")
    //private String backgroundEfoComments;

    @JsonProperty("Reported Trait Comments")
    private String reportedTraitComments;
}
