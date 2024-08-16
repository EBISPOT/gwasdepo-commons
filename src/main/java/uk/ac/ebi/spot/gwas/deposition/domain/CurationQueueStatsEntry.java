package uk.ac.ebi.spot.gwas.deposition.domain;

import lombok.Data;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "curationStatusQueueStatsEntry")
@Data
public class CurationQueueStatsEntry {

    @Id
    private String id;

    private String pmid;

    private String curationStatus;

    private String firstAuthor;

    private String publicationDate;

    private String publicationYear;

    private String publicationMonth;

    private String journal;

    private String title;

    private String associationCount;

    private String studyCount;

    private String userRequested;

    private String isOpenTargets;

    private String fullPvalueSet;

    @Indexed
    private DateTime timestamp;
}
