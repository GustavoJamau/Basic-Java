package com.example.demo.service;

import com.example.demo.strategy.CalculadoraStrategy;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    private CalculadoraStrategy strategy;

    public void setStrategy(CalculadoraStrategy strategy) {
        this.strategy = strategy;
    }

    public int executarCalculo(int a, int b) {
        return strategy.calcular(a, b);
    }
}
