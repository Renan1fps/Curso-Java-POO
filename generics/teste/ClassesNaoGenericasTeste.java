package br.com.abc.Java.generics.teste;

import br.com.abc.Java.generics.classes.Carro;
import br.com.abc.Java.generics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClassesNaoGenericasTeste {
    public static void main(String[] args) {
        CarroAlugavel carroAlugavel = new CarroAlugavel ();
        Carro carroAlugado = carroAlugavel.getCarrosDisponiveis ();
        System.out.println ( "Usando o carro por um mês" );
        carroAlugavel.devolvendoCarro ( carroAlugado );

        System.out.println ("--------------------------------------------------");

        ComputadorAlugavel computadorAlugavel = new ComputadorAlugavel ();
        Computador computador = computadorAlugavel.getComputadoresDisponiveis ();
        System.out.println ( "Usando o computador por um mês" );
        computadorAlugavel.devolvendoComputador ( computador );


    }
}

class CarroAlugavel {
    private List < Carro > carrosDisponiveis = new ArrayList <> ();

    {
        carrosDisponiveis.add ( new Carro ( "Gol quadrado" ) );
        carrosDisponiveis.add ( new Carro ( "BMW " ) );
    }

    public Carro getCarrosDisponiveis() {
        if (carrosDisponiveis == null) {
            throw new NullPointerException ( "nao ha carros para alugar" );
        }
        Carro c = carrosDisponiveis.remove ( 0 );
        System.out.println ( "carro alugado: " + c );
        return c;
    }

    public void devolvendoCarro(Carro c) {
        System.out.println ( "Carro devolvido: " + c );
        carrosDisponiveis.add ( c );
        System.out.println ( "==============" );
        System.out.println ( "Carros disponiveis" + carrosDisponiveis );
    }
}

class ComputadorAlugavel {
    private List < Computador > computadoresDisponiveis = new ArrayList <> ();

    {
        computadoresDisponiveis.add ( new Computador ( "I5 9900k gtx 1080ti" ) );
        computadoresDisponiveis.add ( new Computador ( "Ryzen 9 3300x GTX 2080ti " ) );
    }

    public Computador getComputadoresDisponiveis() {
        if (computadoresDisponiveis == null) {
            throw new NullPointerException ( "nao ha computador para alugar" );
        }
        Computador d = computadoresDisponiveis.remove ( 0 );
        System.out.println ( "Computador alugado: " + d );
        return d;
    }

    public void devolvendoComputador(Computador d) {
        System.out.println ( "Computador devolvido: " + d );
        computadoresDisponiveis.add ( d );
        System.out.println ( "==============" );
        System.out.println ( "Computadores disponiveis" + computadoresDisponiveis );
    }
}


