package br.com.abc.Java.colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoLista {
    public static void main(String[] args) {
        List < String > nomes = new ArrayList <> ();
        nomes.add ( "renan" );
        nomes.add ( "lucas" );
        nomes.add ( "emerson" );
        nomes.add ( "enzo" );
        nomes.add ( "eduardo" );
        nomes.add ( "luiz" );
        nomes.add ( "luis" );
        Collections.sort ( nomes );//classe que tem o metodo sort para ordenar nossa lista por ordem alfabetica;
        for (String nome : nomes) {
            System.out.println ( nome );

        }
        System.out.println ("------------------------------");
        List < Double > numeros = new ArrayList <> ();
        numeros.add ( 1.5 );
        numeros.add ( 0.5 );
        numeros.add ( 2. );
        numeros.add ( 6.4 );
        numeros.add ( 1.4 );
        Collections.sort ( numeros );
        for (Double num : numeros) {
            System.out.println ( num );

        }
    }
}
