package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.LocalDate;
import uk.ac.ebi.spot.gwas.deposition.util.JsonJodaLocalDateDeserializer;
import uk.ac.ebi.spot.gwas.deposition.util.JsonJodaLocalDateSerializer;

import java.util.List;

@Data
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
    private List<PublicationAuthorDto> authors;

    @JsonProperty("firstAuthor")
    private PublicationAuthorDto firstAuthor;
}
