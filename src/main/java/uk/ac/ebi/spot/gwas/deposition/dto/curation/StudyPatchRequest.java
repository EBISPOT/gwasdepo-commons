package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.core.Relation;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(value = "studyPatchRequest", collectionRelation = "studyPatchRequests")
public class StudyPatchRequest {

    @JsonProperty("GCST")
    private String gcst;

    @JsonProperty("studytag")
    private String studyTag;

    @JsonProperty("Curated reported trait")
    private String curatedReportedTrait;

}

