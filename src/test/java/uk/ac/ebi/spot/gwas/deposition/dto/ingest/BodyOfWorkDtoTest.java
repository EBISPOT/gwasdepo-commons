package uk.ac.ebi.spot.gwas.deposition.dto.ingest;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class BodyOfWorkDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(BodyOfWorkDto.class)
                .verify();
    }

}