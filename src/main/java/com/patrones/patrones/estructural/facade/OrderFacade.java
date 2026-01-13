package com.patrones.patrones.estructural.facade;

import org.springframework.stereotype.Service;

@Service
public class OrderFacade {

    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;

    // Inyección de los subsistemas internos
    public OrderFacade(InventoryService inventoryService, PaymentService paymentService, ShippingService shippingService) {
        this.inventoryService = inventoryService;
        this.paymentService = paymentService;
        this.shippingService = shippingService;
    }

    // Metodo simplificado para el cliente
    public void placeOrder(String productId, int quantity, String cardNumber) {
        System.out.println("Procesando pedido a través de la fachada...");

        //Comprobamos stock
        if (!inventoryService.checkStock(productId, quantity)) {
            System.out.println("No hay stock disponible.");
            return;
        }

        //Reservamos el producto
        inventoryService.reserveProduct(productId, quantity);

        //Procesamos el pago
        if (!paymentService.processPayment(cardNumber, quantity * 50.0)) { // ejemplo de precio unitario
            System.out.println("Error en el pago.");
            return;
        }

        //Enviamos el producto
        shippingService.shipProduct(productId, quantity);

        System.out.println("Pedido completado correctamente.");
    }
}

