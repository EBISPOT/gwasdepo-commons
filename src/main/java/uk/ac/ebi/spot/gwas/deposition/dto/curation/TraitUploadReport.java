package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.core.Relation;

import java.io.Serializable;

@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(value = "traitUploadReport", collectionRelation = "traitUploadReports")
public class TraitUploadReport extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = -216796408264946119L;

    @JsonProperty("trait")
    private String trait;

    @JsonProperty("uploadComment")
    private String uploadComment;

    public TraitUploadReport(@JsonProperty("trait") String trait,
                             @JsonProperty("uploadComment") String uploadComment) {
        this.trait = trait;
        this.uploadComment = uploadComment;
    }

    public String getTrait() {
        return trait;
    }

    public String getUploadComment() {
        return uploadComment;
    }
}
