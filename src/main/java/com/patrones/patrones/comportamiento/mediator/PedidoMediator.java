package com.patrones.patrones.comportamiento.mediator;

import org.springframework.stereotype.Component;

/**
 * Implementación concreta del patrón Mediator.
 * Coordina la interacción entre Inventario, Pago y Notificación.
 */
@Component
public class PedidoMediator implements Mediator {

    private final InventarioService inventarioService;
    private final PagoService pagoService;
    private final NotificacionService notificacionService;

    public PedidoMediator(InventarioService inventarioService,
                          PagoService pagoService,
                          NotificacionService notificacionService) {
        this.inventarioService = inventarioService;
        this.pagoService = pagoService;
        this.notificacionService = notificacionService;

        // Inyectamos el mediador a los colegas
        this.inventarioService.setMediator(this);
        this.pagoService.setMediator(this);
        this.notificacionService.setMediator(this);
    }

    /**
     * Metodo central: coordina qué hacer según el evento recibido.
     */
    @Override
    public void notificar(Object sender, String evento) {
        switch (evento) {
            case "crear_pedido" -> manejarCreacionPedido();
            default -> System.out.println("Evento no reconocido: " + evento);
        }
    }

    private void manejarCreacionPedido() {
        Long productoId = 1L;
        int cantidad = 2;
        double total = 49.99;
        String emailCliente = "cliente@ejemplo.com";

        System.out.println("\n--- Proceso coordinado por el Mediador ---");

        boolean disponible = inventarioService.verificarStock(productoId, cantidad);
        if (!disponible) {
            System.out.println("❌ No hay stock disponible.");
            return;
        }

        inventarioService.reservarStock(productoId, cantidad);
        boolean pagoExitoso = pagoService.procesarPago(123L, total);

        if (pagoExitoso) {
            notificacionService.enviarConfirmacion(emailCliente);
            System.out.println("✅ Pedido completado correctamente.");
        } else {
            System.out.println("❌ Error al procesar el pago.");
        }
    }
}

