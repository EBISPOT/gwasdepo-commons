package uk.ac.ebi.spot.gwas.deposition.dto.templateschema;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class TemplateSchemaResponseDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(TemplateSchemaResponseDto.class)
                .verify();
    }

}