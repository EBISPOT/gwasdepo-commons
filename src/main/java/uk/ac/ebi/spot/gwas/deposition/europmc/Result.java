package uk.ac.ebi.spot.gwas.deposition.europmc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;



@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {

    @JsonProperty("electronicPublicationDate")
    private String electronicPublicationDate;

    @JsonProperty("pmid")
    private String pmid;

    @JsonProperty("title")
    private String title;

    @JsonProperty("authorList")
    private AuthorList authorList;

    @JsonProperty("investigatorList")
    private InvestigatorList investigatorList;

    @JsonProperty("journalInfo")
    private JournalInfo journalInfo;

    @JsonProperty("doi")
    private String doi;

    public Result(@JsonProperty("electronicPublicationDate") String electronicPublicationDate,
                  @JsonProperty("pmid") String pmid,
                  @JsonProperty("title") String title,
                  @JsonProperty("authorList")  AuthorList authorList,
                  @JsonProperty("investigatorList") InvestigatorList investigatorList,
                  @JsonProperty("journalInfo") JournalInfo journalInfo,
                  @JsonProperty("doi") String doi) {
        this.electronicPublicationDate = electronicPublicationDate;
        this.pmid = pmid;
        this.title = title;
        this.authorList = authorList;
        this.investigatorList = investigatorList;
        this.journalInfo = journalInfo;
        this.doi = doi;
    }

    public String getElectronicPublicationDate() {
        return electronicPublicationDate;
    }

    public void setElectronicPublicationDate(String electronicPublicationDate) {
        this.electronicPublicationDate = electronicPublicationDate;
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

    public AuthorList getAuthorList() {
        return authorList;
    }

    public void setAuthorList(AuthorList authorList) {
        this.authorList = authorList;
    }

    public InvestigatorList getInvestigatorList() {
        return investigatorList;
    }

    public void setInvestigatorList(InvestigatorList investigatorList) {
        this.investigatorList = investigatorList;
    }

    public JournalInfo getJournalInfo() {
        return journalInfo;
    }

    public void setJournalInfo(JournalInfo journalInfo) {
        this.journalInfo = journalInfo;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }
}
