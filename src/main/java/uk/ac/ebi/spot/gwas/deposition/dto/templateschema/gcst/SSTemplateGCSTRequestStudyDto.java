package uk.ac.ebi.spot.gwas.deposition.dto.templateschema.gcst;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SSTemplateGCSTRequestStudyDto implements Serializable {

    private static final long serialVersionUID = 6751333054328742904L;

    @JsonProperty("study")
    private final List<SSTemplateGCSTStudyDto> study;

    @JsonCreator
    public SSTemplateGCSTRequestStudyDto(@JsonProperty("study") List<SSTemplateGCSTStudyDto> study) {
        this.study = study;
    }

    public List<SSTemplateGCSTStudyDto> getStudy() {
        return study;
    }
}
