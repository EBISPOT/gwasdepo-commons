package uk.ac.ebi.spot.gwas.deposition.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "ssTemplateEntryPlaceholders")
public class SSTemplateEntryPlaceholder {

    @Id
    private String id;

    @Indexed
    private String pmid;

    private List<SSTemplateEntry> ssTemplateEntries;

    public SSTemplateEntryPlaceholder(String pmid, List<SSTemplateEntry> ssTemplateEntries) {
        this.pmid = pmid;
        this.ssTemplateEntries = ssTemplateEntries;
    }

    public SSTemplateEntryPlaceholder() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPmid() {
        return pmid;
    }

    public void setPmid(String pmid) {
        this.pmid = pmid;
    }

    public List<SSTemplateEntry> getSsTemplateEntries() {
        return ssTemplateEntries;
    }

    public void setSsTemplateEntries(List<SSTemplateEntry> ssTemplateEntries) {
        this.ssTemplateEntries = ssTemplateEntries;
    }
}
