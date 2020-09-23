package br.com.abc.Java.padroesDeProjeto.classes;

import java.util.HashSet;
import java.util.Set;

public enum AviaoSingletonEnum {
    INSTANCE;
    private Set < String > assentosDisponiveis;

    AviaoSingletonEnum() {
        this.assentosDisponiveis = assentosDisponiveis = new HashSet <> ();
        assentosDisponiveis.add ( "Assento 1A" );
        assentosDisponiveis.add ( "Assento 2B" );

    }

    public Boolean bookAssentos(String assento) {
        return assentosDisponiveis.remove ( assento );
    }

    public static void agendarLugar(String assento) {
        AviaoSingletonEnum a = AviaoSingletonEnum.INSTANCE ;
        System.out.println ( a.bookAssentos ( assento ) );

    }
}
