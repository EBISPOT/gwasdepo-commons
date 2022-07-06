package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.core.Relation;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonPropertyOrder({"Curated reported trait","GCST","studytag"})
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(value = "studyPatchRequest", collectionRelation = "studyPatchRequests")
public class StudyPatchRequest {

    private static final long serialVersionUID = -8217595733789025539L;

    @JsonProperty("GCST")
    private String gcst;

    @JsonProperty("studytag")
    private String studyTag;

    @JsonProperty("Curated reported trait")
    private String curatedReportedTrait;

}

