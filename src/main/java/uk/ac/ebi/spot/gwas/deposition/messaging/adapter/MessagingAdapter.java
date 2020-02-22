package uk.ac.ebi.spot.gwas.deposition.messaging.adapter;

import java.util.List;

public interface MessagingAdapter {
    <T> void sendMessage(String topic, T message);

    <T> List<T> consumeMessage(String topic, Class<T> payloadType);

    <T> List<T> consumeMessage(String topic, Class<T> payloadType, long timeout);
}
