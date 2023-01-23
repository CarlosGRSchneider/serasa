package br.com.serasa.consulta;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BrincadeiraTest {


    @Test
    void testaResultadoDandoPera() {

        GeradorDeNumeros geradorMock = Mockito.mock(GeradorDeNumeros.class);
        Mockito.when(geradorMock.getNumeroDefinido()).thenReturn(1);

        Brincadeira brincadeira = new Brincadeira(geradorMock);

        String result = brincadeira.pumas();

        assertEquals("Pera", result);
    }
}