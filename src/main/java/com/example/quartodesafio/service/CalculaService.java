package com.example.quartodesafio.service;

import com.example.quartodesafio.entity.Numeros;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CalculaService {


    public String calculos(final Numeros numeros)
    {
        int tamanho = numeros.getNumba().size();
        double desvioPadrao = 0, mediana, media;
        List<Integer> ordenados = numeros.getNumba();
        Collections.sort(ordenados);


        media = numeros.calculaMedia(tamanho);

        desvioPadrao = numeros.calculaDesvioPadrao(tamanho, media);

        mediana = numeros.calculaMediana(ordenados, tamanho);


        return "Total de numeros: " + tamanho + "\n" +
                "Media dos numeros: " + String.format("%.02f", media) + "\n" +
                "Desvio padrão dos numeros: " + String.format("%.02f", desvioPadrao)  + "\n" +
                "Mediana dos numeros: " + String.format("%.02f", mediana);
    }


}
