package uk.ac.ebi.spot.gwas.deposition.dto.gwas;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class GWASCatalogLinksDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(GWASCatalogLinksDto.class)
                .verify();
    }

}