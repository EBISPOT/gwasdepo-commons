package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.core.Relation;
import uk.ac.ebi.spot.gwas.deposition.domain.Provenance;
import uk.ac.ebi.spot.gwas.deposition.dto.ProvenanceDto;

import java.util.List;

@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(value = "author", collectionRelation = "authors")
public class PublicationAuthorDto {

    private static final long serialVersionUID = -5772993169109058699L;

    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("fullNameStandard")
    private String fullNameStandard;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("initials")
    private String initials;
    @JsonProperty("affiliation")
    private String affiliation;
    @JsonProperty("orcid")
    private String orcid;


    @JsonProperty("created")
    private  ProvenanceDto created;

    @JsonProperty("updated")
    private  ProvenanceDto updated;




    public PublicationAuthorDto() {

    }

    public PublicationAuthorDto(@JsonProperty("fullName") String fullName,
                                @JsonProperty("fullNameStandard") String fullNameStandard,
                                @JsonProperty("firstName") String firstName,
                                @JsonProperty("lastName") String lastName,
                                @JsonProperty("initials") String initials,
                                @JsonProperty("affiliation") String affiliation,
                                @JsonProperty("orcid") String orcid,
                                @JsonProperty("created") ProvenanceDto created,
                                @JsonProperty("updated") ProvenanceDto updated
                                ) {
        this.fullName = fullName;
        this.fullNameStandard = fullNameStandard;
        this.firstName = firstName;
        this.lastName = lastName;
        this.initials = initials;
        this.affiliation = affiliation;
        this.orcid = orcid;
        this.created = created;
        this.updated = updated;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setFullNameStandard(String fullNameStandard) {
        this.fullNameStandard = fullNameStandard;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public void setOrcid(String orcid) {
        this.orcid = orcid;
    }

    public String getFullNameStandard() {
        return fullNameStandard;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getInitials() {
        return initials;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public String getOrcid() {
        return orcid;
    }

    public ProvenanceDto getCreated() {
        return created;
    }

    public ProvenanceDto getUpdated() {
        return updated;
    }

    public String getFullName() {
        return fullName;
    }


    public void setCreated(ProvenanceDto created) {
        this.created = created;
    }

    public void setUpdated(ProvenanceDto updated) {
        this.updated = updated;
    }


}


