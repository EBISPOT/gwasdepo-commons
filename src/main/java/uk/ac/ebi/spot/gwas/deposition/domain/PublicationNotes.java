package uk.ac.ebi.spot.gwas.deposition.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Data
@Document(collection = "publicationNotes")
public class PublicationNotes implements Serializable {

    private static final long serialVersionUID = -6087596001333151889L;

    @Id
    private String id;

    private String publicationId;

    private List<String> notes;

    private Provenance created;

    private Provenance updated;



}
