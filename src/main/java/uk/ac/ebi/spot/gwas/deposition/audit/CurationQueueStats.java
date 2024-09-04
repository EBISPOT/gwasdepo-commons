package uk.ac.ebi.spot.gwas.deposition.audit;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonPropertyOrder({"Week","PubmedId","Curator","Curation Status","First Author","Publication Date", "Publication Year"
,"Publication Month","Journal","Title", "Association Count","Study Count","User Requested", "Is Open Targets","Full PValue Set"})
public class CurationQueueStats {

    @JsonProperty("Week")
    private String week;

    @JsonProperty("PubmedId")
    private String pmid;

    @JsonProperty("Curator")
    private String curator;

    @JsonProperty("Curation Status")
    private String curationStatus;

    @JsonProperty("First Author")
    private String firstAuthor;

    @JsonProperty("Publication Date")
    private String publicationDate;

    @JsonProperty("Publication Year")
    private String publicationYear;

    @JsonProperty("Publication Month")
    private String publicationMonth;

    @JsonProperty("Journal")
    private String journal;

    @JsonProperty("Title")
    private String title;

    @JsonProperty("Association Count")
    private Integer associationCount;

    @JsonProperty("Study Count")
    private Integer studyCount;

    @JsonProperty("User Requested")
    private Boolean userRequested;

    @JsonProperty("Is Open Targets")
    private Boolean isOpenTargets;

    @JsonProperty("Full PValue Set")
    private Boolean fullPvalueSet;


}
