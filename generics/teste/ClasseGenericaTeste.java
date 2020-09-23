package br.com.abc.Java.generics.teste;

import br.com.abc.Java.generics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste {
    public static void main(String[] args) {
        List < Computador > computadorList = new ArrayList <> ();
        computadorList.add ( new Computador ( "pc da nasa" ) );
        computadorList.add ( new Computador ( "pc da xuxa" ) );
        Objeto < Computador > alugarpc = new Objeto <> ( computadorList );
        Computador computador= alugarpc.getObjetosDisponiveis ();
        System.out.println ("Objeto alugado!");
        alugarpc.devolvendoObjeto ( computador );

    }
}
    class Objeto<t> {
        private List < t > objetosDisponiveis;
        public Objeto(List<t> objetosDisponiveis){
           this.objetosDisponiveis= objetosDisponiveis;
        }


        public t getObjetosDisponiveis() {
            if (objetosDisponiveis == null) {
                throw new NullPointerException ( "Não há objetos alugaveis!" );
            }
            t t = objetosDisponiveis.remove ( 0 );
            System.out.println ( "Alugado: " + t);
            return t;
        }

        public void devolvendoObjeto(t t) {
            System.out.println ( "Devolvido: " + t );
            objetosDisponiveis.add ( t );
            System.out.println ( "==============" );
            System.out.println (" Disponiveis" + objetosDisponiveis );
        }
    }


