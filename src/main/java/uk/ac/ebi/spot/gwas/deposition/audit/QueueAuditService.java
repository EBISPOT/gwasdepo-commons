package uk.ac.ebi.spot.gwas.deposition.audit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import uk.ac.ebi.spot.gwas.deposition.rest.RestRequestUtil;
import uk.ac.ebi.spot.gwas.deposition.util.QueueAuditTrailDto;

@Service
@ConditionalOnProperty(name = "queue-audit.enabled", havingValue = "true")
public class QueueAuditService {

    private static final Logger log = LoggerFactory.getLogger(QueueAuditService.class);

    @Autowired(required = false)
    private QueueAuditConfig queueAuditConfig;

    @Autowired
    protected RestTemplate restTemplate;

    @Autowired
    protected RestRequestUtil restRequestUtil;

    public boolean submitQueueAuditRequest(QueueAuditTrailDto queueAuditTrailDto) {
        log.info("Submitting queue audit request: {}", queueAuditTrailDto.getQueue());
        if (queueAuditConfig == null) {
            log.error("Queue config is NULL. Cannot proceed with the request.");
            return false;
        }
        String endpoint = queueAuditConfig.getQueueAuditEndpoint();

        try {
            HttpEntity httpEntity = restRequestUtil.httpEntity()
                    .withJwtHeader(queueAuditConfig.getQueueAuthToken())
                    .withJsonBody(queueAuditTrailDto)
                    .build();
            ResponseEntity<Void> response =
                    restTemplate.exchange(endpoint,
                            HttpMethod.POST, httpEntity,
                            new ParameterizedTypeReference<Void>() {
                            });

            if (response.getStatusCode().equals(HttpStatus.OK)) {
                log.info("Request submitted successfully.");
                return true;
            }
        } catch (Exception e) {
            log.error("Unable to call gwas-backend-service: {}", e.getMessage(), e);
        }

        return false;
    }

}
