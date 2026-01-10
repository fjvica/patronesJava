package com.patrones.patrones.creacional.abstractFactory;


public interface MessagingFactory {
    MessageSender createSender();
    MessageConsumer createConsumer();
}

