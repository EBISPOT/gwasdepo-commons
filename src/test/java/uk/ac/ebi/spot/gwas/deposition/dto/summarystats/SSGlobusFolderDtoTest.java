package uk.ac.ebi.spot.gwas.deposition.dto.summarystats;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class SSGlobusFolderDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(SSGlobusFolderDto.class)
                .verify();
    }

}