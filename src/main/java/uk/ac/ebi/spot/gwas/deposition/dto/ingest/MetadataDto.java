package uk.ac.ebi.spot.gwas.deposition.dto.ingest;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MetadataDto implements Serializable {

    private static final long serialVersionUID = -1395295204487673254L;

    @JsonProperty("noStudies")
    private final int noStudies;

    @JsonProperty("noAssociations")
    private final int noAssociations;

    @JsonProperty("noSamples")
    private final int noSamples;

    @JsonProperty("noNotes")
    private final int noNotes;

    @JsonCreator
    public MetadataDto(@JsonProperty("noStudies") int noStudies,
                       @JsonProperty("noAssociations") int noAssociations,
                       @JsonProperty("noSamples") int noSamples,
                       @JsonProperty("noNotes") int noNotes) {
        this.noStudies = noStudies;
        this.noAssociations = noAssociations;
        this.noSamples = noSamples;
        this.noNotes = noNotes;
    }

    public int getNoStudies() {
        return noStudies;
    }

    public int getNoAssociations() {
        return noAssociations;
    }

    public int getNoSamples() {
        return noSamples;
    }

    public int getNoNotes() {
        return noNotes;
    }
}
