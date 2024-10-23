package uk.ac.ebi.spot.gwas.deposition.domain;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "publicationAuthorsSort")
@CompoundIndex(name="pub-auth-sort", def = "{'publicationId': 1, 'authorId': 1, 'sort': 1}")
@Getter
public class PublicationAuthorsSort {

    @Id
    private String id;

    private String publicationId;

    private String authorId;

    public Integer sort;

    public PublicationAuthorsSort(String publicationId, String authorId, Integer sort) {
        this.publicationId = publicationId;
        this.authorId = authorId;
        this.sort = sort;
    }
}
