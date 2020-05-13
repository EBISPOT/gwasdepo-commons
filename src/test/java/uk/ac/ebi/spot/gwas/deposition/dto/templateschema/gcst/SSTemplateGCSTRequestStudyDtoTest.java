package uk.ac.ebi.spot.gwas.deposition.dto.templateschema.gcst;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class SSTemplateGCSTRequestStudyDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(SSTemplateGCSTRequestStudyDto.class)
                .verify();
    }
}