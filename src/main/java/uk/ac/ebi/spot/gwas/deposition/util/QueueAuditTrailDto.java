package uk.ac.ebi.spot.gwas.deposition.util;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class QueueAuditTrailDto implements Serializable {

    private static final long serialVersionUID = 500475712508429530L;

    @JsonProperty("queue")
    private final String queue;

    @JsonProperty("auditTrail")
    private final List<String> auditTrail;

    @JsonCreator
    public QueueAuditTrailDto(@JsonProperty("queue") String queue,
                              @JsonProperty("auditTrail") List<String> auditTrail) {
        this.queue = queue;
        this.auditTrail = auditTrail;
    }

    public String getQueue() {
        return queue;
    }

    public List<String> getAuditTrail() {
        return auditTrail;
    }
}
