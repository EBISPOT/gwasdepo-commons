package uk.ac.ebi.spot.gwas.deposition.dto.ingest;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;
import uk.ac.ebi.spot.gwas.deposition.dto.ingest.SubmissionDto;

public class SubmissionDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(SubmissionDto.class)
                .verify();
    }

}