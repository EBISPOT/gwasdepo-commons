package uk.ac.ebi.spot.gwas.deposition.audit;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class AuditEntryEnvelopeDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(AuditEntryEnvelopeDto.class)
                .verify();
    }


}