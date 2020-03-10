package uk.ac.ebi.spot.gwas.deposition.audit;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.EqualsAndHashCode;
import org.joda.time.DateTime;
import uk.ac.ebi.spot.gwas.deposition.util.JsonJodaDateTimeDeserializer;
import uk.ac.ebi.spot.gwas.deposition.util.JsonJodaDateTimeSerializer;

import java.io.Serializable;
import java.util.Map;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AuditEntryDto implements Serializable {

    private static final long serialVersionUID = -3825914958195170687L;

    @JsonProperty("id")
    private final String id;

    @JsonProperty("userId")
    private final String userId;

    @JsonProperty("action")
    private final String action;

    @JsonProperty("outcome")
    private final String outcome;

    @JsonProperty("entityId")
    private final String entityId;

    @JsonProperty("entityType")
    private final String entityType;

    @JsonProperty("timestamp")
    @JsonSerialize(using = JsonJodaDateTimeSerializer.class)
    private final DateTime timestamp;

    @JsonProperty("context")
    private final String context;

    @JsonProperty("metadata")
    private final Map<String, String> metadata;


    @JsonCreator
    public AuditEntryDto(@JsonProperty("id") String id,
                         @JsonProperty("userId") String userId,
                         @JsonProperty("action") String action,
                         @JsonProperty("outcome") String outcome,
                         @JsonProperty("entityId") String entityId,
                         @JsonProperty("entityType") String entityType,
                         @JsonProperty("context") String context,
                         @JsonProperty("metadata") Map<String, String> metadata,
                         @JsonProperty("timestamp") @JsonDeserialize(using = JsonJodaDateTimeDeserializer.class) DateTime timestamp) {
        this.id = id;
        this.userId = userId;
        this.action = action;
        this.outcome = outcome;
        this.entityId = entityId;
        this.entityType = entityType;
        this.context = context;
        this.metadata = metadata;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
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

    public String getEntityType() {
        return entityType;
    }

    public DateTime getTimestamp() {
        return timestamp;
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
