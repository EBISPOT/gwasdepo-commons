package uk.ac.ebi.spot.gwas.deposition.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class DiseaseTraitMQConfigProperties {

    @Value("${rabbitmq.diseasetrait.queue-name:#{NULL}}")
    private String diseasetraitQueueName;

    @Value("${rabbitmq.diseasetrait.exchange-name:#{NULL}}")
    private String diseasetraitExchangeName;

    @Value("${rabbitmq.diseasetrait.routing-key:#{NULL}}")
    private String diseasetraitRoutingKey;

}
