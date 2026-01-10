package com.patrones.patrones.creacional.abstractFactory;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("kafka")
public class KafkaFactory implements MessagingFactory {

    private final KafkaMessageSender sender;
    private final KafkaMessageConsumer consumer;

    public KafkaFactory(KafkaMessageSender sender, KafkaMessageConsumer consumer) {
        this.sender = sender;
        this.consumer = consumer;
    }

    @Override
    public MessageSender createSender() {
        return sender;
    }

    @Override
    public MessageConsumer createConsumer() {
        return consumer;
    }
}

