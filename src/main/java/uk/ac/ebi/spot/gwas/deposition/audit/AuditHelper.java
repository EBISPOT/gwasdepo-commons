package uk.ac.ebi.spot.gwas.deposition.audit;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import uk.ac.ebi.spot.gwas.deposition.audit.constants.AuditActionType;
import uk.ac.ebi.spot.gwas.deposition.audit.constants.AuditMetadata;
import uk.ac.ebi.spot.gwas.deposition.audit.constants.AuditObjectType;
import uk.ac.ebi.spot.gwas.deposition.audit.constants.AuditOperationOutcome;
import uk.ac.ebi.spot.gwas.deposition.domain.FileUpload;
import uk.ac.ebi.spot.gwas.deposition.domain.Manuscript;
import uk.ac.ebi.spot.gwas.deposition.domain.SSGlobusResponse;
import uk.ac.ebi.spot.gwas.deposition.domain.Submission;
import uk.ac.ebi.spot.gwas.deposition.dto.PublicationDto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuditHelper {

    public static AuditEntryDto manuscriptCreated(String userId, Manuscript manuscript) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TITLE.name(), manuscript.getTitle());

        return new AuditEntryDto(null,
                userId,
                AuditActionType.CREATE.name(),
                AuditOperationOutcome.SUCCESS.name(),
                manuscript.getId(),
                AuditObjectType.MANUSCRIPT.name(),
                null,
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto submissionCreated(String userId, Submission submission, Manuscript manuscript) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.PROVENANCE_TYPE.name(), submission.getProvenanceType());
        metadata.put(AuditMetadata.TITLE.name(), manuscript.getTitle());

        return new AuditEntryDto(null,
                userId,
                AuditActionType.CREATE.name(),
                AuditOperationOutcome.SUCCESS.name(),
                submission.getId(),
                AuditObjectType.SUBMISSION.name(),
                manuscript.getId(),
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto submissionCreated(String userId, Submission submission, PublicationDto publicationDto) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TITLE.name(), publicationDto.getTitle());
        metadata.put(AuditMetadata.PROVENANCE_TYPE.name(), submission.getProvenanceType());
        metadata.put(AuditMetadata.TYPE.name(), submission.getType());

        return new AuditEntryDto(null,
                userId,
                AuditActionType.CREATE.name(),
                AuditOperationOutcome.SUCCESS.name(),
                submission.getId(),
                AuditObjectType.SUBMISSION.name(),
                publicationDto.getPmid(),
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto fileCreated(String userId, FileUpload fileUpload, Submission submission) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TITLE.name(), fileUpload.getFileName());

        return new AuditEntryDto(null,
                userId,
                AuditActionType.CREATE.name(),
                AuditOperationOutcome.SUCCESS.name(),
                fileUpload.getId(),
                AuditObjectType.FILE.name(),
                submission.getId(),
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto submissionRetrieved(String userId, Submission submission) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TYPE.name(), submission.getType());
        metadata.put(AuditMetadata.PROVENANCE_TYPE.name(), submission.getProvenanceType());

        return new AuditEntryDto(null,
                userId,
                AuditActionType.RETRIEVE.name(),
                AuditOperationOutcome.SUCCESS.name(),
                submission.getId(),
                AuditObjectType.SUBMISSION.name(),
                submission.getPublicationId() != null ? submission.getPublicationId() : submission.getManuscriptId(),
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto submissionFailed(String userId, Submission submission) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TYPE.name(), submission.getType());
        metadata.put(AuditMetadata.PROVENANCE_TYPE.name(), submission.getProvenanceType());

        return new AuditEntryDto(null,
                userId,
                AuditActionType.PROCESS.name(),
                AuditOperationOutcome.FAILED.name(),
                submission.getId(),
                AuditObjectType.SUBMISSION.name(),
                submission.getPublicationId() != null ? submission.getPublicationId() : submission.getManuscriptId(),
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto submissionSuccess(String userId, Submission submission) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TYPE.name(), submission.getType());
        metadata.put(AuditMetadata.PROVENANCE_TYPE.name(), submission.getProvenanceType());

        return new AuditEntryDto(null,
                userId,
                AuditActionType.PROCESS.name(),
                AuditOperationOutcome.SUCCESS.name(),
                submission.getId(),
                AuditObjectType.SUBMISSION.name(),
                submission.getPublicationId() != null ? submission.getPublicationId() : submission.getManuscriptId(),
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto fileRetrieved(String userId, FileUpload fileUpload) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TITLE.name(), fileUpload.getFileName());

        return new AuditEntryDto(null,
                userId,
                AuditActionType.RETRIEVE.name(),
                AuditOperationOutcome.SUCCESS.name(),
                fileUpload.getId(),
                AuditObjectType.FILE.name(),
                null,
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto fileDeleted(String userId, FileUpload fileUpload) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TITLE.name(), fileUpload.getFileName());

        return new AuditEntryDto(null,
                userId,
                AuditActionType.DELETE.name(),
                AuditOperationOutcome.SUCCESS.name(),
                fileUpload.getId(),
                AuditObjectType.FILE.name(),
                null,
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto fileValidationFailed(String userId, FileUpload fileUpload, List<String> errors, boolean ss) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TITLE.name(), fileUpload.getFileName());
        metadata.put(AuditMetadata.ERROR.name(), StringUtils.join(errors, "; "));

        return new AuditEntryDto(null,
                userId,
                ss ? AuditActionType.SS_VALIDATION.name() : AuditActionType.VALIDATION.name(),
                AuditOperationOutcome.FAILED.name(),
                fileUpload.getId(),
                AuditObjectType.FILE.name(),
                null,
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto fileValidationSuccess(String userId, FileUpload fileUpload, boolean ss) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TITLE.name(), fileUpload.getFileName());

        return new AuditEntryDto(null,
                userId,
                ss ? AuditActionType.SS_VALIDATION.name() : AuditActionType.VALIDATION.name(),
                AuditOperationOutcome.SUCCESS.name(),
                fileUpload.getId(),
                AuditObjectType.FILE.name(),
                null,
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto manuscriptRetrieved(String userId, Manuscript manuscript) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TITLE.name(), manuscript.getTitle());

        return new AuditEntryDto(null,
                userId,
                AuditActionType.RETRIEVE.name(),
                AuditOperationOutcome.SUCCESS.name(),
                manuscript.getId(),
                AuditObjectType.MANUSCRIPT.name(),
                null,
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto submissionSubmit(String userId, Submission submission) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TYPE.name(), submission.getType());
        metadata.put(AuditMetadata.PROVENANCE_TYPE.name(), submission.getProvenanceType());

        return new AuditEntryDto(null,
                userId,
                AuditActionType.SUBMIT.name(),
                AuditOperationOutcome.SUCCESS.name(),
                submission.getId(),
                AuditObjectType.SUBMISSION.name(),
                submission.getPublicationId() != null ? submission.getPublicationId() : submission.getManuscriptId(),
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto submissionDeleted(String userId, Submission submission, boolean success) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TYPE.name(), submission.getType());
        metadata.put(AuditMetadata.PROVENANCE_TYPE.name(), submission.getProvenanceType());

        return new AuditEntryDto(null,
                userId,
                AuditActionType.DELETE.name(),
                success ? AuditOperationOutcome.SUCCESS.name() : AuditOperationOutcome.FAILED.name(),
                submission.getId(),
                AuditObjectType.SUBMISSION.name(),
                submission.getPublicationId() != null ? submission.getPublicationId() : submission.getManuscriptId(),
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto globusFailed(String userId, PublicationDto publicationDto, SSGlobusResponse outcome) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TITLE.name(), publicationDto.getTitle());
        metadata.put(AuditMetadata.ERROR.name(), outcome != null ? outcome.getOutcome() : "UNKNOWN");

        return new AuditEntryDto(null,
                userId,
                AuditActionType.CREATE.name(),
                AuditOperationOutcome.FAILED.name(),
                null,
                AuditObjectType.GLOBUS.name(),
                publicationDto.getPmid(),
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto globusSuccess(String userId, PublicationDto publicationDto, SSGlobusResponse outcome) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TITLE.name(), publicationDto.getTitle());

        return new AuditEntryDto(null,
                userId,
                AuditActionType.CREATE.name(),
                AuditOperationOutcome.SUCCESS.name(),
                outcome.getOutcome(),
                AuditObjectType.GLOBUS.name(),
                publicationDto.getPmid(),
                metadata,
                DateTime.now());
    }
}
