package com.raphasasso.sistema_estudantes.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    private Map<Integer, String> cursos = Map.of(
            1, "Engenharia de Software",
            2, "Ciência da Computação",
            3, "Sistemas de Informação",
            4, "Análise e Desenvolvimento de Sistemas",
            5, "Engenharia da Computação"
    );

    @GetMapping
    public Map<Integer, String> listarCursos() {
        return cursos;
    }

    @GetMapping("/{id}")
    public String buscarCurso(@PathVariable int id) {
        return cursos.get(id);
    }
}
