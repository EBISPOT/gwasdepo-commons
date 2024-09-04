package uk.ac.ebi.spot.gwas.deposition.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "publicationWeeklyStatsEntry")
@Data
public class PublicationWeeklyStatsEntry {

    @Id
    private String id;


    private String pmidsAdded;


    private String pmidsSubComplete;

    private String pmidsLevel2Done;

    private String pmidsPublished;

    private String pmidsSingleLevelComplete;

    @Indexed
    private DateTime timestamp;
}
