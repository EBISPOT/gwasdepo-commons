package uk.ac.ebi.spot.gwas.deposition.dto;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

public class FileUploadDtoTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(FileUploadDto.class)
                .suppress(Warning.STRICT_INHERITANCE)
                .withRedefinedSuperclass()
                .withIgnoredFields("links")
                .verify();
    }

}