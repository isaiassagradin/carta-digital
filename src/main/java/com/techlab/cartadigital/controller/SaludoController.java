package com.techlab.cartadigital.controller;

import com.techlab.cartadigital.service.SaludoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
    private SaludoService servicio;

    public SaludoController(SaludoService servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/bienvenida")
    public String saludar(@RequestParam String nombre) {
        return servicio.saludo(nombre);
    }
}
