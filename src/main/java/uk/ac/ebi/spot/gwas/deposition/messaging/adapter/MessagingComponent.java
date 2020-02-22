package uk.ac.ebi.spot.gwas.deposition.messaging.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Forwards the message to the configured implementation.
 */

@Component
@ConditionalOnProperty(name = "comms.messaging.enabled", havingValue = "true")
public class MessagingComponent implements MessagingAdapter {

    private static Logger log = LoggerFactory.getLogger(MessagingComponent.class);

    private final MessagingAdapter messagingAdapter;

    @Autowired
    public MessagingComponent(MessagingAdapterFactory messagingAdapterFactory,
                              @Value("${comms.messaging.adapter.name}") String adapterName) {
        log.info("Using messaging adapter: {}", adapterName);
        messagingAdapter = initAdapter(messagingAdapterFactory, adapterName);
    }

    private MessagingAdapter initAdapter(MessagingAdapterFactory messagingAdapterFactory,
                                         String adapterName) {
        return messagingAdapterFactory.getAdapter(adapterName);
    }

    @Override
    public <T> void sendMessage(String topic, T message) {
        messagingAdapter.sendMessage(topic, message);
    }

    @Override
    public <T> List<T> consumeMessage(String topic, Class<T> payloadType) {
        return messagingAdapter.consumeMessage(topic, payloadType);
    }

    @Override
    public <T> List<T> consumeMessage(String topic, Class<T> payloadType, long timeout) {
        return messagingAdapter.consumeMessage(topic, payloadType, timeout);
    }

    public <T> Map<String, List<T>> consumeMessagesFromList(List<String> topics,
                                                            Class<T> payloadType) {
        Map<String, List<T>> messages = new HashMap<>();

        topics.forEach(topic ->
                messages.put(topic, consumeMessage(topic, payloadType))
        );
        return messages;
    }
}
