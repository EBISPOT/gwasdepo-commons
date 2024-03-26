package uk.ac.ebi.spot.gwas.deposition.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConfigProperties {

    @Value("${rabbitmq.queue-name}")
    private String queueName;

    @Value("${rabbitmq.exchange-name}")
    private String exchangeName;

    @Value("${rabbitmq.routing-key}")
    private String routingKey;

    @Value("${rabbitmq.sumstats.queue-name}")
    private String sumstatsQueueName;

    @Value("${rabbitmq.sumstats.exchange-name}")
    private String sumstatsExchangeName;

    @Value("${rabbitmq.sumstats.routing-key}")
    private String sumstatsRoutingKey;

    public String getQueueName() {
        return queueName;
    }

    public String getExchangeName() {
        return exchangeName;
    }

    public String getRoutingKey() {
        return routingKey;
    }

    public String getSumstatsQueueName() {
        return sumstatsQueueName;
    }

    public String getSumstatsExchangeName() {
        return sumstatsExchangeName;
    }

    public String getSumstatsRoutingKey() {
        return sumstatsRoutingKey;
    }
}
