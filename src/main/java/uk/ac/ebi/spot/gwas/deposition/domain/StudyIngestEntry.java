package uk.ac.ebi.spot.gwas.deposition.domain;

import org.joda.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "studyIngestEntries")
public class StudyIngestEntry {

    @Id
    private String id;

    private String reportedTrait;

    private List<String> efoTraits;

    private Boolean sumstatsFlag;

    private Boolean pooledFlag;

    private Boolean gxeFlag;

    private List<String> notes;

    private String pmid;

    private String bowId;

    private String submissionId;

    private LocalDate publicationDate;

    private String firstAuthor;

    private String title;

    private String accessionId;

    public String getAccessionId() {
        return accessionId;
    }

    public void setAccessionId(String accessionId) {
        this.accessionId = accessionId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReportedTrait() {
        return reportedTrait;
    }

    public void setReportedTrait(String reportedTrait) {
        this.reportedTrait = reportedTrait;
    }

    public List<String> getEfoTraits() {
        return efoTraits;
    }

    public void setEfoTraits(List<String> efoTraits) {
        this.efoTraits = efoTraits;
    }


    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public String getPmid() {
        return pmid;
    }

    public void setPmid(String pmid) {
        this.pmid = pmid;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getFirstAuthor() {
        return firstAuthor;
    }

    public void setFirstAuthor(String firstAuthor) {
        this.firstAuthor = firstAuthor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getSumstatsFlag() {
        return sumstatsFlag;
    }

    public void setSumstatsFlag(Boolean sumstatsFlag) {
        this.sumstatsFlag = sumstatsFlag;
    }

    public Boolean getPooledFlag() {
        return pooledFlag;
    }

    public void setPooledFlag(Boolean pooledFlag) {
        this.pooledFlag = pooledFlag;
    }

    public Boolean getGxeFlag() {
        return gxeFlag;
    }

    public void setGxeFlag(Boolean gxeFlag) {
        this.gxeFlag = gxeFlag;
    }


    public String getBowId() {
        return bowId;
    }

    public void setBowId(String bowId) {
        this.bowId = bowId;
    }
}
