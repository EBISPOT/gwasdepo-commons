package uk.ac.ebi.spot.gwas.deposition.dto.gwas;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class GWASCatalogStudyDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(GWASCatalogStudyDto.class)
                .verify();
    }


}