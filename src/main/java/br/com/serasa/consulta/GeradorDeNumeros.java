package br.com.serasa.consulta;

import java.util.Random;

public class GeradorDeNumeros {

    private Random random = new Random();

    public int getNumeroDefinido() {
        return random.nextInt(4) + 1;
    }
}
