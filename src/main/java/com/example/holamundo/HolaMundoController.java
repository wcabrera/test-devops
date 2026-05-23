package com.example.holamundo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HolaMundoController {

    @Value("${app.environment}")
    private String environment;

    @GetMapping("/hola")
    public String holaMundo() {
        return "Hola Mundo, soy el ambiente " + environment;
    }

    @GetMapping("/hola/nombre")
    public String holaNombre(@RequestParam(defaultValue = "Mundo") String nombre) {
        return "Hola, " + nombre + "! Soy el ambiente " + environment;
    }
}
