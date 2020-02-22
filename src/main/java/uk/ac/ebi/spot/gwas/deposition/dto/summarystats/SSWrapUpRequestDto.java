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
    @JsonProperty("pmid")
    private final String pmid;

    @NotEmpty
    @JsonProperty("authorName")
    private final String authorName;

    @NotEmpty
    @JsonProperty("studyList")
    private final List<SSWrapUpRequestEntryDto> studyList;

    @JsonCreator
    public SSWrapUpRequestDto(@JsonProperty("pmid") String pmid,
                              @JsonProperty("authorName") String authorName,
                              @JsonProperty("requestEntries") List<SSWrapUpRequestEntryDto> studyList) {
        this.pmid = pmid;
        this.authorName = authorName;
        this.studyList = studyList;
    }

    public String getPmid() {
        return pmid;
    }

    public String getAuthorName() {
        return authorName;
    }

    public List<SSWrapUpRequestEntryDto> getStudyList() {
        return studyList;
    }
}
