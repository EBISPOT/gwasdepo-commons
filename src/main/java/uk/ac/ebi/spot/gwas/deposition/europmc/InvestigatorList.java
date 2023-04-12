package uk.ac.ebi.spot.gwas.deposition.europmc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InvestigatorList {

    @JsonProperty("investigator")
    private List<Investigator> investigator;

    public InvestigatorList(@JsonProperty("investigator") List<Investigator> investigator) {
        this.investigator = investigator;
    }

    public List<Investigator> getInvestigator() {
        return investigator;
    }

    public void setInvestigator(List<Investigator> investigator) {
        this.investigator = investigator;
    }
}
