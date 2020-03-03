package uk.ac.ebi.spot.gwas.deposition.domain;

import org.joda.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;
import uk.ac.ebi.spot.gwas.deposition.constants.ManuscriptStatus;

@Document(collection = "manuscripts")
@CompoundIndexes({@CompoundIndex(name = "archived_user", def = "{'created_userId': 1, 'archived': 1}"),
        @CompoundIndex(name = "id_archived_user", def = "{'id': 1, 'archived': 1, 'created_userId': 1}")})
public class Manuscript {

    @Id
    private String id;

    private String publicationId;

    private String status;

    private String journal;

    private String title;

    private String firstAuthor;

    private LocalDate submissionDate;

    private LocalDate acceptanceDate;

    private CorrespondingAuthor correspondingAuthor;

    private Provenance created;

    private Provenance lastUpdated;

    private boolean archived;

    public Manuscript() {

    }

    public Manuscript(String title, String firstAuthor, String journal, LocalDate submissionDate,
                      LocalDate acceptanceDate, CorrespondingAuthor correspondingAuthor, Provenance created) {
        this.status = ManuscriptStatus.NEW.name();
        this.journal = journal;
        this.title = title;
        this.firstAuthor = firstAuthor;
        this.submissionDate = submissionDate;
        this.acceptanceDate = acceptanceDate;
        this.correspondingAuthor = correspondingAuthor;
        this.created = created;
        this.lastUpdated = created;
        this.archived = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(String publicationId) {
        this.publicationId = publicationId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstAuthor() {
        return firstAuthor;
    }

    public void setFirstAuthor(String firstAuthor) {
        this.firstAuthor = firstAuthor;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    public LocalDate getAcceptanceDate() {
        return acceptanceDate;
    }

    public void setAcceptanceDate(LocalDate acceptanceDate) {
        this.acceptanceDate = acceptanceDate;
    }

    public CorrespondingAuthor getCorrespondingAuthor() {
        return correspondingAuthor;
    }

    public void setCorrespondingAuthor(CorrespondingAuthor correspondingAuthor) {
        this.correspondingAuthor = correspondingAuthor;
    }

    public Provenance getCreated() {
        return created;
    }

    public void setCreated(Provenance created) {
        this.created = created;
    }

    public Provenance getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Provenance lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }
}
