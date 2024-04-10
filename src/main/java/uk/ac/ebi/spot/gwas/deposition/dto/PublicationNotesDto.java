package uk.ac.ebi.spot.gwas.deposition.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.ResourceSupport;

import java.io.Serializable;
import java.util.List;

@Builder
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class PublicationNotesDto extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = 8865157537548313442L;

    @JsonProperty("noteId")
    private String noteId;

    @JsonProperty("publicationId")
    private String publicationId;

    @JsonProperty("notes")
    private List<String> notes;

    @JsonProperty("created")
    private ProvenanceDto created;

    @JsonProperty("updated")
    private ProvenanceDto updated;


    public PublicationNotesDto(@JsonProperty("noteId") String noteId,
                               @JsonProperty("publicationId") String publicationId,
                               @JsonProperty("notes") List<String> notes,
                               @JsonProperty("created") ProvenanceDto created,
                               @JsonProperty("updated") ProvenanceDto updated) {
        this.noteId = noteId;
        this.publicationId = publicationId;
        this.notes = notes;
        this.created = created;
        this.updated = updated;
    }
}
