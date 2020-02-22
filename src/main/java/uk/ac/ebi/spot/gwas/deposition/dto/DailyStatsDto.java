package uk.ac.ebi.spot.gwas.deposition.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.EqualsAndHashCode;
import org.joda.time.LocalDate;
import uk.ac.ebi.spot.gwas.deposition.util.JsonJodaLocalDateDeserializer;
import uk.ac.ebi.spot.gwas.deposition.util.JsonJodaLocalDateSerializer;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DailyStatsDto implements Serializable {

    private static final long serialVersionUID = 3106803930972151335L;

    @JsonProperty("stats")
    private final Map<String, Integer> stats;

    @JsonProperty("newIncompleteSubmissions")
    private final List<String> newIncompleteSubmissions;

    @JsonProperty("newSubmitted")
    private final List<String> newSubmitted;

    @JsonProperty("date")
    @JsonSerialize(using = JsonJodaLocalDateSerializer.class)
    private final LocalDate date;

    @JsonCreator
    public DailyStatsDto(@JsonProperty("stats") Map<String, Integer> stats,
                         @JsonProperty("newIncompleteSubmissions") List<String> newIncompleteSubmissions,
                         @JsonProperty("newSubmitted") List<String> newSubmitted,
                         @JsonProperty("date") @JsonDeserialize(using = JsonJodaLocalDateDeserializer.class) LocalDate date) {
        this.stats = stats;
        this.newIncompleteSubmissions = newIncompleteSubmissions;
        this.newSubmitted = newSubmitted;
        this.date = date;
    }

    public Map<String, Integer> getStats() {
        return stats;
    }

    public List<String> getNewIncompleteSubmissions() {
        return newIncompleteSubmissions;
    }

    public List<String> getNewSubmitted() {
        return newSubmitted;
    }

    public LocalDate getDate() {
        return date;
    }
}
