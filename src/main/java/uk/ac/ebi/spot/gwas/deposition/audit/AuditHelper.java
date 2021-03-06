package uk.ac.ebi.spot.gwas.deposition.audit;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import uk.ac.ebi.spot.gwas.deposition.audit.constants.AuditActionType;
import uk.ac.ebi.spot.gwas.deposition.audit.constants.AuditMetadata;
import uk.ac.ebi.spot.gwas.deposition.audit.constants.AuditObjectType;
import uk.ac.ebi.spot.gwas.deposition.audit.constants.AuditOperationOutcome;
import uk.ac.ebi.spot.gwas.deposition.constants.EmbargoConstants;
import uk.ac.ebi.spot.gwas.deposition.domain.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuditHelper {

    public static AuditEntryDto globusCreate(String userId, boolean successful, SSGlobusResponse ssGlobusResponse) {
        Map<String, String> metadata = new HashMap<>();
        if (!successful) {
            if (ssGlobusResponse != null) {
                metadata.put(AuditMetadata.ERROR.name(), ssGlobusResponse.getOutcome());
            } else {
                metadata.put(AuditMetadata.ERROR.name(), "UNKNOWN");
            }
        }

        return new AuditEntryDto(null,
                userId,
                AuditActionType.CREATE.name(),
                successful ? AuditOperationOutcome.SUCCESS.name() : AuditOperationOutcome.FAILED.name(),
                successful ? ssGlobusResponse.getOutcome() : null,
                AuditObjectType.GLOBUS.name(),
                null,
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto bowCreate(String userId, BodyOfWork bodyOfWork) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TITLE.name(), bodyOfWork.getTitle());

        return new AuditEntryDto(null,
                userId,
                AuditActionType.CREATE.name(),
                AuditOperationOutcome.SUCCESS.name(),
                bodyOfWork.getBowId(),
                AuditObjectType.BODY_OF_WORK.name(),
                null,
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto bowUpdate(String userId, BodyOfWork bodyOfWork) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TITLE.name(), bodyOfWork.getTitle());

        return new AuditEntryDto(null,
                userId,
                AuditActionType.UPDATE.name(),
                AuditOperationOutcome.SUCCESS.name(),
                bodyOfWork.getBowId(),
                AuditObjectType.BODY_OF_WORK.name(),
                null,
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto bowRetrieve(String userId, BodyOfWork bodyOfWork) {
        Map<String, String> metadata = new HashMap<>();
        if (bodyOfWork != null) {
            metadata.put(AuditMetadata.TITLE.name(), bodyOfWork.getTitle());
        }

        return new AuditEntryDto(null,
                userId,
                AuditActionType.RETRIEVE.name(),
                AuditOperationOutcome.SUCCESS.name(),
                bodyOfWork != null ? bodyOfWork.getBowId() : null,
                AuditObjectType.BODY_OF_WORK.name(),
                null,
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto bowDelete(String userId, BodyOfWork bodyOfWork, boolean outcome) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TITLE.name(), bodyOfWork.getTitle());

        return new AuditEntryDto(null,
                userId,
                AuditActionType.DELETE.name(),
                outcome ? AuditOperationOutcome.SUCCESS.name() : AuditOperationOutcome.FAILED.name(),
                bodyOfWork.getBowId(),
                AuditObjectType.BODY_OF_WORK.name(),
                null,
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto submissionCreateBOW(String userId, Submission submission, BodyOfWork bodyOfWork,
                                                    boolean start, boolean outcome) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.PROVENANCE_TYPE.name(), submission.getProvenanceType());
        metadata.put(AuditMetadata.TITLE.name(), bodyOfWork.getTitle());
        String embargo = EmbargoConstants.NONE;
        if (bodyOfWork.getEmbargoUntilPublished() != null) {
            if (bodyOfWork.getEmbargoUntilPublished()) {
                embargo = EmbargoConstants.PUBLICATION;
            }
        }
        if (!embargo.equalsIgnoreCase(EmbargoConstants.PUBLICATION)) {
            if (bodyOfWork.getEmbargoDate() != null) {
                embargo = EmbargoConstants.DATE + " " + bodyOfWork.getEmbargoDate().toString();
            }
        }
        metadata.put(AuditMetadata.EMBARGO.name(), embargo);

        return new AuditEntryDto(null,
                userId,
                start ? AuditActionType.CREATE_START.name() : AuditActionType.CREATE.name(),
                outcome ? AuditOperationOutcome.SUCCESS.name() : AuditOperationOutcome.FAILED.name(),
                submission.getId(),
                AuditObjectType.SUBMISSION.name(),
                bodyOfWork.getBowId(),
                metadata,
                DateTime.now());
    }


    public static AuditEntryDto submissionCreatePub(String userId, Submission submission, Publication publication,
                                                    boolean start, boolean outcome, String error) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TITLE.name(), publication.getTitle());
        metadata.put(AuditMetadata.AUTHOR.name(), publication.getFirstAuthor());
        metadata.put(AuditMetadata.PROVENANCE_TYPE.name(), submission.getProvenanceType());
        metadata.put(AuditMetadata.TYPE.name(), submission.getType());
        if (!outcome) {
            metadata.put(AuditMetadata.ERROR.name(), error != null ? error : "UNKNOWN");
        }

        return new AuditEntryDto(null,
                userId,
                start ? AuditActionType.CREATE_START.name() : AuditActionType.CREATE.name(),
                outcome ? AuditOperationOutcome.SUCCESS.name() : AuditOperationOutcome.FAILED.name(),
                submission.getId(),
                AuditObjectType.SUBMISSION.name(),
                publication.getPmid(),
                metadata,
                DateTime.now());
    }


    public static AuditEntryDto submissionRetrieve(String userId, Submission submission) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TYPE.name(), submission.getType());
        metadata.put(AuditMetadata.PROVENANCE_TYPE.name(), submission.getProvenanceType());

        return new AuditEntryDto(null,
                userId,
                AuditActionType.RETRIEVE.name(),
                AuditOperationOutcome.SUCCESS.name(),
                submission.getId(),
                AuditObjectType.SUBMISSION.name(),
                submission.getPublicationId() != null ? submission.getPublicationId() : submission.getBodyOfWorks().get(0),
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto submissionDelete(String userId, Submission submission, boolean success) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TYPE.name(), submission.getType());
        metadata.put(AuditMetadata.PROVENANCE_TYPE.name(), submission.getProvenanceType());

        return new AuditEntryDto(null,
                userId,
                AuditActionType.DELETE.name(),
                success ? AuditOperationOutcome.SUCCESS.name() : AuditOperationOutcome.FAILED.name(),
                submission.getId(),
                AuditObjectType.SUBMISSION.name(),
                submission.getPublicationId() != null ? submission.getPublicationId() : submission.getBodyOfWorks().get(0),
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
                submission.getPublicationId() != null ? submission.getPublicationId() : submission.getBodyOfWorks().get(0),
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto submissionValidate(String userId, Submission submission, boolean outcome, List<String> errors) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TYPE.name(), submission.getType());
        metadata.put(AuditMetadata.PROVENANCE_TYPE.name(), submission.getProvenanceType());
        if (errors != null) {
            if (!errors.isEmpty()) {
                metadata.put(AuditMetadata.ERROR.name(), StringUtils.join(errors, "; "));
            }
        }

        return new AuditEntryDto(null,
                userId,
                AuditActionType.VALIDATION.name(),
                outcome ? AuditOperationOutcome.SUCCESS.name() : AuditOperationOutcome.FAILED.name(),
                submission.getId(),
                AuditObjectType.SUBMISSION.name(),
                submission.getPublicationId() != null ? submission.getPublicationId() : submission.getBodyOfWorks().get(0),
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto fileCreate(String userId, FileUpload fileUpload, Submission submission, boolean outcome, String error) {
        Map<String, String> metadata = new HashMap<>();
        if (fileUpload.getFileName() != null) {
            metadata.put(AuditMetadata.TITLE.name(), fileUpload.getFileName());
        }
        metadata.put(AuditMetadata.TYPE.name(), fileUpload.getType());
        if (!outcome) {
            metadata.put(AuditMetadata.ERROR.name(), error != null ? error : "UNKNOWN");
        }

        return new AuditEntryDto(null,
                userId,
                AuditActionType.CREATE.name(),
                outcome ? AuditOperationOutcome.SUCCESS.name() : AuditOperationOutcome.FAILED.name(),
                fileUpload.getId(),
                AuditObjectType.FILE.name(),
                submission.getId(),
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto fileRetrieve(String userId, FileUpload fileUpload, Submission submission) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TITLE.name(), fileUpload.getFileName());

        return new AuditEntryDto(null,
                userId,
                AuditActionType.RETRIEVE.name(),
                AuditOperationOutcome.SUCCESS.name(),
                fileUpload.getId(),
                AuditObjectType.FILE.name(),
                submission.getId(),
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto fileDelete(String userId, FileUpload fileUpload, Submission submission) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TITLE.name(), fileUpload.getFileName());

        return new AuditEntryDto(null,
                userId,
                AuditActionType.DELETE.name(),
                AuditOperationOutcome.SUCCESS.name(),
                fileUpload.getId(),
                AuditObjectType.FILE.name(),
                submission.getId(),
                metadata,
                DateTime.now());
    }

    public static AuditEntryDto fileValidate(String userId, FileUpload fileUpload, Submission submission,
                                             boolean ss, boolean outcome, List<String> errors) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put(AuditMetadata.TITLE.name(), fileUpload.getFileName());
        if (errors != null) {
            if (!errors.isEmpty()) {
                metadata.put(AuditMetadata.ERROR.name(), StringUtils.join(errors, "; "));
            }
        }

        return new AuditEntryDto(null,
                userId,
                ss ? AuditActionType.SS_VALIDATION.name() : AuditActionType.VALIDATION.name(),
                outcome ? AuditOperationOutcome.SUCCESS.name() : AuditOperationOutcome.FAILED.name(),
                fileUpload.getId(),
                AuditObjectType.FILE.name(),
                submission.getId(),
                metadata,
                DateTime.now());
    }
}
