package uk.ac.ebi.spot.gwas.deposition.dto.summarystats;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SSWrapUpRequestEntryDto implements Serializable {

    private static final long serialVersionUID = 5167838674838297920L;

    @NotEmpty
    @JsonProperty("id")
    private final String id;

    @NotEmpty
    @JsonProperty("gcst")
    private final String gcst;

    @JsonCreator
    public SSWrapUpRequestEntryDto(@JsonProperty("id") String id,
                                   @JsonProperty("gcst") String gcst) {
        this.id = id;
        this.gcst = gcst;
    }

    public String getId() {
        return id;
    }

    public String getGcst() {
        return gcst;
    }
}
