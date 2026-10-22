package com.techlab.cartadigital.service;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {

    public String saludo(String nombre) {
        if (nombre.trim().isEmpty()) {
            return "Hola, visitante";
        }
        return "Hola, " + nombre.trim();
    }
}
