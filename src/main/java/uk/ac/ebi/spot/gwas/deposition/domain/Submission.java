package uk.ac.ebi.spot.gwas.deposition.domain;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import uk.ac.ebi.spot.gwas.deposition.constants.ReminderStatus;
import uk.ac.ebi.spot.gwas.deposition.constants.Status;
import uk.ac.ebi.spot.gwas.deposition.constants.SubmissionProvenanceType;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "submissions")
@CompoundIndexes({@CompoundIndex(name = "overallStatus_archived", def = "{'overallStatus': 1, 'archived': 1}"),
        @CompoundIndex(name = "oa_lU", def = "{'overallStatus': 1, 'archived': 1, 'lastUpdated': 1}"),
        @CompoundIndex(name = "archived_completed", def = "{'archived': 1, 'completed': 1}"),
        @CompoundIndex(name = "pubId_archived", def = "{'archived': 1, 'publicationId': 1}"),
        @CompoundIndex(name = "pubId_archived_user", def = "{'archived': 1, 'publicationId': 1, 'created_userId': 1}"),
        @CompoundIndex(name = "bw_arch", def = "{'bodyOfWorks': 1, 'archived': 1}"),
        @CompoundIndex(name = "bw_arch_user", def = "{'bodyOfWorks': 1, 'created_userId': 1, 'archived': 1}"),
        @CompoundIndex(name = "id_archived_user", def = "{'id': 1, 'archived': 1, 'created_userId': 1}")})
public class Submission {

    @Id
    private String id;

    @Indexed
    private String publicationId;

    @Indexed
    private List<String> bodyOfWorks;

    @Indexed
    private String overallStatus;

    private String metadataStatus;

    private String summaryStatsStatus;

    @Indexed
    private List<String> studies;

    @Indexed
    private List<String> associations;

    @Indexed
    private List<String> samples;

    @Indexed
    private List<String> notes;

    @Indexed
    private List<String> fileUploads;

    private String globusFolderId;

    private String globusOriginId;

    private LocalDate dateSubmitted;

    private DateTime deletedOn;

    private Provenance created;

    private Provenance lastUpdated;

    private String type;

    private String provenanceType;

    private String reminderStatus;

    @Indexed
    private boolean archived;

    private boolean completed;

    private Boolean agreedToCc0;

    public Submission(String provenanceId, String provenanceType, Provenance created) {
        if (provenanceType.equalsIgnoreCase(SubmissionProvenanceType.BODY_OF_WORK.name())) {
            this.bodyOfWorks = new ArrayList<>();
            this.bodyOfWorks.add(provenanceId);
        } else {
            this.publicationId = provenanceId;
        }
        this.overallStatus = Status.STARTED.name();
        this.metadataStatus = Status.NA.name();
        this.summaryStatsStatus = Status.NA.name();
        this.provenanceType = provenanceType;
        this.created = created;
        this.lastUpdated = created;

        this.studies = new ArrayList<>();
        this.associations = new ArrayList<>();
        this.notes = new ArrayList<>();
        this.samples = new ArrayList<>();
        this.fileUploads = new ArrayList<>();
        this.archived = false;
        this.reminderStatus = ReminderStatus.NONE.name();
    }

    public Submission() {
        this.studies = new ArrayList<>();
        this.associations = new ArrayList<>();
        this.notes = new ArrayList<>();
        this.samples = new ArrayList<>();
        this.fileUploads = new ArrayList<>();
        this.archived = false;
        this.reminderStatus = ReminderStatus.NONE.name();
    }

    public List<String> getBodyOfWorks() {
        return bodyOfWorks;
    }

    public void setBodyOfWorks(List<String> bodyOfWorks) {
        this.bodyOfWorks = bodyOfWorks;
    }

    public String getProvenanceType() {
        return provenanceType;
    }

    public void setProvenanceType(String provenanceType) {
        this.provenanceType = provenanceType;
    }

    public DateTime getDeletedOn() {
        return deletedOn;
    }

    public void setDeletedOn(DateTime deletedOn) {
        this.deletedOn = deletedOn;
    }

    public String getMetadataStatus() {
        return metadataStatus;
    }

    public void setMetadataStatus(String metadataStatus) {
        this.metadataStatus = metadataStatus;
    }

    public String getSummaryStatsStatus() {
        return summaryStatsStatus;
    }

    public void setSummaryStatsStatus(String summaryStatsStatus) {
        this.summaryStatsStatus = summaryStatsStatus;
    }

    public LocalDate getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(LocalDate dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
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

    public String getOverallStatus() {
        return overallStatus;
    }

    public void setOverallStatus(String overallStatus) {
        this.overallStatus = overallStatus;
    }

    public Provenance getCreated() {
        return created;
    }

    public void setCreated(Provenance created) {
        this.created = created;
    }

    public List<String> getStudies() {
        return studies;
    }

    public void setStudies(List<String> studies) {
        this.studies = studies;
    }

    public List<String> getAssociations() {
        return associations;
    }

    public void setAssociations(List<String> associations) {
        this.associations = associations;
    }

    public List<String> getSamples() {
        return samples;
    }

    public void setSamples(List<String> samples) {
        this.samples = samples;
    }

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public List<String> getFileUploads() {
        return fileUploads;
    }

    public void setFileUploads(List<String> fileUploads) {
        this.fileUploads = fileUploads;
    }

    public void addFileUpload(String fileUpload) {
        this.fileUploads.add(fileUpload);
    }

    public void removeFileUpload(String fileUploadId) {
        if (fileUploads.contains(fileUploadId)) {
            this.fileUploads.remove(fileUploadId);
        }
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public void addStudy(String studyId) {
        this.studies.add(studyId);
    }

    public void addAssociation(String associationId) {
        this.associations.add(associationId);
    }

    public void addSample(String sampleId) {
        this.samples.add(sampleId);
    }

    public void addNote(String noteId) {
        this.notes.add(noteId);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Provenance getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Provenance lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    public String getGlobusFolderId() {
        return globusFolderId;
    }

    public void setGlobusFolderId(String globusFolderId) {
        this.globusFolderId = globusFolderId;
    }

    public String getGlobusOriginId() {
        return globusOriginId;
    }

    public void setGlobusOriginId(String globusOriginId) {
        this.globusOriginId = globusOriginId;
    }

    public String getReminderStatus() {
        return reminderStatus;
    }

    public void setReminderStatus(String reminderStatus) {
        this.reminderStatus = reminderStatus;
    }

    public Boolean isAgreedToCc0() {
        return agreedToCc0;
    }

    public void setAgreedToCc0(Boolean agreedToCc0) {
        this.agreedToCc0 = agreedToCc0;
    }
}
