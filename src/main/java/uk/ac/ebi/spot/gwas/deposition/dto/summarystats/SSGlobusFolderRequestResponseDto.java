package uk.ac.ebi.spot.gwas.deposition.dto.summarystats;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SSGlobusFolderRequestResponseDto implements Serializable {

    private static final long serialVersionUID = 881621445120467915L;

    @JsonProperty("globusOriginID")
    private final String globusOriginID;

    @JsonProperty("error")
    private final String error;

    @JsonCreator
    public SSGlobusFolderRequestResponseDto(@JsonProperty("globusOriginID") String globusOriginID,
                                            @JsonProperty("error") String error) {
        this.globusOriginID = globusOriginID;
        this.error = error;
    }

    public String getGlobusOriginID() {
        return globusOriginID;
    }


    public String getError() {
        return error;
    }
}
