package com.example.quartodesafio.service;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CalculaService {

    public String calculos(final List<Integer> numeros)
    {
        int tamanho = numeros.size();
        int indexMediana;
        double desvioPadrao = 0, mediana, media = 0, diferencaMedia, somaQuadrado;
        List<Integer> ordenados = numeros;
        Collections.sort(ordenados);


        for(int i : numeros)
        {
            media += i;
        }
        media = media / tamanho;

        for(int i : numeros)
        {
            diferencaMedia = i - media;
            somaQuadrado = diferencaMedia * diferencaMedia;
            desvioPadrao += somaQuadrado;
        }
        desvioPadrao = Math.sqrt(desvioPadrao / tamanho);

        if(tamanho % 2 == 0)
        {
            indexMediana = tamanho / 2;
            mediana = ordenados.get(indexMediana);
            indexMediana = indexMediana - 1;
            mediana += ordenados.get(indexMediana);
            mediana = mediana / 2;
        }
        else
        {
            indexMediana = tamanho / 2;
            mediana = ordenados.get(indexMediana);
        }

        return "Total de numeros: " + tamanho + "\n" +
                "Media dos numeros: " + String.format("%.02f", media) + "\n" +
                "Desvio padrão dos numeros: " + String.format("%.02f", desvioPadrao)  + "\n" +
                "Mediana dos numeros: " + String.format("%.02f", mediana);
    }
}
