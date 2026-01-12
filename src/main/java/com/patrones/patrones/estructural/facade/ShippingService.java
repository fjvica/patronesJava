package com.patrones.patrones.estructural.facade;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public void shipProduct(String productId, int quantity) {
        System.out.println("Enviando " + quantity + " unidades del producto " + productId);
    }
}

