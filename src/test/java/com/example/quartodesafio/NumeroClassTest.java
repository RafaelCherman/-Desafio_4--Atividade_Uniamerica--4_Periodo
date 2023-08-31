package com.example.quartodesafio;

import com.example.quartodesafio.entity.Numeros;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class NumeroClassTest {

    ArrayList<Integer> lista = new ArrayList<>();

    @Test
    public void testCalculaMedia()
    {
        for(int i=1; i<21; i++)
        {
            lista.add(i);
        }
        Numeros testes = new Numeros(lista);
        double media = testes.calculaMedia(20);
        Assert.assertEquals(10.5, media, 0);
    }

    @Test
    public void testCalculaMediana()
    {
        Numeros testes = new Numeros(lista);
        double mediana = testes.calculaMediana(lista,20);
        Assert.assertEquals(10.5, mediana, 0);
    }

    @Test
    public void testCalculaDesvioPadrao()
    {
        Numeros testes = new Numeros(lista);
        double desvioPadrao = testes.calculaDesvioPadrao(20, 10.5);
        Assert.assertEquals(0, desvioPadrao, 0);
    }




}
