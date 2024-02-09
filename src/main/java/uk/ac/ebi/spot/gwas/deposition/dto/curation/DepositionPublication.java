package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
//@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepositionPublication {
    private String publicationId;
    private String pmid;
    private String journal;
    private String title;
    private String firstAuthor;
    private DepositionAuthor correspondingAuthor;
    @JsonDeserialize(using = JsonJodaLocalDateDeserializer.class)
    private LocalDate publicationDate;
    private String status;
    @JsonProperty("ssTemplateEntries")
    private List<DepositionSummaryStatsDto> summaryStatsDtoList;
    private String doi;

    public DepositionPublication(String publicationId,
                                 String pmid,
                                 String journal,
                                 String title, String firstAuthor,
                                 DepositionAuthor correspondingAuthor,
                                 @JsonDeserialize(using = JsonJodaLocalDateDeserializer.class) LocalDate publicationDate,
                                 String status,
                                 List<DepositionSummaryStatsDto> summaryStatsDtoList,
                                 String doi) {
        this.publicationId = publicationId;
        this.pmid = pmid;
        this.journal = journal;
        this.title = title;
        this.firstAuthor = firstAuthor;
        this.correspondingAuthor = correspondingAuthor;
        this.publicationDate = publicationDate;
        this.status = status;
        this.summaryStatsDtoList = summaryStatsDtoList;
        this.doi = doi;
    }
}
