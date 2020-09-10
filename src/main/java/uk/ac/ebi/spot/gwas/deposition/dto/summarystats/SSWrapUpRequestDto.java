package uk.ac.ebi.spot.gwas.deposition.dto.summarystats;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SSWrapUpRequestDto implements Serializable {

    private static final long serialVersionUID = -8654690473481510296L;

    @NotEmpty
    @JsonProperty("studyList")
    private final List<SSWrapUpRequestEntryDto> studyList;

    @JsonCreator
    public SSWrapUpRequestDto(@JsonProperty("requestEntries") List<SSWrapUpRequestEntryDto> studyList) {
        this.studyList = studyList;
    }

    public List<SSWrapUpRequestEntryDto> getStudyList() {
        return studyList;
    }
}
