package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.ResourceSupport;

import java.io.Serializable;

@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CurationStatusDTO extends ResourceSupport implements Serializable {


    private static final long serialVersionUID = -8767756436682259521L;

    @JsonProperty("curationStatusId")
    private String curationStatusId;

    @JsonProperty("status")
    private String status;

    public CurationStatusDTO( @JsonProperty("curationStatusId") String curationStatusId, @JsonProperty("status") String status) {
        this.curationStatusId = curationStatusId;
        this.status = status;
    }

    public String getCurationStatusId() {
        return curationStatusId;
    }

    public String getStatus() {
        return status;
    }

}
