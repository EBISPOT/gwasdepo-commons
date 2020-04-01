package uk.ac.ebi.spot.gwas.deposition.domain;

import org.joda.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import uk.ac.ebi.spot.gwas.deposition.constants.BodyOfWorkStatus;

import java.util.List;

@Document(collection = "bodyOfWorks")
@CompoundIndexes({@CompoundIndex(name = "archived_user", def = "{'created_userId': 1, 'archived': 1}"),
        @CompoundIndex(name = "id_archived", def = "{'id': 1, 'archived': 1}"),
        @CompoundIndex(name = "id_archived_user", def = "{'id': 1, 'archived': 1, 'created_userId': 1}")})
public class BodyOfWork {

    @Id
    private String id;

    private String title;

    private String description;

    private String journal;

    private String doi;

    private String url;

    private String firstAuthorFirstName;

    private String firstAuthorLastName;

    private List<CorrespondingAuthor> correspondingAuthors;

    private List<String> pmids;

    private String status;

    private String prePrintServer;

    private String preprintServerDOI;

    private LocalDate embargoDate;

    private Boolean embargoUntilPublished;

    private Provenance created;

    private Provenance lastUpdated;

    @Indexed
    private boolean archived;

    public BodyOfWork() {

    }

    public BodyOfWork(String title, String description, String journal, String doi, String url,
                      String firstAuthorFirstName, String firstAuthorLastName, List<CorrespondingAuthor> correspondingAuthors,
                      List<String> pmids, String prePrintServer, String preprintServerDOI, LocalDate embargoDate,
                      Boolean embargoUntilPublished, Provenance created) {
        this.status = BodyOfWorkStatus.NEW.name();
        this.title = title;
        this.description = description;
        this.journal = journal;
        this.doi = doi;
        this.url = url;
        this.firstAuthorFirstName = firstAuthorFirstName;
        this.firstAuthorLastName = firstAuthorLastName;
        this.correspondingAuthors = correspondingAuthors;
        this.pmids = pmids;
        this.prePrintServer = prePrintServer;
        this.preprintServerDOI = preprintServerDOI;
        this.embargoDate = embargoDate;
        this.embargoUntilPublished = embargoUntilPublished;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFirstAuthorFirstName() {
        return firstAuthorFirstName;
    }

    public void setFirstAuthorFirstName(String firstAuthorFirstName) {
        this.firstAuthorFirstName = firstAuthorFirstName;
    }

    public String getFirstAuthorLastName() {
        return firstAuthorLastName;
    }

    public void setFirstAuthorLastName(String firstAuthorLastName) {
        this.firstAuthorLastName = firstAuthorLastName;
    }

    public List<CorrespondingAuthor> getCorrespondingAuthors() {
        return correspondingAuthors;
    }

    public void setCorrespondingAuthors(List<CorrespondingAuthor> correspondingAuthors) {
        this.correspondingAuthors = correspondingAuthors;
    }

    public List<String> getPmids() {
        return pmids;
    }

    public void setPmids(List<String> pmids) {
        this.pmids = pmids;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrePrintServer() {
        return prePrintServer;
    }

    public void setPrePrintServer(String prePrintServer) {
        this.prePrintServer = prePrintServer;
    }

    public String getPreprintServerDOI() {
        return preprintServerDOI;
    }

    public void setPreprintServerDOI(String preprintServerDOI) {
        this.preprintServerDOI = preprintServerDOI;
    }

    public LocalDate getEmbargoDate() {
        return embargoDate;
    }

    public void setEmbargoDate(LocalDate embargoDate) {
        this.embargoDate = embargoDate;
    }

    public Boolean getEmbargoUntilPublished() {
        return embargoUntilPublished;
    }

    public void setEmbargoUntilPublished(Boolean embargoUntilPublished) {
        this.embargoUntilPublished = embargoUntilPublished;
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
