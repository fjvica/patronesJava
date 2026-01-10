package com.patrones.patrones.creacional.abstractFactory;

import org.springframework.stereotype.Component;

//Implementaciones concretas (una por tecnología)
@Component
public class KafkaMessageSender implements MessageSender {
    @Override
    public void send(String topic, String message) {
        System.out.println("📦 [Kafka] Enviando mensaje a " + topic + ": " + message);
    }
}
