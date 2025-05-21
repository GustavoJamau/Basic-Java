package com.example.demo.strategy;

import org.springframework.stereotype.Component;

@Component("multiplicacao")
public class MultiplicacaoStrategy implements CalculadoraStrategy {
    @Override
    public int calcular(int a, int b) {
        return a * b;
    }
}
