package uk.ac.ebi.spot.gwas.deposition.dto.summarystats;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class SSGlobusFolderResponseDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(SSGlobusFolderResponseDto.class)
                .verify();
    }

}