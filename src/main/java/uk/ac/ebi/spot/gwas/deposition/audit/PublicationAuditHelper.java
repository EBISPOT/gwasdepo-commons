package uk.ac.ebi.spot.gwas.deposition.audit;

import org.joda.time.DateTime;
import uk.ac.ebi.spot.gwas.deposition.dto.ProvenanceDto;
import uk.ac.ebi.spot.gwas.deposition.dto.UserDto;

public class PublicationAuditHelper {

    public static PublicationAuditEntryDto createAuditEvent(String eventType, String subOrPubId,
                                                            String eventDetails, Boolean isPublication,
                                                            UserDto userDto, DateTime dateTime) {
        return new PublicationAuditEntryDto(
                subOrPubId,
                eventType,
                eventDetails,
                new ProvenanceDto(userDto, dateTime),
                isPublication
                );

    }
}

