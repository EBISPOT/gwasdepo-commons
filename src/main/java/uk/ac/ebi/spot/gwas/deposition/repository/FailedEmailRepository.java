package uk.ac.ebi.spot.gwas.deposition.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import uk.ac.ebi.spot.gwas.deposition.domain.email.FailedEmail;

public interface FailedEmailRepository extends MongoRepository<FailedEmail, String> {

}
