package com.example.quartodesafio.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collections;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class Numeros {

    @Getter @Setter
    private List<Integer> numba;

    public double calculaMedia()
    {
        int tamanho = numba.size();
        double media = 0;
        for(int i : numba)
        {
            media += i;
        }
        media = media / tamanho;
        return media;
    }

    public double calculaMediana()
    {
        int indexMediana;
        List<Integer> ordenados = numba;
        Collections.sort(ordenados);
        int tamanho = numba.size();
        double mediana;
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

        return mediana;
    }

    public double calculaDesvioPadrao()
    {
        double media = calculaMedia();
        int tamanho = numba.size();
        double desvioPadrao = 0, diferencaMedia, somaQuadrado;
        for(int i : numba)
        {
            diferencaMedia = i - media;
            somaQuadrado = diferencaMedia * diferencaMedia;
            desvioPadrao += somaQuadrado;
        }
        desvioPadrao = Math.sqrt(desvioPadrao / tamanho);
        return desvioPadrao;
    }

    public double somaTodos()
    {
        int tamanho = numba.size();
        double soma = 0;
        for(int i : numba)
        {
            soma += i;
        }
        return soma;
    }

    public double retonarMin()
    {
        double min = Collections.min(numba);
        return min;
    }

    public double retonarMax()
    {
        double max = Collections.max(numba);
        return max;
    }
}
