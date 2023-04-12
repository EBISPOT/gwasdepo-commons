package uk.ac.ebi.spot.gwas.deposition.europmc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthorAffiliationDetailsList {

    @JsonProperty("authorAffiliation")
    private List<AuthorAffiliation> authorAffiliation;

    public AuthorAffiliationDetailsList(@JsonProperty("authorAffiliation") List<AuthorAffiliation> authorAffiliation) {
        this.authorAffiliation = authorAffiliation;
    }

    public List<AuthorAffiliation> getAuthorAffiliation() {
        return authorAffiliation;
    }

    public void setAuthorAffiliation(List<AuthorAffiliation> authorAffiliation) {
        this.authorAffiliation = authorAffiliation;
    }
}
