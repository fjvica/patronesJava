package com.patrones.patrones.comportamiento.command;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {

    private final Cocina cocina;
    private final Camarero camarero;

    public RestauranteController(Cocina cocina, Camarero camarero) {
        this.cocina = cocina;
        this.camarero = camarero;
    }

    @PostMapping("/hamburguesa")
    public String pedirHamburguesa() {
        Command orden = new OrdenHamburguesaCommand(cocina);
        camarero.ejecutarOrden(orden);
        return "✅ Hamburguesa ordenada";
    }

    @PostMapping("/refresco")
    public String pedirRefresco() {
        Command orden = new OrdenRefrescoCommand(cocina);
        camarero.ejecutarOrden(orden);
        return "✅ Refresco ordenado";
    }

    @PostMapping("/ensalada")
    public String pedirEnsalada() {
        Command orden = new OrdenEnsaladaCommand(cocina);
        camarero.ejecutarOrden(orden);
        return "✅ Ensalada ordenada";
    }

    @PostMapping("/deshacer")
    public String deshacer() {
        camarero.deshacerUltimaOrden();
        return "↩️ Última orden deshecha";
    }
}

