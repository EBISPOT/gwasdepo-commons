package uk.ac.ebi.spot.gwas.deposition.dto.summarystats;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SSGlobusFolderDto implements Serializable {

    private static final long serialVersionUID = 2007919044826434225L;

    @JsonProperty("uniqueID")
    private final String uniqueId;

    @JsonProperty("email")
    private final String email;

    @JsonCreator
    public SSGlobusFolderDto(@JsonProperty("uniqueID") String uniqueId,
                             @JsonProperty("email") String email) {
        this.uniqueId = uniqueId;
        this.email = email;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public String getEmail() {
        return email;
    }
}
