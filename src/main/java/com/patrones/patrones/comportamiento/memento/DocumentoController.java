package com.patrones.patrones.comportamiento.memento;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/documento")
public class DocumentoController {

    private final GestorVersiones gestor;
    private Documento documentoActual;

    public DocumentoController(GestorVersiones gestor) {
        this.gestor = gestor;
        this.documentoActual = new Documento("Mi primer documento", "Contenido inicial");
    }

    @PostMapping("/escribir")
    public String escribir(@RequestParam String texto) {
        gestor.guardarVersion(documentoActual); // guarda antes de modificar
        documentoActual.escribir(texto);
        return documentoActual.mostrar();
    }

    @PostMapping("/deshacer")
    public String deshacer() {
        gestor.deshacer(documentoActual);
        return documentoActual.mostrar();
    }

    @GetMapping("/mostrar")
    public String mostrar() {
        return documentoActual.mostrar();
    }
}

