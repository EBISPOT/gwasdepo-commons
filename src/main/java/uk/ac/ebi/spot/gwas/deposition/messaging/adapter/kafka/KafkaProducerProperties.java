package uk.ac.ebi.spot.gwas.deposition.messaging.adapter.kafka;

import uk.ac.ebi.spot.gwas.deposition.messaging.config.KafkaConfig;

import java.util.Properties;

public class KafkaProducerProperties {

    private KafkaConfig kafkaConfig;

    private Properties properties;

    public KafkaProducerProperties(KafkaConfig kafkaConfig) {
        this.kafkaConfig = kafkaConfig;
        properties = new Properties();
        createProperties();
    }

    private void createProperties() {
        properties.put("bootstrap.servers", kafkaConfig.getBootstrapServers());
        properties.put("acks", kafkaConfig.getAcks());
        properties.put("retries", kafkaConfig.getRetries());
        properties.put("batch.size", kafkaConfig.getBatchSize());
        properties.put("linger.ms", "100");
        properties.put("buffer.memory", kafkaConfig.getBuffer());
        properties.put("request.timeout.ms", kafkaConfig.getTimeout());
        properties.put("max.block.ms", kafkaConfig.getBlockTime());
        properties.put("key.serializer", kafkaConfig.getKeySerializer());
        properties.put("value.serializer", kafkaConfig.getValueSerializer());
    }

    public Properties getProperties() {
        return properties;
    }
}
