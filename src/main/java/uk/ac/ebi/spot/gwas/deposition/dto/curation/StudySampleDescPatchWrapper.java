package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.core.Relation;

@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(value = "studySampleDescPatchRequest", collectionRelation = "studySampleDescPatchRequests")
public class StudySampleDescPatchWrapper {

    private static final long serialVersionUID = -2091195109398617353L;

    @JsonProperty("GCST")
    private String gcst;

    @JsonProperty("initialSampleDescription")
    private String initialSampleDescription;

    @JsonProperty("replicateSampleDescription")
    private String replicateSampleDescription;

    @JsonProperty("studyTag")
    private String studyTag;


    public StudySampleDescPatchWrapper(@JsonProperty("GCST") String gcst,
                                       @JsonProperty("initialSampleDescription") String initialSampleDescription,
                                       @JsonProperty("replicateSampleDescription") String replicateSampleDescription,
                                       @JsonProperty("studyTag") String studyTag) {
        this.gcst = gcst;
        this.initialSampleDescription = initialSampleDescription;
        this.replicateSampleDescription = replicateSampleDescription;
        this.studyTag = studyTag;
    }

    public String getGcst() {
        return gcst;
    }

    public String getInitialSampleDescription() {
        return initialSampleDescription;
    }

    public String getReplicateSampleDescription() {
        return replicateSampleDescription;
    }

    public String getStudyTag() {
        return studyTag;
    }
}
