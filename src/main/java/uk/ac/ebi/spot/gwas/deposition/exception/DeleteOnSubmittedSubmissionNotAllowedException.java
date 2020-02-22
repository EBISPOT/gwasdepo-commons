package uk.ac.ebi.spot.gwas.deposition.exception;

public class DeleteOnSubmittedSubmissionNotAllowedException extends RuntimeException {

    public DeleteOnSubmittedSubmissionNotAllowedException(String message) {
        super(message);
    }
}
