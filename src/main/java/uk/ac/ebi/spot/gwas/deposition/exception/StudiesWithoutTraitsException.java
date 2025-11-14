package uk.ac.ebi.spot.gwas.deposition.exception;

public class StudiesWithoutTraitsException extends RuntimeException {

    public StudiesWithoutTraitsException(String message) {
        super(message);
    }
}
