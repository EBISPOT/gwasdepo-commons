package uk.ac.ebi.spot.gwas.deposition.dto.ingest;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class ManuscriptDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(ManuscriptDto.class)
                .verify();
    }

}