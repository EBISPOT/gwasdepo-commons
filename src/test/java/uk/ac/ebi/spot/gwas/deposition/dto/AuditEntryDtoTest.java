package uk.ac.ebi.spot.gwas.deposition.dto;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;
import uk.ac.ebi.spot.gwas.deposition.audit.AuditEntryDto;

public class AuditEntryDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(AuditEntryDto.class)
                .verify();
    }

}