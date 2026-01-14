package com.patrones.patrones.comportamiento.strategy;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    private final CalculadoraDescuentoService calculadora;

    public PedidoController(CalculadoraDescuentoService calculadora) {
        this.calculadora = calculadora;
    }

    @PostMapping("/calcular")
    public String calcular(@RequestParam String tipoCliente, @RequestParam double total) {
        Pedido pedido = new Pedido(tipoCliente.toLowerCase(), total);
        double precioFinal = calculadora.calcularPrecioFinal(pedido);
        return "Tipo: " + tipoCliente.toUpperCase()
                + " | Estrategia usada: " + calculadora.estrategiaUsada(pedido)
                + " | Total con descuento: " + precioFinal + " €";
    }
}

