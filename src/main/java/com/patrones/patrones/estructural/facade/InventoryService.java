package com.patrones.patrones.estructural.facade;

import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    public boolean checkStock(String productId, int quantity) {
        System.out.println("Comprobando stock del producto " + productId);
        // Simula que hay stock disponible
        return true;
    }

    public void reserveProduct(String productId, int quantity) {
        System.out.println("Reservando " + quantity + " unidades del producto " + productId);
    }
}
