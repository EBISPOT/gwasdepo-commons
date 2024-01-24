package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MatchPublicationReport {

    private String submissionID;


    private String pubMedID;


    private String author;


    private String title;


    private String doi;


    private String cosScore;


    private String levDistance;


    private String jwScore;

}
