package uk.ac.ebi.spot.gwas.deposition.messaging.adapter.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import uk.ac.ebi.spot.gwas.deposition.messaging.adapter.MessagingAdapter;
import uk.ac.ebi.spot.gwas.deposition.messaging.adapter.MessagingAdapterProviderTypes;

import java.util.List;

@Component(MessagingAdapterProviderTypes.MESSAGING_KAFKA)
@ConditionalOnProperty(name = "comms.messaging.adapter.name", havingValue = MessagingAdapterProviderTypes.MESSAGING_KAFKA)
public class KafkaMessagingAdapter implements MessagingAdapter {

    @Autowired
    private KafkaComponent kafkaComponent;

    @Override
    public <T> void sendMessage(String topic, T message) {
        kafkaComponent.sendMessage(topic, message);
    }

    @Override
    public <T> List<T> consumeMessage(String topic, Class<T> payloadType) {
        return kafkaComponent.consumeMessage(topic, payloadType);
    }

    @Override
    public <T> List<T> consumeMessage(String topic, Class<T> payloadType, long timeout) {
        return kafkaComponent.consumeMessage(topic, payloadType, timeout);
    }
}
