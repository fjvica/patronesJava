package com.patrones.patrones.creacional.abstractFactory;

//Interfaces base (los productos)
public interface MessageSender {
        void send(String topic, String message);
    }
