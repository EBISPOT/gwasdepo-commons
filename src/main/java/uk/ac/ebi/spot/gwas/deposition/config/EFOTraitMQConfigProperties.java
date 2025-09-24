package uk.ac.ebi.spot.gwas.deposition.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class EFOTraitMQConfigProperties {

    @Value("${rabbitmq.efotrait.queue-name:#{NULL}}")
    private String efoTraitQueueName;

    @Value("${rabbitmq.efotrait.exchange-name:#{NULL}}")
    private String efoTraitExchangeName;

    @Value("${rabbitmq.efotrait.routing-key:#{NULL}}")
    private String efoTraitRoutingKey;

}
