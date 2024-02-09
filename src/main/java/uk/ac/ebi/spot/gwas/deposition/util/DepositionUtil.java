package uk.ac.ebi.spot.gwas.deposition.util;


import uk.ac.ebi.spot.gwas.deposition.dto.curation.DepositionAssociationDto;
import uk.ac.ebi.spot.gwas.deposition.dto.curation.DepositionStudyDto;
import uk.ac.ebi.spot.gwas.deposition.dto.curation.DepositionSubmission;
import uk.ac.ebi.spot.gwas.deposition.dto.curation.SubmissionType;

public class DepositionUtil {

    public static SubmissionType getSubmissionType(DepositionSubmission submission) {
        if (submission.getBodyOfWork() != null && submission.getPublication() == null) {
            return SubmissionType.PRE_PUBLISHED;
        } else if (submission.getBodyOfWork() == null && submission.getPublication() == null) {
            return SubmissionType.UNKNOWN;
        } else if (submission.getPublication() != null) {
            String publicationStatus = submission.getPublication().getStatus();
            boolean hasSumStats = false;
            boolean hasMetadata = false;
            boolean hasAssociations = false;
            if (publicationStatus.equals("UNDER_SUBMISSION")) {
                hasMetadata = true;
            } else if (publicationStatus.equals("UNDER_SUMMARY_STATS_SUBMISSION")) {
                hasSumStats = true;
            }
            if (submission.getStudies() != null) {
                for (DepositionStudyDto studyDto : submission.getStudies()) {
                    if (studyDto.getSummaryStatisticsFile() != null && !studyDto.getSummaryStatisticsFile().equals("") &&
                            !studyDto.getSummaryStatisticsFile().equals("NR")) {
                        hasSumStats = true;
                    }
                }
            }
            if (submission.getAssociations() != null) {
                for (DepositionAssociationDto associationDto : submission.getAssociations()) {
                    if (associationDto.getStudyTag() != null) {
                        hasAssociations = true;
                    }
                }
            }
            if (hasMetadata && hasSumStats && hasAssociations) {
                return SubmissionType.METADATA_AND_SUM_STATS_AND_TOP_ASSOCIATIONS;
            }
            if (hasMetadata && hasSumStats && !hasAssociations) {
                return SubmissionType.METADATA_AND_SUM_STATS;
            }
            if (hasMetadata && !hasSumStats && hasAssociations) {
                return SubmissionType.METADATA_AND_TOP_ASSOCIATIONS;
            }
            if (hasMetadata && !hasSumStats && !hasAssociations) {
                return SubmissionType.METADATA;
            }
            if (!hasMetadata && hasSumStats && !hasAssociations) {
                return SubmissionType.SUM_STATS;
            }
        }
        return SubmissionType.UNKNOWN;
    }

}
