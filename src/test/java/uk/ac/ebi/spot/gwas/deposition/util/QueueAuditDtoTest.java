package uk.ac.ebi.spot.gwas.deposition.util;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class QueueAuditDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(QueueAuditDto.class)
                .verify();
    }

}