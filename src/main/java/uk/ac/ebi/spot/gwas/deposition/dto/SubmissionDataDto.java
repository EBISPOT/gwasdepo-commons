package uk.ac.ebi.spot.gwas.deposition.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.ResourceSupport;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubmissionDataDto extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = 3158029215487618051L;

    @JsonProperty("studies")
    private final List<StudyDto> studies;

    @JsonProperty("associations")
    private final List<AssociationDto> associations;

    @JsonProperty("samples")
    private final List<SampleDto> samples;

    @JsonProperty("notes")
    private final List<NoteDto> notes;

    @JsonCreator
    public SubmissionDataDto(@JsonProperty("studies") List<StudyDto> studies,
                             @JsonProperty("associations") List<AssociationDto> associations,
                             @JsonProperty("samples") List<SampleDto> samples,
                             @JsonProperty("notes") List<NoteDto> notes) {
        this.studies = studies;
        this.associations = associations;
        this.samples = samples;
        this.notes = notes;
    }

    public List<StudyDto> getStudies() {
        return studies;
    }

    public List<AssociationDto> getAssociations() {
        return associations;
    }

    public List<SampleDto> getSamples() {
        return samples;
    }

    public List<NoteDto> getNotes() {
        return notes;
    }
}
