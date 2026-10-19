package com.example.calculator.controller;


import com.example.calculator.entites.Nombres;
import com.example.calculator.service.CalculService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calcul")
public class CalculateurController {

    private final CalculService calculService;

    public CalculateurController(CalculService calculService) {
        this.calculService = calculService;
    }

   
    @GetMapping("/somme")
    public double somme(Nombres n) { return n.getA() + n.getB(); }

    
    @PostMapping("/somme")
    public double sommeBody(@RequestBody Nombres nombres) {
        return calculService.somme(nombres);
    }
}
