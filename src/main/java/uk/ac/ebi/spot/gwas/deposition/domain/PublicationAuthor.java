package uk.ac.ebi.spot.gwas.deposition.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "authors")
public class PublicationAuthor {

    @Id
    private String id;
    @Indexed
    private String fullName;
    private String fullNameStandard;
    @Indexed
    private String firstName;
    @Indexed
    private String lastName;

    private String initials;

    private String affiliation;

    private String orcid;


    private Provenance created;

    private Provenance updated;

    public PublicationAuthor(String fullName, String fullNameStandard, String firstName, String lastName, String initials, String affiliation, String orcid, Provenance created, Provenance updated) {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullNameStandard() {
        return fullNameStandard;
    }

    public void setFullNameStandard(String fullNameStandard) {
        this.fullNameStandard = fullNameStandard;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getOrcid() {
        return orcid;
    }

    public void setOrcid(String orcid) {
        this.orcid = orcid;
    }

    public Provenance getCreated() {
        return created;
    }

    public void setCreated(Provenance created) {
        this.created = created;
    }

    public Provenance getUpdated() {
        return updated;
    }

    public void setUpdated(Provenance updated) {
        this.updated = updated;
    }
}
