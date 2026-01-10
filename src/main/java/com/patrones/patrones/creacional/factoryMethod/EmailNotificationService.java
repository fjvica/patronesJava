package com.patrones.patrones.creacional.factoryMethod;

import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("📧 Enviando EMAIL: " + message);
    }
}

