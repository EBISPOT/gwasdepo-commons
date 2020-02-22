package uk.ac.ebi.spot.gwas.deposition.exception;

public class EmailAccountNotLinkedToGlobusException extends RuntimeException {
    public EmailAccountNotLinkedToGlobusException(String message) {
        super(message);
    }
}
