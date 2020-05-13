package uk.ac.ebi.spot.gwas.deposition.dto.templateschema.gcst;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SSTemplateGCSTRequestDto implements Serializable {

    private static final long serialVersionUID = -2118548567253861242L;

    @JsonProperty("gcstList")
    private final boolean gcstList;

    @JsonProperty("prefillData")
    private final SSTemplateGCSTRequestStudyDto prefillData;

    @JsonCreator
    public SSTemplateGCSTRequestDto(@JsonProperty("gcstList") boolean gcstList,
                                    @JsonProperty("prefillData") SSTemplateGCSTRequestStudyDto prefillData) {
        this.gcstList = gcstList;
        this.prefillData = prefillData;
    }

    public boolean isGcstList() {
        return gcstList;
    }

    public SSTemplateGCSTRequestStudyDto getPrefillData() {
        return prefillData;
    }
}
