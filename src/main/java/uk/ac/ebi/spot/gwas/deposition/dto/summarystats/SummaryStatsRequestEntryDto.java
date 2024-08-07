package uk.ac.ebi.spot.gwas.deposition.dto.summarystats;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SummaryStatsRequestEntryDto implements Serializable {

    private static final long serialVersionUID = -3048297682018905381L;

    @NotEmpty
    @JsonProperty("id")
    private final String id;

    @NotEmpty
    @JsonProperty("filePath")
    private final String filePath;

    @JsonProperty("rawFilePath")
    private final String rawFilePath;

    @NotEmpty
    @JsonProperty("md5")
    private final String md5;

    @JsonProperty("assembly")
    private final String assembly;

    @JsonProperty("readme")
    private final String readme;

    @JsonProperty("entryUUID")
    private final String entryUUID;

    @JsonProperty("analysisSoftware")
    private final String analysisSoftware;

    @JsonCreator
    public SummaryStatsRequestEntryDto(@JsonProperty("id") String id,
                                       @JsonProperty("filePath") String filePath,
                                       @JsonProperty("rawFilePath") String rawFilePath,
                                       @JsonProperty("md5") String md5,
                                       @JsonProperty("assembly") String assembly,
                                       @JsonProperty("readme") String readme,
                                       @JsonProperty("entryUUID") String entryUUID,
                                       @JsonProperty("analysisSoftware") String analysisSoftware) {
        this.id = id;
        this.filePath = filePath;
        this.rawFilePath = rawFilePath;
        this.md5 = md5;
        this.assembly = assembly;
        this.readme = readme;
        this.entryUUID = entryUUID;
        this.analysisSoftware = analysisSoftware;
    }

    public String getId() {
        return id;
    }


    public String getRawFilePath() {
        return rawFilePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getMd5() {
        return md5;
    }

    public String getAssembly() {
        return assembly;
    }

    public String getReadme() {
        return readme;
    }

    public String getEntryUUID() {
        return entryUUID;
    }

    public String getAnalysisSoftware() {
        return analysisSoftware;
    }
}
