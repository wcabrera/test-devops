package com.example.holamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "Hola Mundo!";
    }

    @GetMapping("/hola/nombre")
    public String holaNombre(@RequestParam(defaultValue = "Mundo") String nombre) {
        return "Hola, " + nombre + "!";
    }
}
