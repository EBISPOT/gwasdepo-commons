package uk.ac.ebi.spot.gwas.deposition.messaging.email;

import java.util.Map;

public interface EmailBuilder {

    String getEmailContent(Map<String, Object> metadata);

}
