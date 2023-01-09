package uk.ac.ebi.spot.gwas.deposition.europmc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Author {

    @JsonProperty("collectiveName")
    private String collectiveName;

    @JsonProperty("fullName")
    private String fullName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("initials")
    private String initials;

    @JsonProperty("authorAffiliationDetailsList")
    private AuthorAffiliationDetailsList authorAffiliationDetailsList;

    @JsonProperty("authorId")
    private AuthorId authorId;

    public Author(@JsonProperty("collectiveName") String collectiveName,
                  @JsonProperty("fullName") String fullName,
                  @JsonProperty("lastName") String lastName,
                  @JsonProperty("firstName") String firstName,
                  @JsonProperty("initials") String initials,
                  @JsonProperty("authorAffiliationDetailsList") AuthorAffiliationDetailsList authorAffiliationDetailsList,
                  @JsonProperty("authorId") AuthorId authorId) {
        this.collectiveName = collectiveName;
        this.fullName = fullName;
        this.lastName = lastName;
        this.firstName = firstName;
        this.initials = initials;
        this.authorAffiliationDetailsList = authorAffiliationDetailsList;
        this.authorId = authorId;
    }

    public String getCollectiveName() {
        return collectiveName;
    }

    public void setCollectiveName(String collectiveName) {
        this.collectiveName = collectiveName;
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

    public AuthorAffiliationDetailsList getAuthorAffiliationDetailsList() {
        return authorAffiliationDetailsList;
    }

    public void setAuthorAffiliationDetailsList(AuthorAffiliationDetailsList authorAffiliationDetailsList) {
        this.authorAffiliationDetailsList = authorAffiliationDetailsList;
    }

    public AuthorId getAuthorId() {
        return authorId;
    }

    public void setAuthorId(AuthorId authorId) {
        this.authorId = authorId;
    }
}
