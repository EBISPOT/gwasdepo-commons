package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.ResourceSupport;

import java.io.Serializable;
@Data
@AllArgsConstructor
@Builder
public class MatchPublicationReportDTO extends ResourceSupport implements Serializable {


    @JsonProperty("submissionID")
    private String submissionID;

    @JsonProperty("pubMedID")
    private String pubMedID;

    @JsonProperty("author")
    private String author;

    @JsonProperty("title")
    private String title;

    @JsonProperty("doi")
    private String doi;

    @JsonProperty("cosScore")
    private String cosScore;

    @JsonProperty("levDistance")
    private String levDistance;

    @JsonProperty("jwScore")
    private String jwScore;
}
