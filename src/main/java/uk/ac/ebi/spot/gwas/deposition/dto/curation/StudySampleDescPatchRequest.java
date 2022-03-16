package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.core.Relation;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(value = "studySampleDescPatchRequest", collectionRelation = "studySampleDescPatchRequests")
public class StudySampleDescPatchRequest extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = -2320837496164102122L;

    @JsonProperty("GCST")
    private String gcst;

    @JsonProperty("initialSampleDescription")
    private String initialSampleDescription;

    @JsonProperty("replicateSampleDescription")
    private String replicateSampleDescription;

    @JsonProperty("studyTag")
    private String studyTag;
}
