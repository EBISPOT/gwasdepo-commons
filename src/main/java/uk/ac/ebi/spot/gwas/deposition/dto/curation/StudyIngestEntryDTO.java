package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.joda.time.LocalDate;

import java.util.List;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudyIngestEntryDTO {

    @JsonProperty("reportedTrait")
    private String reportedTrait;

    @JsonProperty("efoTraits")
    private List<String> efoTraits;

    @JsonProperty("sumstatsFlag")
    private Boolean sumstatsFlag;

    @JsonProperty("pooledFlag")
    private Boolean pooledFlag;

    @JsonProperty("gxeFlag")
    private Boolean gxeFlag;

    @JsonProperty("notes")
    private List<String> notes;

    @JsonProperty("pmid")
    private String pmid;

    @JsonProperty("bowId")
    private String bowId;

    @JsonProperty("submissionId")
    private String submissionId;

    @JsonProperty("publicationDate")
    private LocalDate publicationDate;

    @JsonProperty("firstAuthor")
    private String firstAuthor;

    @JsonProperty("title")
    private String title;

    @JsonProperty("accessionId")
    private String accessionId;
}
