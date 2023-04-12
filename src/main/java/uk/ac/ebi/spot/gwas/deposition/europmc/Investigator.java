package uk.ac.ebi.spot.gwas.deposition.europmc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Investigator {

    @JsonProperty("fullName")
    private String fullName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("initials")
    private String initials;

    @JsonProperty("investigatorAffiliationDetailsList")
    private InvestigatorAffiliationDetailsList investigatorAffiliationDetailsList;

    @JsonProperty("authorId")
    private AuthorId authorId;

    public Investigator(@JsonProperty("fullName") String fullName,
                        @JsonProperty("lastName") String lastName,
                        @JsonProperty("firstName") String firstName,
                        @JsonProperty("initials") String initials,
                        @JsonProperty("affiliation") InvestigatorAffiliationDetailsList investigatorAffiliationDetailsList,
                        @JsonProperty("authorId")  AuthorId authorId) {
        this.fullName = fullName;
        this.lastName = lastName;
        this.firstName = firstName;
        this.initials = initials;
        this.investigatorAffiliationDetailsList = investigatorAffiliationDetailsList;
        this.authorId = authorId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public InvestigatorAffiliationDetailsList getInvestigatorAffiliationDetailsList() {
        return investigatorAffiliationDetailsList;
    }

    public void setInvestigatorAffiliationDetailsList(InvestigatorAffiliationDetailsList investigatorAffiliationDetailsList) {
        this.investigatorAffiliationDetailsList = investigatorAffiliationDetailsList;
    }

    public AuthorId getAuthorId() {
        return authorId;
    }

    public void setAuthorId(AuthorId authorId) {
        this.authorId = authorId;
    }
}
