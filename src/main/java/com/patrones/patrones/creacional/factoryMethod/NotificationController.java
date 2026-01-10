package com.patrones.patrones.creacional.factoryMethod;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notify")
public class NotificationController {

    private final NotificationFactory notificationFactory;

    public NotificationController(NotificationFactory notificationFactory) {
        this.notificationFactory = notificationFactory;
    }

    @PostMapping("/{type}")
    public String send(@PathVariable String type, @RequestParam String message) {
        NotificationService service = notificationFactory.createNotification(type);
        service.sendNotification(message);
        return "Notificación enviada por " + type;
    }
}

