package uk.ac.ebi.spot.gwas.deposition.dto.summarystats;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SSGlobusFolderResponseDto implements Serializable {

    private static final long serialVersionUID = 2710871412052203888L;

    @JsonProperty("uniqueID")
    private final String uniqueId;

    @JsonProperty("globusOriginID")
    private final String globusOriginID;

    @JsonCreator
    public SSGlobusFolderResponseDto(@JsonProperty("uniqueID") String uniqueId,
                                     @JsonProperty("globusOriginID") String globusOriginID) {
        this.uniqueId = uniqueId;
        this.globusOriginID = globusOriginID;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public String getGlobusOriginID() {
        return globusOriginID;
    }
}
