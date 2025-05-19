package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CalculadoraService;
import com.example.demo.strategy.CalculadoraStrategy;

@RestController
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @Autowired
    @Qualifier("soma")
    private CalculadoraStrategy somaStrategy;

    @Autowired
    @Qualifier("multiplicacao")
    private CalculadoraStrategy multiplicacaoStrategy;

    @GetMapping("/calcular")
    public int calcular(@RequestParam int a, @RequestParam int b, @RequestParam String operacao) {
        if (operacao.equalsIgnoreCase("soma")) {
            calculadoraService.setStrategy(somaStrategy);
        } else if (operacao.equalsIgnoreCase("multiplicacao")) {
            calculadoraService.setStrategy(multiplicacaoStrategy);
        } else {
            throw new IllegalArgumentException("Operação inválida");
        }
        return calculadoraService.executarCalculo(a, b);
    }
}
