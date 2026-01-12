package com.patrones.patrones.estructural.facade;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public boolean processPayment(String cardNumber, double amount) {
        System.out.println("Procesando pago de " + amount + "€ con tarjeta " + cardNumber);
        // Simula que el pago se realiza correctamente
        return true;
    }
}
