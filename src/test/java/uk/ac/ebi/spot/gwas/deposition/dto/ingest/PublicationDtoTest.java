package uk.ac.ebi.spot.gwas.deposition.dto.ingest;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;
import uk.ac.ebi.spot.gwas.deposition.dto.ingest.PublicationDto;

public class PublicationDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(PublicationDto.class)
                .verify();
    }

}