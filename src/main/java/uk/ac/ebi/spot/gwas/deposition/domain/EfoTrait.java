package uk.ac.ebi.spot.gwas.deposition.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;

@Document(collection = "efoTraits")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EfoTrait {

    @Id
    private String id;

    @Indexed
    @NotBlank
    private String trait;

    @Indexed(unique = true)
    @NotBlank
    private String uri;

    @Indexed(unique = true)
    private String shortForm;

    private Provenance created;

    private Provenance updated;
}
