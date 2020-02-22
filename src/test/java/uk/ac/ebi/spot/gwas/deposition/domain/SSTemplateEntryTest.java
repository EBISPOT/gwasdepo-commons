package uk.ac.ebi.spot.gwas.deposition.domain;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

public class SSTemplateEntryTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(SSTemplateEntry.class)
                .suppress(Warning.STRICT_INHERITANCE)
                .suppress(Warning.NONFINAL_FIELDS)
                .verify();
    }

}