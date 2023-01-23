package uk.ac.ebi.spot.gwas.deposition.europmc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Journal {

    @JsonProperty("medlineAbbreviation")
    private String medlineAbbreviation;

    public Journal(@JsonProperty("medlineAbbreviation") String medlineAbbreviation) {
        this.medlineAbbreviation = medlineAbbreviation;
    }

    public String getMedlineAbbreviation() {
        return medlineAbbreviation;
    }

    public void setMedlineAbbreviation(String medlineAbbreviation) {
        this.medlineAbbreviation = medlineAbbreviation;
    }
}
