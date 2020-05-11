package uk.ac.ebi.spot.gwas.deposition.dto.templateschema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import uk.ac.ebi.spot.gwas.deposition.dto.StudyDto;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SSTemplateCuratorRequestStudyDto implements Serializable {

    private static final long serialVersionUID = 4278976703751036662L;

    @JsonProperty("study")
    private final List<StudyDto> study;

    @JsonCreator
    public SSTemplateCuratorRequestStudyDto(@JsonProperty("study") List<StudyDto> study) {
        this.study = study;
    }

    public List<StudyDto> getStudy() {
        return study;
    }
}
