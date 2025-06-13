package com.crisan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
