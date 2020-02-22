package uk.ac.ebi.spot.gwas.deposition.messaging.adapter.kafka;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.TopicPartition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import uk.ac.ebi.spot.gwas.deposition.messaging.config.KafkaConfig;
import uk.ac.ebi.spot.gwas.deposition.messaging.adapter.MessagingAdapterProviderTypes;

import javax.annotation.PreDestroy;
import java.io.IOException;
import java.util.*;

@Service
@ConditionalOnProperty(name = "comms.messaging.adapter.name", havingValue = MessagingAdapterProviderTypes.MESSAGING_KAFKA)
public class KafkaComponent {

    private final Logger log = LoggerFactory.getLogger(KafkaComponent.class);

    private Producer<String, byte[]> kafkaProducer;

    private Consumer<String, byte[]> kafkaConsumer;

    private ObjectMapper objectMapper;

    private Map<String, Consumer> kafkaConsumerMap;

    private Properties consumerProps;

    @Autowired
    public KafkaComponent(KafkaConfig kafkaConfig) {
        Properties producerProps = new KafkaProducerProperties(kafkaConfig).getProperties();
        kafkaProducer = new KafkaProducer<>(producerProps);

        consumerProps = new KafkaConsumerProperties(kafkaConfig).getProperties();
        kafkaConsumerMap = new HashMap<>();

        objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
    }

    private Consumer initConsumer(String topic) {
        kafkaConsumer = new KafkaConsumer<>(consumerProps);
        TopicPartition tp = new TopicPartition(topic, 0);
        List<TopicPartition> tps = Arrays.asList(tp);
        kafkaConsumer.assign(tps);
        kafkaConsumerMap.put(topic, kafkaConsumer);
        return kafkaConsumer;
    }

    private Consumer initConsumer(List<String> topics) {
        kafkaConsumer = new KafkaConsumer<>(consumerProps);
        topics.stream().forEach(topic -> {
            TopicPartition tp = new TopicPartition(topic, 0);
            List<TopicPartition> tps = Arrays.asList(tp);
            kafkaConsumer.assign(tps);
        });
        kafkaConsumerMap.put(topicSignature(topics), kafkaConsumer);
        return kafkaConsumer;
    }

    public <T> void sendMessage(String topic, T message) {
        try {
            byte[] messageJson = objectMapper.writeValueAsBytes(message);
            kafkaProducer.send(new ProducerRecord<>(topic, messageJson));
        } catch (Exception e) {
            log.error("Invalid JSON: {}", e.getMessage(), e);
        }
    }

    public <T> List<T> consumeMessage(String topic, Class<T> clazz) {
        return consumeMessage(topic, clazz, 10000);
    }

    public <T> List<T> consumeMessage(String topic, Class<T> clazz, long timeout) {
        List<T> messages = new ArrayList<>();
        try {
            Consumer kafkaConsumer = kafkaConsumerMap.get(topic);
            if (kafkaConsumer == null) {
                kafkaConsumer = initConsumer(topic);
            }
            ConsumerRecords<String, byte[]> consumerRecords = kafkaConsumer.poll(timeout);
            consumerRecords.forEach(record -> {
                try {
                    T message = objectMapper.readValue(record.value(), clazz);
                    messages.add(message);
                } catch (IOException e) {
                    log.error("Unable to consume message: {}", e.getMessage(), e);
                }
            });

        } catch (Exception e) {
            log.error("Unable to consume message: {}", e.getMessage(), e);
        }
        return messages;
    }

    public <T> Map<String, List<T>> consumeMessagesFromList(List<String> topics, Class<T> clazz) {
        return consumeMessagesFromList(topics, clazz, 5000);
    }

    public <T> Map<String, List<T>> consumeMessagesFromList(List<String> topics, Class<T> clazz,
                                                            long timeout) {
        Map<String, List<T>> messages = new HashMap<>();
        try {
            Consumer kafkaConsumer = kafkaConsumerMap.get(topicSignature(topics));
            if (kafkaConsumer == null) {
                kafkaConsumer = initConsumer(topics);
            }
            ConsumerRecords<String, byte[]> consumerRecords = kafkaConsumer.poll(timeout);

            consumerRecords.forEach(record -> {
                try {
                    String topic = record.topic();
                    T message = objectMapper.readValue(record.value(), clazz);
                    List<T> messageList =
                            messages.containsKey(topic) ? messages.get(topic) : new ArrayList<T>();
                    messageList.add(message);
                    messages.put(topic, messageList);
                } catch (IOException e) {
                    log.error("Unable to consume message: " + e.getMessage(), e);
                }
            });

        } catch (Exception e) {
            log.error("Unable to consume message: " + e.getMessage(), e);
        }
        return messages;
    }

    @PreDestroy
    public void Producer() {
        if (kafkaProducer != null) {
            kafkaProducer.close();
        }
        if (kafkaConsumerMap != null) {
            kafkaConsumerMap.forEach((k, v) -> v.close());
        }
    }

    private String topicSignature(List<String> topics) {
        String topicSignature = "";
        for (String topic : topics) {
            topicSignature += topic + "::";
        }
        return topicSignature;
    }
}