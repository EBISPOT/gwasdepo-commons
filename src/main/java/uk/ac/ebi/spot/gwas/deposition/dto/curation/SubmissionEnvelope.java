package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import lombok.Data;
import org.joda.time.LocalDate;

@Data
public class SubmissionEnvelope {

    private String id;
    private String pubMedID;
    private String title;
    private String author;
    private String journal;
    private String status;
    private String curator;
    private String created;
    private String publicationStatus;
    private String doi;
    private LocalDate publicationDate;
    private String correspondingAuthor;
    private SubmissionType submissionType;
    private ImportStatus importStatus;


}
