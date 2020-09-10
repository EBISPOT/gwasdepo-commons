package uk.ac.ebi.spot.gwas.deposition.domain;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Author {

    private String firstName;

    private String lastName;

    private String group;

    private String email;

    public Author(String firstName, String lastName, String group, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }
}
