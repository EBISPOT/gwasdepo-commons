package uk.ac.ebi.spot.gwas.deposition.dto;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

public class SubmissionDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(SubmissionDto.class)
                .suppress(Warning.STRICT_INHERITANCE)
                .withRedefinedSuperclass()
                .withIgnoredFields("links")
                .verify();
    }

}