
package uk.ac.ebi.spot.gwas.deposition.solr;

import lombok.EqualsAndHashCode;
import org.apache.solr.client.solrj.beans.Field;
import org.joda.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;
import java.io.Serializable;


@SolrDocument(collection = "publications")
@EqualsAndHashCode
public class SOLRPublication implements Serializable {

    private static final long serialVersionUID = 8136204711904860814L;

    @Id
    private String id;

    @Field
    @Indexed(searchable = false)
    private String publicationid;

    @Field
    @Indexed(searchable = false)
    private String pmid;

    @Field
    @Indexed
    private String title;

    @Field
    @Indexed
    private String firstAuthor;

    @Field
    @Indexed(searchable = false)
    private String status;

    @Field
    @Indexed(searchable = false)
    private String journal;

    @Field
    @Indexed(searchable = false)
    private LocalDate publicationDate;

    @Field
    @Indexed(searchable = false)
    private String correspondingAuthor;

    @Field
    @Indexed
    private String curator;

    @Field
    @Indexed
    private String curationStatus;

    @Field
    @Indexed
    private String submitter;

    public SOLRPublication() {
    }

    public SOLRPublication(String publicationid, String pmid, String title, String firstAuthor,
                           String status, String journal, LocalDate publicationDate, String correspondingAuthor,
                           String curator, String curationStatus, String submitter) {
        this.publicationid = publicationid;
        this.pmid = pmid;
        this.title = title;
        this.firstAuthor = firstAuthor;
        this.status = status;
        this.journal = journal;
        this.publicationDate = publicationDate;
        this.correspondingAuthor = correspondingAuthor;
        this.curator = curator;
        this.curationStatus = curationStatus;
        this.submitter = submitter;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublicationid() {
        return publicationid;
    }

    public void setPublicationid(String publicationid) {
        this.publicationid = publicationid;
    }

    public String getPmid() {
        return pmid;
    }

    public void setPmid(String pmid) {
        this.pmid = pmid;
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

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getCorrespondingAuthor() {
        return correspondingAuthor;
    }

    public void setCorrespondingAuthor(String correspondingAuthor) {
        this.correspondingAuthor = correspondingAuthor;
    }

    public String getCurator() {
        return curator;
    }

    public void setCurator(String curator) {
        this.curator = curator;
    }

    public String getCurationStatus() {
        return curationStatus;
    }

    public void setCurationStatus(String curationStatus) {
        this.curationStatus = curationStatus;
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }
}

