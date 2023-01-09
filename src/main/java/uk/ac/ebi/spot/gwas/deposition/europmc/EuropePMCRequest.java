package uk.ac.ebi.spot.gwas.deposition.europmc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EuropePMCRequest implements Serializable {

    private static final long serialVersionUID = 4298379950576136625L;

    @JsonProperty("resultList")
    private ResultList resultList;

    public EuropePMCRequest(@JsonProperty("resultList") ResultList resultList) {
        this.resultList = resultList;
    }

    public ResultList getResultList() {
        return resultList;
    }

    public void setResultList(ResultList resultList) {
        this.resultList = resultList;
    }
}
