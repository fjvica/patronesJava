package com.patrones.patrones.creacional.abstractFactory;

import org.springframework.stereotype.Component;

//Implementaciones concretas (una por tecnología)
@Component
public class RabbitMessageConsumer implements MessageConsumer {
    @Override
    public void consume(String topic) {
        System.out.println("📥 [RabbitMQ] Consumiendo mensajes de la cola " + topic);
    }
}