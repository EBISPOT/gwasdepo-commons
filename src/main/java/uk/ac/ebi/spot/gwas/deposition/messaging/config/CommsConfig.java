package uk.ac.ebi.spot.gwas.deposition.messaging.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import uk.ac.ebi.spot.gwas.deposition.messaging.adapter.MessagingAdapterFactory;

@Component
public class CommsConfig {

    @Value("${comms.rest-client.timeouts:60000}")
    private int restClientTimeouts;

    @Value("${comms.messaging.enabled:false}")
    private boolean messagingEnabled;

    @Value("${comms.messaging.adapter.name:#{NULL}}")
    private String messagingAdapter;

    @Value("${comms.notifications.timeouts.message-timeout:3000}")
    private int messageTimeout;

    @Value("${comms.notifications.timeouts.async-response-delay:60000}")
    private int asyncResponseDelay;

    @Value("${comms.notifications.timeouts.incoming-response-delay:60000}")
    private int incomingResponseDelay;

    @Bean
    public ServiceLocatorFactoryBean serviceLocatorFactoryBean() {
        ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
        factoryBean.setServiceLocatorInterface(MessagingAdapterFactory.class);
        return factoryBean;
    }

    public boolean isMessagingEnabled() {
        return messagingEnabled;
    }

    public int getRestClientTimeouts() {
        return restClientTimeouts;
    }

    public String getMessagingAdapter() {
        return messagingAdapter;
    }

    public int getMessageTimeout() {
        return messageTimeout;
    }

    public int getAsyncResponseDelay() {
        return asyncResponseDelay;
    }

    public int getIncomingResponseDelay() {
        return incomingResponseDelay;
    }

}
