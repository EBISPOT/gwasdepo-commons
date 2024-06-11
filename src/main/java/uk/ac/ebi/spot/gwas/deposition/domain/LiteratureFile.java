package uk.ac.ebi.spot.gwas.deposition.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "literature-file")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LiteratureFile {

    @Id
    private String id;

    private String originalFileName;

    private String onDiskFileName;

    private String pubmedId;

    private Provenance created;

}
