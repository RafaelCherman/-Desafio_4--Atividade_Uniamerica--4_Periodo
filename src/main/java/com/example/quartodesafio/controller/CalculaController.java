package com.example.quartodesafio.controller;

import com.example.quartodesafio.service.CalculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "api/desafioquatro")
public class CalculaController {

    @Autowired
    private CalculaService calculaService;

    @PostMapping
    public ResponseEntity<?> calcula(@RequestBody final List<Integer> numeros){

        try{
            return ResponseEntity.ok(calculaService.calculos(numeros));
        }
        catch (RuntimeException e)
        {
            return ResponseEntity.internalServerError().body("Erro: " + e.getMessage());
        }
    }

}
