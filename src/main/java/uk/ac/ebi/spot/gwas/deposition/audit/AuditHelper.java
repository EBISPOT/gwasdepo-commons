package uk.ac.ebi.spot.gwas.deposition.audit;

import org.joda.time.DateTime;
import uk.ac.ebi.spot.gwas.deposition.audit.constants.AuditActionType;
import uk.ac.ebi.spot.gwas.deposition.audit.constants.AuditMetadata;
import uk.ac.ebi.spot.gwas.deposition.audit.constants.AuditObjectType;
import uk.ac.ebi.spot.gwas.deposition.audit.constants.AuditOperationOutcome;
import uk.ac.ebi.spot.gwas.deposition.domain.Manuscript;
import uk.ac.ebi.spot.gwas.deposition.domain.SSGlobusResponse;
import uk.ac.ebi.spot.gwas.deposition.domain.Submission;
import uk.ac.ebi.spot.gwas.deposition.dto.PublicationDto;

import java.util.HashMap;
import java.util.Map;

public class AuditHelper {

    public static AuditEntryDto submissionStarted(String userEmail) {
        return new AuditEntryDto(
                null,
                userEmail,
                AuditActionType.CREATE.name(),
                AuditOperationOutcome.STARTED.name(),
                null,
                AuditObjectType.SUBMISSION.name(),
                null,
                new HashMap<>(),
                DateTime.now());
    }

    public static AuditEntryDto manuscriptCreated(String userEmail, Manuscript manuscript) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TITLE.name(), manuscript.getTitle());

        return new AuditEntryDto(null,
                userEmail,
                AuditActionType.CREATE.name(),
                AuditOperationOutcome.SUCCESS.name(),
                manuscript.getId(),
                AuditObjectType.MANUSCRIPT.name(),
                null,
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto submissionSuccess(String userEmail, Submission submission, Manuscript manuscript) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.PROVENANCE_TYPE.name(), submission.getProvenanceType());
        metadata.put(AuditMetadata.TITLE.name(), manuscript.getTitle());

        return new AuditEntryDto(null,
                userEmail,
                AuditActionType.CREATE.name(),
                AuditOperationOutcome.SUCCESS.name(),
                submission.getId(),
                AuditObjectType.SUBMISSION.name(),
                manuscript.getId(),
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto submissionSuccess(String userEmail, Submission submission, PublicationDto publicationDto) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TITLE.name(), publicationDto.getTitle());
        metadata.put(AuditMetadata.PROVENANCE_TYPE.name(), submission.getProvenanceType());
        metadata.put(AuditMetadata.TYPE.name(), submission.getType());

        return new AuditEntryDto(null,
                userEmail,
                AuditActionType.CREATE.name(),
                AuditOperationOutcome.SUCCESS.name(),
                submission.getId(),
                AuditObjectType.SUBMISSION.name(),
                publicationDto.getPmid(),
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto submissionRetrieve(String userEmail, Submission submission) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TYPE.name(), submission.getType());
        metadata.put(AuditMetadata.PROVENANCE_TYPE.name(), submission.getProvenanceType());

        return new AuditEntryDto(null,
                userEmail,
                AuditActionType.RETRIEVE.name(),
                AuditOperationOutcome.SUCCESS.name(),
                submission.getId(),
                AuditObjectType.SUBMISSION.name(),
                submission.getPublicationId() != null ? submission.getPublicationId() : submission.getManuscriptId(),
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto submissionSubmit(String userEmail, Submission submission) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TYPE.name(), submission.getType());
        metadata.put(AuditMetadata.PROVENANCE_TYPE.name(), submission.getProvenanceType());

        return new AuditEntryDto(null,
                userEmail,
                AuditActionType.SUBMIT.name(),
                AuditOperationOutcome.SUCCESS.name(),
                submission.getId(),
                AuditObjectType.SUBMISSION.name(),
                submission.getPublicationId() != null ? submission.getPublicationId() : submission.getManuscriptId(),
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto submissionDelete(String userEmail, Submission submission, boolean success) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TYPE.name(), submission.getType());
        metadata.put(AuditMetadata.PROVENANCE_TYPE.name(), submission.getProvenanceType());

        return new AuditEntryDto(null,
                userEmail,
                AuditActionType.DELETE.name(),
                success ? AuditOperationOutcome.SUCCESS.name() : AuditOperationOutcome.FAILED.name(),
                submission.getId(),
                AuditObjectType.SUBMISSION.name(),
                submission.getPublicationId() != null ? submission.getPublicationId() : submission.getManuscriptId(),
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto globusFailed(String userEmail, PublicationDto publicationDto, SSGlobusResponse outcome) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TITLE.name(), publicationDto.getTitle());
        metadata.put(AuditMetadata.ERROR.name(), outcome != null ? outcome.getOutcome() : "UNKNOWN");

        return new AuditEntryDto(null,
                userEmail,
                AuditActionType.CREATE.name(),
                AuditOperationOutcome.FAILED.name(),
                null,
                AuditObjectType.GLOBUS.name(),
                publicationDto.getPmid(),
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto globusSuccess(String userEmail, PublicationDto publicationDto, SSGlobusResponse outcome) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TITLE.name(), publicationDto.getTitle());

        return new AuditEntryDto(null,
                userEmail,
                AuditActionType.CREATE.name(),
                AuditOperationOutcome.SUCCESS.name(),
                outcome.getOutcome(),
                AuditObjectType.GLOBUS.name(),
                publicationDto.getPmid(),
                metadata,
                DateTime.now());
    }
}
