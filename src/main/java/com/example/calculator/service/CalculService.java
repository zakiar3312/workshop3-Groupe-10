package com.example.calculator.service;

import com.example.calculator.entites.Nombres;
import org.springframework.stereotype.Service;

@Service
public class CalculService {
    public double somme(Nombres n) {
        return n.getA() + n.getB();
    }
}
