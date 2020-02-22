package uk.ac.ebi.spot.gwas.deposition.util;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class QueueAuditTrailDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(QueueAuditTrailDto.class)
                .verify();
    }

}