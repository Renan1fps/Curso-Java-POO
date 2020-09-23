package br.com.abc.Java.padroesDeProjeto.classes;

import java.util.HashSet;
import java.util.Set;

public class AviaoSingleton2 {
    private static final AviaoSingleton2 INSTANCE = new AviaoSingleton2 ();
    private Set < String > assentosDisponiveis;


    private AviaoSingleton2() {
        this.assentosDisponiveis = assentosDisponiveis = new HashSet <> ();
        assentosDisponiveis.add ( "Assento 1A" );
        assentosDisponiveis.add ( "Assento 2B" );

    }
    public Boolean bookAssentos(String assento){
        return assentosDisponiveis.remove ( assento );
    }

    public static AviaoSingleton2 getINSTANCE() {
        return INSTANCE;
    }
}
