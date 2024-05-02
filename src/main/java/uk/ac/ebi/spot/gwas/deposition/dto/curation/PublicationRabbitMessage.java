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


    /*public PublicationRabbitMessage(@JsonProperty("pmid") String pmid,
                                    @JsonProperty("journal") String journal,
                                    @JsonProperty("title") String title,
                                    @JsonProperty("publicationDate")  String publicationDate,
                                    @JsonProperty("authors") List<PublicationAuthorDto> authors,
                                    @JsonProperty("firstAuthor")  PublicationAuthorDto firstAuthor) {
        this.pmid = pmid;
        this.journal = journal;
        this.title = title;
        this.publicationDate = publicationDate;
        this.authors = authors;
        this.firstAuthor = firstAuthor;
    }*/
}
