package uk.ac.ebi.spot.gwas.deposition.exception;

public class CannotCreateSubmissionOnExistingBodyOfWork extends RuntimeException {

    public CannotCreateSubmissionOnExistingBodyOfWork(String message) {
        super(message);
    }
}
