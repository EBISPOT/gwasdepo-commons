package uk.ac.ebi.spot.gwas.deposition.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SubmissionCreationDto implements Serializable {

    private static final long serialVersionUID = 3158029215487618051L;

    @JsonProperty("publication")
    private final PublicationDto publication;

    @JsonProperty("bodyOfWork")
    private final BodyOfWorkDto bodyOfWork;

    @JsonProperty("globusIdentity")
    private final String globusIdentity;

    @JsonCreator
    public SubmissionCreationDto(@JsonProperty("publication") PublicationDto publication,
                                 @JsonProperty("bodyOfWork") BodyOfWorkDto bodyOfWork,
                                 @JsonProperty("globusIdentity") String globusIdentity) {
        this.publication = publication;
        this.bodyOfWork = bodyOfWork;
        this.globusIdentity = globusIdentity;
    }

    public PublicationDto getPublication() {
        return publication;
    }

    public BodyOfWorkDto getBodyOfWork() {
        return bodyOfWork;
    }

    public String getGlobusIdentity() {
        return globusIdentity;
    }
}
