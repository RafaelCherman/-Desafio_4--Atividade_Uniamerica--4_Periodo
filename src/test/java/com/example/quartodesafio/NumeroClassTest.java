package com.example.quartodesafio;

import com.example.quartodesafio.entity.Numeros;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class NumeroClassTest {



    @Test
    public void testCalculaMedia()
    {
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i=1; i<21; i++)
        {
            lista.add(i);
        }
        Numeros testes = new Numeros(lista);
        double media = testes.calculaMedia();
        Assert.assertEquals(10.5, media, 0);
    }

    @Test
    public void testCalculaMediana()
    {
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i=1; i<21; i++)
        {
            lista.add(i);
        }
        Numeros testes = new Numeros(lista);
        double mediana = testes.calculaMediana();
        Assert.assertEquals(10.5, mediana, 0);
    }

    @Test
    public void testCalculaDesvioPadrao()
    {
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i=1; i<21; i++)
        {
            lista.add(i);
        }
        Numeros testes = new Numeros(lista);
        double desvioPadrao = testes.calculaDesvioPadrao();
        Assert.assertEquals(5.76, desvioPadrao, 0.01);
    }

    @Test
    public void testSomaTodos()
    {
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i=1; i<21; i++)
        {
            lista.add(i);
        }
        Numeros testes = new Numeros(lista);
        double soma = testes.somaTodos();
        Assert.assertEquals(210, soma, 0);
    }

    @Test
    public void testRetornarMax()
    {
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i=1; i<21; i++)
        {
            lista.add(i);
        }
        Numeros testes = new Numeros(lista);
        double maior = testes.retonarMax();
        Assert.assertEquals(20, maior, 0);
    }

    @Test
    public void testRetornarMin()
    {
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i=1; i<21; i++)
        {
            lista.add(i);
        }
        Numeros testes = new Numeros(lista);
        double menor = testes.retonarMin();
        Assert.assertEquals(1, menor, 0);
    }




}
