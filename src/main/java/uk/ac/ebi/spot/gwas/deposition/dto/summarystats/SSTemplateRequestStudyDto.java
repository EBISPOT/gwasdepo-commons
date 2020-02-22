package uk.ac.ebi.spot.gwas.deposition.dto.summarystats;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SSTemplateRequestStudyDto implements Serializable {

    private static final long serialVersionUID = -4985558482226262761L;

    @JsonProperty("study")
    private final List<SSTemplateEntryDto> study;

    @JsonCreator
    public SSTemplateRequestStudyDto(@JsonProperty("study") List<SSTemplateEntryDto> study) {
        this.study = study;
    }

    public List<SSTemplateEntryDto> getStudy() {
        return study;
    }
}
