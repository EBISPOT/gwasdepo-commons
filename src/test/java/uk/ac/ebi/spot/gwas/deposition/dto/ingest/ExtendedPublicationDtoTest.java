package uk.ac.ebi.spot.gwas.deposition.dto.ingest;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;
import uk.ac.ebi.spot.gwas.deposition.dto.ingest.ExtendedPublicationDto;

public class ExtendedPublicationDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(ExtendedPublicationDto.class)
                .verify();
    }

}