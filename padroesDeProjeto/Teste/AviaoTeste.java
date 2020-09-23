package br.com.abc.Java.padroesDeProjeto.Teste;

import br.com.abc.Java.padroesDeProjeto.classes.AviaoSingleton;

public class AviaoTeste {
    public static void main(String[] args) {
        agendarLugar ( "Assento 1A" );
        agendarLugar ( "Assento 1A" );

    }

    public static void agendarLugar(String assento) {
        AviaoSingleton aviao = new AviaoSingleton ();
        System.out.println ( aviao.bookAssentos ( assento ) );
    }
}
