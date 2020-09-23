package br.com.abc.Java.padroesDeProjeto.Teste;

import br.com.abc.Java.padroesDeProjeto.classes.AviaoSingleton;
import br.com.abc.Java.padroesDeProjeto.classes.AviaoSingleton2;

public class AviaoSigletonTeste2 {
    public static void main(String[] args) {
        agendarLugar ( "Assento 1A" );
        agendarLugar ( "Assento 1A" );

    }
    public static void agendarLugar(String assento) {
        AviaoSingleton2 a= AviaoSingleton2.getINSTANCE ();
        System.out.println ( a.bookAssentos ( assento ) );
    }


}
