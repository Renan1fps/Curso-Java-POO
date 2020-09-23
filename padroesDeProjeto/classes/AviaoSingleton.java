package br.com.abc.Java.padroesDeProjeto.classes;

import java.util.HashSet;
import java.util.Set;

public class AviaoSingleton {
    private Set<String> assentosDisponiveis;

    public AviaoSingleton() {
        this.assentosDisponiveis = assentosDisponiveis= new HashSet <> ();
        assentosDisponiveis.add ( "Assento 1A" );
        assentosDisponiveis.add ( "Assento 2B" );

    }
    public Boolean bookAssentos(String assento){
        return assentosDisponiveis.remove ( assento );
    }
}
