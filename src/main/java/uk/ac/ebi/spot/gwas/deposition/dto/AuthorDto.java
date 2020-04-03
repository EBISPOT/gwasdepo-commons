package uk.ac.ebi.spot.gwas.deposition.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AuthorDto implements Serializable {

    private static final long serialVersionUID = -6929375707694069994L;

    @JsonProperty("firstName")
    private final String firstName;

    @JsonProperty("lastName")
    private final String lastName;

    @JsonProperty("group")
    private final String group;

    @JsonProperty("email")
    private final String email;

    @JsonCreator
    public AuthorDto(@JsonProperty("firstName") String firstName,
                     @JsonProperty("lastName") String lastName,
                     @JsonProperty("group") String group,
                     @JsonProperty("email") String email) {
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
