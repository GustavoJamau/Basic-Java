package com.example.demo.strategy;

import org.springframework.stereotype.Component;

@Component("soma")
public class SomaStrategy implements CalculadoraStrategy {
    @Override
    public int calcular(int a, int b) {
        return a + b;
    }
}
