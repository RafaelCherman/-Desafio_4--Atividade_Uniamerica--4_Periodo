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
        double desvioPadrao, mediana, media, soma, maior, menor;


        media = numeros.calculaMedia();

        desvioPadrao = numeros.calculaDesvioPadrao();

        mediana = numeros.calculaMediana();

        soma = numeros.somaTodos();

        maior = numeros.retonarMax();

        menor = numeros.retonarMin();


        return "Total de numeros: " + tamanho + "\n" +
                "Media dos numeros: " + String.format("%.02f", media) + "\n" +
                "Desvio padrão dos numeros: " + String.format("%.02f", desvioPadrao)  + "\n" +
                "Mediana dos numeros: " + String.format("%.02f", mediana) + "\n" +
                "Soma dos numeros: " + String.format("%.02f", soma) + "\n" +
                "Maior numero: " + String.format("%.02f", maior) + "\n" + "Menor numero: " + String.format("%.02f", menor);
    }


}
