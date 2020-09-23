package br.com.abc.Java.colecoes.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversaoListeArrays {
    public static void main(String[] args) {
        List < Integer > numeros = new ArrayList <> ();
        numeros.add ( 2 );
        numeros.add ( 3 );
        numeros.add ( 4 );
        numeros.add ( 5 );
        numeros.add ( 6 );
        Integer[] numerosArray = new Integer[numeros.size ()];//transformando arrays em list
        numeros.toArray ( numerosArray );
        System.out.println ( numeros );
        System.out.println ( Arrays.toString ( numerosArray ) );


        System.out.println ( "-----------------------" );
        List < String > nomes = new ArrayList <> ();//imprimindo list
        nomes.add ( "renan" );
        nomes.add ( "renan" );
        nomes.add ( "renan" );
        nomes.add ( "renan" );
        nomes.add ( "renan" );
        System.out.println ( nomes );

        System.out.println ( "=============" );
        Integer[] arraysNumeros2 = new Integer[4];
        arraysNumeros2[0] = 1;
        arraysNumeros2[1] = 5;
        arraysNumeros2[2] = 78;
        arraysNumeros2[3] = 36;
        List < Integer > conversao = Arrays.asList ( arraysNumeros2 );
        System.out.println ( conversao );
    }


}
