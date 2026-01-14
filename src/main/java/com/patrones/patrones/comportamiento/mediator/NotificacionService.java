package com.patrones.patrones.comportamiento.mediator;

import org.springframework.stereotype.Service;

/**
 * Componente encargado de enviar notificaciones al cliente.
 */
@Service
public class NotificacionService extends Colleague {

    public void enviarConfirmacion(String email) {
        System.out.println("Notificación: correo de confirmación enviado a " + email);
    }
}

