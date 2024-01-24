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

    @JsonProperty("id")
    private String id;

    @JsonProperty("status")
    private String status;

    public CurationStatusDTO( @JsonProperty("id") String id, @JsonProperty("status") String status) {
        this.id = id;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

}
