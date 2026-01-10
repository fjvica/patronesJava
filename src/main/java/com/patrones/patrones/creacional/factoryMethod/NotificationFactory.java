package com.patrones.patrones.creacional.factoryMethod;

import org.springframework.stereotype.Component;
import java.util.Map;

@Component
public class NotificationFactory {

    private final Map<String, NotificationService> services;

    // Spring inyecta automáticamente todos los beans que implementan NotificationService
    //Spring tiene una funcionalidad avanzada de inyección por tipo,
    //y también puede inyectar colecciones de beans del mismo tipo
    public NotificationFactory(Map<String, NotificationService> services) {
        this.services = services;
    }

    public NotificationService createNotification(String type) {
        switch (type.toUpperCase()) {
            case "EMAIL": return services.get("emailNotificationService");
            case "SMS": return services.get("smsNotificationService");
            case "PUSH": return services.get("pushNotificationService");
            default: throw new IllegalArgumentException("Tipo no soportado: " + type);
        }
    }
}

