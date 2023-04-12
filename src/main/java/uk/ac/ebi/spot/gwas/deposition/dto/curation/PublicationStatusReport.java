package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.core.Relation;
import uk.ac.ebi.spot.gwas.deposition.dto.PublicationDto;

@Builder
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(value = "publicationStatusReport", collectionRelation = "publicationStatusReports")
public class PublicationStatusReport {

    private static final long serialVersionUID = -2146242129132708460L;

    private PublicationDto publicationDto;

    @JsonProperty("pmid")
    private String pmid;

    @JsonProperty("status")
    private String status;

    public PublicationStatusReport() {
    }

    public PublicationStatusReport(PublicationDto publicationDto, String status, String pmid) {
        this.publicationDto = publicationDto;
        this.status = status;
        this.pmid = pmid;
    }

    public PublicationDto getPublicationDto() {
        return publicationDto;
    }

    public void setPublicationDto(PublicationDto publicationDto) {
        this.publicationDto = publicationDto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPmid() {
        return pmid;
    }

    public void setPmid(String pmid) {
        this.pmid = pmid;
    }
}
