package uk.ac.ebi.spot.gwas.deposition.audit;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonPropertyOrder({"Week","Awaiting submission","Awaiting literature","Awaiting Level 2 (submission complete status)",
        "Awaiting Level 2 (submission complete status) with associations","Awaiting EFO Mapping","Outstanding query",
        "Total PMIDs published this year"})
public class CurationStatusSnapshotStats {


    @JsonProperty("Week")
    private String week;

    @JsonProperty("Awaiting submission")
    private String awaitSubmissionCount;

    @JsonProperty("Awaiting literature")
    private String awaitLiteratureCount;

    @JsonProperty("Awaiting Level 2 (submission complete status)")
    private String awaitingLevel2Completion;

    @JsonProperty("Awaiting Level 2 (submission complete status) with associations")
    private String awaitingLevel2CompletionWithAccsns;

    @JsonProperty("Awaiting EFO Mapping")
    private String awaitingEFOMapping;

    @JsonProperty("Outstanding query")
    private String outstandingQuery;

    @JsonProperty("Total PMIDs published this year")
    private String totalPublished;




}
