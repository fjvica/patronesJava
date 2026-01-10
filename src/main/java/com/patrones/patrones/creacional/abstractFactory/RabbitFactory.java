package com.patrones.patrones.creacional.abstractFactory;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("rabbit")
public class RabbitFactory implements MessagingFactory {

    private final RabbitMessageSender sender;
    private final RabbitMessageConsumer consumer;

    public RabbitFactory(RabbitMessageSender sender, RabbitMessageConsumer consumer) {
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


