package uk.ac.ebi.spot.gwas.deposition.domain;

import lombok.Data;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "curationStatusSnapshotStatsEntry")
@Data
public class CurationStatusSnapshotStatsEntry {

    @Id
    private String id;

    private String awaitSubmissionCount;

    private String awaitLiteratureCount;

    private String awaitingLevel2Completion;

    private String awaitingLevel2CompletionWithAccsns;

    private String awaitingEFOMapping;

    private String outstandingQuery;

    private String totalPublished;

    @Indexed
    private DateTime timestamp;

}
