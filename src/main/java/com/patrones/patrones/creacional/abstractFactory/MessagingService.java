package com.patrones.patrones.creacional.abstractFactory;

import org.springframework.stereotype.Service;

@Service
public class MessagingService {

    private final MessageSender sender;
    private final MessageConsumer consumer;

    public MessagingService(MessagingFactory factory) {
        this.sender = factory.createSender();
        this.consumer = factory.createConsumer();
    }

    public void process() {
        sender.send("user-topic", "Nuevo usuario registrado");
        consumer.consume("user-topic");
    }
}

