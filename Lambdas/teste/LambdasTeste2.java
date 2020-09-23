package br.com.abc.Java.Lambdas.teste;

import br.com.abc.Java.Lambdas.classes.Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import static java.util.Arrays.asList;

public class LambdasTeste2 {
    public static void main(String[] args) {
        foreach ( asList ( "Renan" , "Oliveira" , "Emerson" ) , System.out::println );//method refence

        List < Integer > integers = map ( asList ( "Renan" , "Oliveira" , "Emerson" ) , (String s) -> s.length () );
        System.out.println ( integers );

        List < Carro > carros = asList ( new Carro ( "azul" , 2005 ) , new Carro ( "verde" , 2010 ) , new Carro ( "vermelho" , 2008 ) );
        List < String > coresCarros = real ( carros , (Carro s) -> s.getCor () );
        System.out.println ( coresCarros );


        List < Integer > ano = map ( carros , Carro::getAno  );//method referenc
        System.out.println ( ano );
    }

    public static < T > void foreach(List < T > list , Consumer < T > c) {// essa interface vai fazer o que eu pedir na lambda
        for (T tipo : list) {
            c.accept ( tipo );

        }
    }

    public static < T, R > List < R > map(List < T > list , Function < T, R > f) {// nessa interface vc passa um tipo de parameto e ela te retorna outro tipo
        List < R > result = new ArrayList <> ();                       //por exemplo, estou passando uma lista de String e ela vai me retornar
        for (T e : list) {                                          // uma lista de interios com o tamanho de cada uma das palvras contidas na lista
            result.add ( f.apply ( e ) );

        }
        return result;
    }

    //outro exemplo;
    public static < T, R > List < R > real(List < T > list , Function < T, R > f) {
        List < R > cores = new ArrayList <> ();
        for (T e : list) {
            cores.add ( f.apply ( e ) );

        }
        return cores;
    }
}
