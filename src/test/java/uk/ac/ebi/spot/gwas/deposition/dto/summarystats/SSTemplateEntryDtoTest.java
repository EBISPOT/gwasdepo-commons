package uk.ac.ebi.spot.gwas.deposition.dto.summarystats;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class SSTemplateEntryDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(SSTemplateEntryDto.class)
                .verify();
    }

}