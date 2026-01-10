package com.patrones.patrones.creacional.abstractFactory;

import org.springframework.stereotype.Component;

//Implementaciones concretas (una por tecnología)
@Component
public class RabbitMessageSender implements MessageSender {
    @Override
    public void send(String topic, String message) {
        System.out.println("📦 [RabbitMQ] Enviando mensaje a " + topic + ": " + message);
    }
}
