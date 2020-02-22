package uk.ac.ebi.spot.gwas.deposition.domain;

import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "queueAuditEntries")
@CompoundIndexes({@CompoundIndex(name = "eemd", def = "{'objectHash': 1, 'entityType': 1, 'messageType': 1, 'direction': 1}"),
        @CompoundIndex(name = "qdir", def = "{'queue': 1, 'direction': 1}"),
        @CompoundIndex(name = "aqdir", def = "{'auditHash': 1, 'queue': 1, 'direction': 1}")})
public class QueueAuditEntry {

    @Id
    private String id;

    @Indexed
    private String direction;

    @Indexed
    private String queue;

    private String entityId;

    private String entityType;

    private String objectHash;

    private String contextId;

    private String messageType;

    private String auditHash;

    private DateTime timestamp;

    public QueueAuditEntry() {

    }

    public QueueAuditEntry(String entityId, String entityType,
                           String contextId, String objectHash,
                           String queue, String direction,
                           String messageType, String auditHash) {
        this.direction = direction;
        this.queue = queue;
        this.entityId = entityId;
        this.entityType = entityType;
        this.objectHash = objectHash;
        this.contextId = contextId;
        this.messageType = messageType;
        this.auditHash = auditHash;
        this.timestamp = DateTime.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getContextId() {
        return contextId;
    }

    public void setContextId(String contextId) {
        this.contextId = contextId;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public DateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getObjectHash() {
        return objectHash;
    }

    public void setObjectHash(String objectHash) {
        this.objectHash = objectHash;
    }

    public String getAuditHash() {
        return auditHash;
    }

    public void setAuditHash(String auditHash) {
        this.auditHash = auditHash;
    }
}
