package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.hateoas.core.Relation;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Relation(value = "pubAuthSort", collectionRelation = "pubAuthSorts")
public class PublicationAuthorsSortDTO {

    private static final long serialVersionUID = 5604749131952185854L;

    @JsonProperty("publicationId")
    private String publicationId;

    @JsonProperty("authorId")
    private String authorId;

    @JsonProperty("sort")
    public Integer sort;
}
