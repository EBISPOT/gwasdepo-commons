package uk.ac.ebi.spot.gwas.deposition.dto.templateschema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Map;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TemplateSchemaResponseDto implements Serializable {

    private static final long serialVersionUID = 2790109890376395031L;

    @NotEmpty
    @JsonProperty("schema_version")
    private final String schemaVersion;

    @NotEmpty
    @JsonProperty("submission_types")
    private final Map<String, Map<String, String>> submissionTypes;

    @JsonCreator
    public TemplateSchemaResponseDto(@JsonProperty("schema_version") String schemaVersion,
                                     @JsonProperty("submission_types") Map<String, Map<String, String>> submissionTypes) {
        this.schemaVersion = schemaVersion;
        this.submissionTypes = submissionTypes;
    }

    public String getSchemaVersion() {
        return schemaVersion;
    }

    public Map<String, Map<String, String>> getSubmissionTypes() {
        return submissionTypes;
    }
}
