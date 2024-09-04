package uk.ac.ebi.spot.gwas.deposition.audit;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonPropertyOrder({"Week","PMIDs added to database","Submissions completed by internal users",
"Level 2 done","Published","Single level complete"})
public class PublicationWeeklyStats {

    @JsonProperty("Week")
    private String week;

    @JsonProperty("PMIDs added to database")
    private String pmidsAdded;

    @JsonProperty("Submissions completed by internal users")
    private String pmidsSubComplete;

    @JsonProperty("Level 2 done")
    private String pmidsLevel2Done;

    @JsonProperty("Published")
    private String pmidsPublished;

    @JsonProperty("Single level complete")
    private String pmidsSingleLevelComplete;


}
