package uk.ac.ebi.spot.gwas.deposition.domain;

public class SSGlobusResponse {

    private boolean valid;

    private String outcome;

    public SSGlobusResponse(boolean valid, String outcome) {
        this.valid = valid;
        this.outcome = outcome;
    }

    public boolean isValid() {
        return valid;
    }

    public String getOutcome() {
        return outcome;
    }
}
