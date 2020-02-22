package uk.ac.ebi.spot.gwas.deposition.dto.summarystats;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class SSTemplateRequestDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(SSTemplateRequestDto.class)
                .verify();
    }

}