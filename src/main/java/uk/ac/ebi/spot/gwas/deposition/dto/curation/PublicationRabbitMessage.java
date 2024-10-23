package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Map;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PublicationRabbitMessage {

    @JsonProperty("pmid")
    private String pmid;

    @JsonProperty("journal")
    private String journal;

    @JsonProperty("title")
    private String title;

    @JsonProperty("publicationDate")
    private String publicationDate;

    @JsonProperty("authors")
    private Map<Integer, PublicationAuthorDto> authors;

    @JsonProperty("firstAuthor")
    private PublicationAuthorDto firstAuthor;

}
