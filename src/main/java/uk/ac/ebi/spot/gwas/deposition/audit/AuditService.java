package uk.ac.ebi.spot.gwas.deposition.audit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import uk.ac.ebi.spot.gwas.deposition.rest.RestRequestUtil;

@Component
@ConditionalOnProperty(name = "audit.enabled", havingValue = "true")
public class AuditService {

    private static final Logger log = LoggerFactory.getLogger(AuditService.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RestRequestUtil restRequestUtil;

    @Autowired(required = false)
    private AuditConfig auditConfig;

    @Async
    public void addAuditEntry(AuditEntryDto auditEntryDto) {
        String endpoint = auditConfig.getAuditEntriesEndpoint();
        try {
            HttpEntity httpEntity = restRequestUtil.httpEntity()
                    .withJsonBody(auditEntryDto)
                    .build();
            restTemplate.exchange(endpoint,
                    HttpMethod.POST, httpEntity,
                    new ParameterizedTypeReference<Void>() {
                    });
        } catch (Exception e) {
            log.error("Unable to call audit service: {}", e.getMessage(), e);
        }

    }

}
