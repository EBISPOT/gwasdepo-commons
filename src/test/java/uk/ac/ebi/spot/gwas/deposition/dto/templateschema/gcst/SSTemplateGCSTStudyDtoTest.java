package uk.ac.ebi.spot.gwas.deposition.dto.templateschema.gcst;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class SSTemplateGCSTStudyDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(SSTemplateGCSTStudyDto.class)
                .verify();
    }
}