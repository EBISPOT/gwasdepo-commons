package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubmissionRabbitMessage {

    private String submissionId;

    private String submissionType;
}
