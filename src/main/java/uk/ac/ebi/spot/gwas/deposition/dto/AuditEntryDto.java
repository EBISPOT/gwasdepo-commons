package uk.ac.ebi.spot.gwas.deposition.dto;

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

    @JsonProperty("entityId")
    private final String entityId;

    @JsonProperty("timestamp")
    @JsonSerialize(using = JsonJodaDateTimeSerializer.class)
    private final DateTime timestamp;

    @JsonProperty("context")
    private final String context;

    @JsonCreator
    public AuditEntryDto(@JsonProperty("id") String id,
                         @JsonProperty("userId") String userId,
                         @JsonProperty("action") String action,
                         @JsonProperty("entityId") String entityId,
                         @JsonProperty("context") String context,
                         @JsonProperty("timestamp") @JsonDeserialize(using = JsonJodaDateTimeDeserializer.class) DateTime timestamp) {
        this.id = id;
        this.userId = userId;
        this.action = action;
        this.entityId = entityId;
        this.context = context;
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

    public DateTime getTimestamp() {
        return timestamp;
    }

    public String getContext() {
        return context;
    }
}
