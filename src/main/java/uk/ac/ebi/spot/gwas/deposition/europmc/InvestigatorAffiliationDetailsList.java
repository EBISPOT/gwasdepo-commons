package uk.ac.ebi.spot.gwas.deposition.europmc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InvestigatorAffiliationDetailsList {

    @JsonProperty("investigatorAffiliation")
    private List<InvestigatorAffiliation> investigatorAffiliation;

    public InvestigatorAffiliationDetailsList(@JsonProperty("investigatorAffiliation") List<InvestigatorAffiliation> investigatorAffiliation) {
        this.investigatorAffiliation = investigatorAffiliation;
    }

    public List<InvestigatorAffiliation> getInvestigatorAffiliation() {
        return investigatorAffiliation;
    }

    public void setInvestigatorAffiliation(List<InvestigatorAffiliation> investigatorAffiliation) {
        this.investigatorAffiliation = investigatorAffiliation;
    }
}
