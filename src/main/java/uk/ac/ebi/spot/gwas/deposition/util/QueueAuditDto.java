package uk.ac.ebi.spot.gwas.deposition.util;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class QueueAuditDto implements Serializable {

    private static final long serialVersionUID = -8489297721549667936L;

    @JsonProperty("entityType")
    private final String entityType;

    @JsonProperty("objectHash")
    private final String objectHash;

    @JsonProperty("contextId")
    private final String contextId;

    @JsonProperty("messageType")
    private final String messageType;

    @JsonCreator
    public QueueAuditDto(@JsonProperty("entityType") String entityType,
                         @JsonProperty("objectHash") String objectHash,
                         @JsonProperty("contextId") String contextId,
                         @JsonProperty("messageType") String messageType) {
        this.entityType = entityType;
        this.objectHash = objectHash;
        this.contextId = contextId;
        this.messageType = messageType;
    }

    public String getEntityType() {
        return entityType;
    }

    public String getObjectHash() {
        return objectHash;
    }

    public String getContextId() {
        return contextId;
    }

    public String getMessageType() {
        return messageType;
    }
}
