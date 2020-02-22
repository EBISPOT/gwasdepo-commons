package uk.ac.ebi.spot.gwas.deposition.messaging.dto;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;
import uk.ac.ebi.spot.gwas.deposition.messaging.dto.TopicMessageDto;

public class TopicMessageDtoTest {
    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(TopicMessageDto.class)
                .verify();
    }

}