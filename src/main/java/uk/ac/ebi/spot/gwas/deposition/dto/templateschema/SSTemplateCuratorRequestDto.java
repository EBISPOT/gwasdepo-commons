package uk.ac.ebi.spot.gwas.deposition.dto.templateschema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SSTemplateCuratorRequestDto implements Serializable {

    private static final long serialVersionUID = 7335204686733240534L;

    @JsonProperty("curatorPrefilled")
    private final boolean curatorPrefilled;

    @JsonProperty("prefillData")
    private final SSTemplateCuratorRequestStudyDto prefillData;

    @JsonCreator
    public SSTemplateCuratorRequestDto(@JsonProperty("curatorPrefilled") boolean curatorPrefilled,
                                       @JsonProperty("prefillData") SSTemplateCuratorRequestStudyDto prefillData) {
        this.curatorPrefilled = curatorPrefilled;
        this.prefillData = prefillData;
    }


    public boolean isCuratorPrefilled() {
        return curatorPrefilled;
    }

    public SSTemplateCuratorRequestStudyDto getPrefillData() {
        return prefillData;
    }
}
