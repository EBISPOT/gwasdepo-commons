package uk.ac.ebi.spot.gwas.deposition.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.core.Relation;

import java.io.Serializable;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(value = "study", collectionRelation = "studies")
public final class StudyEnvelopeDto implements Serializable {

    private static final long serialVersionUID = 2006633418902327244L;

    @JsonProperty("study_accession")
    private final String accession;

    @JsonCreator
    public StudyEnvelopeDto(@JsonProperty("study_accession") String accession) {
        this.accession = accession;
    }

    public String getAccession() {
        return accession;
    }
}
