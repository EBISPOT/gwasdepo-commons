package uk.ac.ebi.spot.gwas.deposition.audit;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class AuditEntryDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(AuditEntryDto.class)
                .verify();
    }

}