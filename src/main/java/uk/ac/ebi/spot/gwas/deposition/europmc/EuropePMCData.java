package uk.ac.ebi.spot.gwas.deposition.europmc;

import uk.ac.ebi.spot.gwas.deposition.domain.Author;
import uk.ac.ebi.spot.gwas.deposition.dto.AuthorDto;
import uk.ac.ebi.spot.gwas.deposition.dto.PublicationDto;
import uk.ac.ebi.spot.gwas.deposition.dto.curation.PublicationAuthorDto;

import java.util.Collection;

/**
 * Created by cinzia on 20/09/2017.
 */
public class EuropePMCData {

    private Boolean error;

    private PublicationDto publication = null;

    private Collection<PublicationAuthorDto> authors = null;

    private PublicationAuthorDto firstAuthor = null;

    private String doi = null;

    public Boolean getError() { return error; }

    public void setError(Boolean error) { this.error = error; }

    public PublicationDto getPublication() { return publication; }

    public void setPublication(PublicationDto publication) {
        this.publication = publication;
    }

    public Collection<PublicationAuthorDto> getAuthors() {
        return authors;
    }

    public void setAuthors(Collection<PublicationAuthorDto> authors) {
        this.authors = authors;
    }

    public void setFirstAuthor(PublicationAuthorDto firstAuthor) { this.firstAuthor = firstAuthor; }

    public PublicationAuthorDto getFirstAuthor() { return firstAuthor; }

    public void setDoi(String doi){
        this.doi = doi;
    }

    public String getDoi(){
        return doi;
    }
}
