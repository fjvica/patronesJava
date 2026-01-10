package com.patrones.patrones.creacional.abstractFactory;

import org.springframework.stereotype.Component;

//Implementaciones concretas (una por tecnología)
@Component
public class KafkaMessageConsumer implements MessageConsumer {
    @Override
    public void consume(String topic) {
        System.out.println("📥 [Kafka] Consumiendo mensajes del tópico " + topic);
    }
}