package uk.ac.ebi.spot.gwas.deposition.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class UserDto implements Serializable {

    private static final long serialVersionUID = 4908356522704320852L;

    @NotEmpty
    @JsonProperty("name")
    private final String name;

    @NotEmpty
    @JsonProperty("email")
    private final String email;

    @JsonProperty("nickname")
    private final String nickname;

    @JsonProperty("userReference")
    private final String userReference;

    @JsonProperty("domains")
    private final List<String> domains;

    @JsonCreator
    public UserDto(@JsonProperty("name") String name,
                   @JsonProperty("email") String email,
                   @JsonProperty("nickname") String nickname,
                   @JsonProperty("userReference") String userReference,
                   @JsonProperty("domains") List<String> domains) {
        this.name = name;
        this.email = email;
        this.nickname = nickname;
        this.userReference = userReference;
        this.domains = domains;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getNickname() {
        return nickname;
    }

    public List<String> getDomains() {
        return domains;
    }

    public String getUserReference() {
        return userReference;
    }
}
