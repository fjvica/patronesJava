package com.patrones.patrones.creacional.builder;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendComplexNotification() {
        Notification notification = new Notification.NotificationBuilder(
                "Alerta crítica",
                "Se ha detectado un error en el sistema"
        )
                .urgent(true)
                .addChannel("Email")
                .addChannel("SMS")
                .addAttachment("log.txt")
                .addAttachment("error_screenshot.png")
                .sender("Admin")
                .build();

        // Simulamos envío
        System.out.println("Enviando notificación compleja: " + notification);
    }
}

