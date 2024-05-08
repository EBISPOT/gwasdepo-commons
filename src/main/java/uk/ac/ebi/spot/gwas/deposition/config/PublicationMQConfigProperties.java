package uk.ac.ebi.spot.gwas.deposition.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class PublicationMQConfigProperties {

    @Value("${rabbitmq.publication.queue-name}")
    private String publicationQueueName;

    @Value("${rabbitmq.publication.exchange-name}")
    private String publicationExchangeName;

    @Value("${rabbitmq.publication.routing-key}")
    private String publicationRoutingKey;
}
