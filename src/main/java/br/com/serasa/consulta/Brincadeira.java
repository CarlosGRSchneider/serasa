package br.com.serasa.consulta;

public class Brincadeira {

    private GeradorDeNumeros geradorDeNumeros;

    public Brincadeira(GeradorDeNumeros geradorDeNumeros) {
        this.geradorDeNumeros = geradorDeNumeros;
    }

    public String pumas() {
        int numero = geradorDeNumeros.getNumeroDefinido();

        if (numero == 1) {
            return "Pera";
        } else if (numero == 2) {
            return "Uva";
        } else if (numero == 3) {
            return "Maçã";
        } else {
            return "Salada mista";
        }
    }
}
