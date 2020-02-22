package uk.ac.ebi.spot.gwas.deposition.messaging.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KafkaConfig {

    @Value("${comms.messaging.kafka.servers:#{NULL}}")
    private String bootstrapServers;

    @Value("${comms.messaging.kafka.group-id:#{NULL}}")
    private String groupId;

    @Value("${kafka.acks:1}")
    private String acks;

    @Value("${kafka.retries:0}")
    private String retries;

    @Value("${kafka.batch.size:16384}")
    private String batchSize;

    @Value("${kafka.buffer.memory:33554432}")
    private String buffer;

    @Value("${kafka.request.timeout.ms:100}")
    private String timeout;

    @Value("${kafka.max.block.ms:100}")
    private String blockTime;

    @Value("${kafka.enable.auto.commit:true}")
    private String autoCommit;

    @Value("${kafka.auto.commit.interval.ms:1000}")
    private String commitInterval;

    @Value("${kafka.session.timeout.ms:5000}")
    private String sessionTimeout;

    @Value("${kafka.key.deserializer:org.apache.kafka.common.serialization.StringDeserializer}")
    private String keyDeserializer;

    @Value("${kafka.key.serializer:org.apache.kafka.common.serialization.StringSerializer}")
    private String keySerializer;

    @Value("${kafka.value.deserializer:org.apache.kafka.common.serialization.ByteArrayDeserializer}")
    private String valueDeserializer;

    @Value("${kafka.value.serializer:org.apache.kafka.common.serialization.ByteArraySerializer}")
    private String valueSerializer;

    @Value("${kafka.auto.offset.reset:earliest}")
    private String autoOffsetReset;

    @Value("${kafka.max.poll.interval.ms:88200000}")
    private String maxPoll;

    public String getBootstrapServers() {
        return bootstrapServers;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getAcks() {
        return acks;
    }

    public String getRetries() {
        return retries;
    }

    public String getBatchSize() {
        return batchSize;
    }

    public String getBuffer() {
        return buffer;
    }

    public String getTimeout() {
        return timeout;
    }

    public String getBlockTime() {
        return blockTime;
    }

    public String getAutoCommit() {
        return autoCommit;
    }

    public String getCommitInterval() {
        return commitInterval;
    }

    public String getSessionTimeout() {
        return sessionTimeout;
    }

    public String getKeyDeserializer() {
        return keyDeserializer;
    }

    public String getKeySerializer() {
        return keySerializer;
    }

    public String getValueDeserializer() {
        return valueDeserializer;
    }

    public String getValueSerializer() {
        return valueSerializer;
    }

    public String getAutoOffsetReset() {
        return autoOffsetReset;
    }

    public String getMaxPoll() {
        return maxPoll;
    }
}