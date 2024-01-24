package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepositionAuthor {
    private String group;
    private String firstName;
    private String lastName;
    private String email;
}
