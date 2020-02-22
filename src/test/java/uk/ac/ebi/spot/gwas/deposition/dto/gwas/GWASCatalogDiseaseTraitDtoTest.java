package uk.ac.ebi.spot.gwas.deposition.dto.gwas;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class GWASCatalogDiseaseTraitDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(GWASCatalogDiseaseTraitDto.class)
                .verify();
    }

}