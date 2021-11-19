package uk.ac.ebi.spot.gwas.deposition.exception;

public class CannotCreateTraitWithDuplicateNameException extends RuntimeException {

    public CannotCreateTraitWithDuplicateNameException(String message) {
        super(message);
    }
}
