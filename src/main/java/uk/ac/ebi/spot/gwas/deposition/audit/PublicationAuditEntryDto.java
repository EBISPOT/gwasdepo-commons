package uk.ac.ebi.spot.gwas.deposition.audit;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.core.Relation;
import uk.ac.ebi.spot.gwas.deposition.dto.ProvenanceDto;

import java.io.Serializable;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@Builder
@Relation(value = "publicationAuditEntryDto", collectionRelation = "publicationAuditEntryDtos")
public class PublicationAuditEntryDto extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = 9048843867605119333L;

    @JsonProperty("publicationId")
    private String publicationId;
    @JsonProperty("event")
    private String event;
    @JsonProperty("eventDetails")
    private String eventDetails;

    @JsonProperty("created")
    private ProvenanceDto provenanceDto;
    @JsonProperty("isPublication")
    private Boolean isPublication;

    public PublicationAuditEntryDto(@JsonProperty("publicationId") String publicationId,
                                    @JsonProperty("event") String event,
                                    @JsonProperty("eventDetails") String eventDetails,
                                    @JsonProperty("created") ProvenanceDto provenanceDto,
                                    @JsonProperty("isPublication") Boolean isPublication) {
        this.publicationId = publicationId;
        this.event = event;
        this.eventDetails = eventDetails;
        this.provenanceDto = provenanceDto;
        this.isPublication = isPublication;
    }

    public String getPublicationId() {
        return publicationId;
    }

    public String getEvent() {
        return event;
    }

    public String getEventDetails() {
        return eventDetails;
    }


    public ProvenanceDto getProvenanceDto() {
        return provenanceDto;
    }

    public Boolean getPublication() {
        return isPublication;
    }
}
