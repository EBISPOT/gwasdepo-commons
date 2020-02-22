package uk.ac.ebi.spot.gwas.deposition.domain;

import org.joda.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Document(collection = "dailyStats")
public class DailyStats {

    @Id
    private String id;

    private Map<String, Integer> stats;

    private List<String> newIncompleteSubmissions;

    private List<String> newSubmitted;

    private LocalDate date;

    public DailyStats() {
        stats = new HashMap<>();
        newIncompleteSubmissions = new ArrayList<>();
        newSubmitted = new ArrayList<>();
        this.date = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addStats(String key, int value) {
        this.stats.put(key, value);
    }

    public Map<String, Integer> getStats() {
        return stats;
    }

    public void setStats(Map<String, Integer> stats) {
        this.stats = stats;
    }

    public List<String> getNewIncompleteSubmissions() {
        return newIncompleteSubmissions;
    }

    public void setNewIncompleteSubmissions(List<String> newIncompleteSubmissions) {
        this.newIncompleteSubmissions = newIncompleteSubmissions;
    }

    public List<String> getNewSubmitted() {
        return newSubmitted;
    }

    public void setNewSubmitted(List<String> newSubmitted) {
        this.newSubmitted = newSubmitted;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void addNewSubmitted(String newSubmittedId) {
        this.newSubmitted.add(newSubmittedId);
    }

    public void addNewIncompleteSubmissions(String newIncompleteSubmissionId) {
        this.newIncompleteSubmissions.add(newIncompleteSubmissionId);
    }
}
