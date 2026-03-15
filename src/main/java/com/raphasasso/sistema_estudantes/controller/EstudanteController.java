package com.raphasasso.sistema_estudantes.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/estudantes")
public class EstudanteController {

    private Map<String, String> estudantes = Map.of(
            "2024001", "João Silva - Engenharia de Software - 3º semestre",
            "2024002", "Maria Souza - Ciência da Computação - 5º semestre",
            "2024003", "Carlos Lima - Sistemas de Informação - 2º semestre"
    );

    @GetMapping("/{matricula}")
    public String buscarEstudante(@PathVariable String matricula) {
        return estudantes.get(matricula);
    }

    // Endpoint criativo
    @GetMapping("/total")
    public String totalEstudantes() {
        return "Total de estudantes cadastrados: " + estudantes.size();
    }
}