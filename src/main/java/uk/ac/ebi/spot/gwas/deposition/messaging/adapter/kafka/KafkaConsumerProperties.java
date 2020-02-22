package uk.ac.ebi.spot.gwas.deposition.messaging.adapter.kafka;

import uk.ac.ebi.spot.gwas.deposition.messaging.config.KafkaConfig;

import java.util.Properties;

public class KafkaConsumerProperties {

    private KafkaConfig kafkaConfig;

    private Properties properties;

    public KafkaConsumerProperties(KafkaConfig kafkaConfig) {
        this.kafkaConfig = kafkaConfig;
        properties = new Properties();
        createProperties();
    }

    private void createProperties() {
        properties.put("bootstrap.servers", kafkaConfig.getBootstrapServers());
        properties.put("group.id", kafkaConfig.getGroupId());
        properties.put("enable.auto.commit", kafkaConfig.getAutoCommit());
        properties.put("auto.commit.interval.ms", kafkaConfig.getCommitInterval());
        properties.put("key.deserializer", kafkaConfig.getKeyDeserializer());
        properties.put("value.deserializer", kafkaConfig.getValueDeserializer());
        properties.put("auto.offset.reset", kafkaConfig.getAutoOffsetReset());
        properties.put("max.poll.interval.ms", kafkaConfig.getMaxPoll());

    }

    public Properties getProperties() {
        return properties;
    }
}
