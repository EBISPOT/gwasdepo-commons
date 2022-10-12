package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;

@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CuratorDTO {

    private static final long serialVersionUID = 3094792753261938894L;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("username")
    private String username;

    @JsonProperty("email")
    private String email;

    public CuratorDTO(@JsonProperty("lastName") String lastName,
                      @JsonProperty("firstName") String firstName,
                      @JsonProperty("username") String username,
                      @JsonProperty("email") String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.username = username;
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
