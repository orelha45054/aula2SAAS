package com.raphasasso.sistema_estudantes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SistemaController {

    @GetMapping("/api/sistema/info")
    public String infoSistema() {
        return "Sistema de Estudantes - versão 1.0 - status: operacional";
    }
}