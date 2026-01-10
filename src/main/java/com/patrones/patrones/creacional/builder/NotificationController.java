package com.patrones.patrones.creacional.builder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    private final NotificationService service;

    public NotificationController(NotificationService service) {
        this.service = service;
    }

    @GetMapping("/sendComplex")
    public String sendComplex() {
        service.sendComplexNotification();
        return "Notificación compleja enviada!";
    }
}


