package com.crisan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiController {
    // 1. Endpoint Saludar

    @GetMapping("/saludar")
    public Map<String, String> saludar(){
        Map<String, String> json = new HashMap<>();
        json.put("Saludo", "Hola Bienvenido a mi primer api REST");

        return json;
    }
    // 2. Endpoint saludar personalizado

    @GetMapping("/saludar/{nombre}")
    public Map<String, String> saludarNombre(@PathVariable String nombre){
        Map<String, String> json = new HashMap<>();
        json.put("Saludo", "Hola Bienvenido " + nombre + " a mi primer api REST");

        return json;
    }
    // 3. Endpoint mostrar fechas actual y dentro de 875 dias

    @GetMapping("/fechas")
    public Map<String,String> fechaActual(){
        Map<String, String> json = new HashMap<>();
        json.put("Fecha Actual: ", LocalDate.now().toString());
        json.put("Fecha en 875 dias: ", LocalDate.now().plusDays(875).toString());

        return json;
    }
}
