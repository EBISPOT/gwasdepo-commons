package uk.ac.ebi.spot.gwas.deposition.audit;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Map;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AuditEntryEnvelopeDto implements Serializable {

    private static final long serialVersionUID = -3825914958195170687L;

    @JsonProperty("userId")
    private final String userId;

    @JsonProperty("action")
    private final String action;

    @JsonProperty("outcome")
    private final String outcome;

    @JsonProperty("entityId")
    private final String entityId;

    @JsonProperty("context")
    private final String context;

    @JsonProperty("metadata")
    private final Map<String, String> metadata;

    @JsonCreator
    public AuditEntryEnvelopeDto(@JsonProperty("userId") String userId,
                                 @JsonProperty("action") String action,
                                 @JsonProperty("outcome") String outcome,
                                 @JsonProperty("entityId") String entityId,
                                 @JsonProperty("context") String context,
                                 @JsonProperty("metadata") Map<String, String> metadata) {
        this.userId = userId;
        this.action = action;
        this.outcome = outcome;
        this.entityId = entityId;
        this.context = context;
        this.metadata = metadata;
    }

    public String getUserId() {
        return userId;
    }

    public String getAction() {
        return action;
    }

    public String getEntityId() {
        return entityId;
    }

    public String getContext() {
        return context;
    }

    public String getOutcome() {
        return outcome;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }
}
