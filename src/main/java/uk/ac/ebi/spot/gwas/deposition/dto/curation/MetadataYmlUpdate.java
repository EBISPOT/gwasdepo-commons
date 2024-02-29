package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
//@AllArgsConstructor
@Builder
public class MetadataYmlUpdate implements Serializable {

    private static final long serialVersionUID = -8798172291691050974L;


    @JsonProperty("args")
    List<String> args = null;

    @JsonProperty("task")
    String task = null;

    @JsonProperty("id")
    String id = null;

    public MetadataYmlUpdate(@JsonProperty("args") List<String> args,
                             @JsonProperty("task") String task ,
                             @JsonProperty("id") String id) {
        this.args = args;
        this.task = task;
        this.id = id;
    }
}
