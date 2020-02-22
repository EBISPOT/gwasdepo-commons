package uk.ac.ebi.spot.gwas.deposition.messaging.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Map;

/**
 * Created by tudor on 26/01/17.
 */
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TopicMessageDto implements Serializable {

    private static final long serialVersionUID = -1668418075123008831L;

    @NotNull
    @JsonProperty("timestamp")
    private final String timestamp;

    @JsonProperty("entityId")
    private final String entityId;

    @JsonProperty("messageType")
    private final String messageType;

    @JsonProperty("content")
    private final String content;

    @JsonProperty("metadata")
    private final Map<String, String> metadata;

    public TopicMessageDto(@JsonProperty("timestamp") String timestamp,
                           @JsonProperty("entityId") String entityId,
                           @JsonProperty("messageType") String messageType,
                           @JsonProperty("content") String content,
                           @JsonProperty("metadata") Map<String, String> metadata) {
        this.timestamp = timestamp;
        this.entityId = entityId;
        this.messageType = messageType;
        this.content = content;
        this.metadata = metadata;
    }

    public String getEntityId() {
        return entityId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getMessageType() {
        return messageType;
    }

    public String getContent() {
        return content;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

}
