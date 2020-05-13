package uk.ac.ebi.spot.gwas.deposition.dto.templateschema.gcst;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class SSTemplateGCSTRequestDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(SSTemplateGCSTRequestDto.class)
                .verify();
    }
}