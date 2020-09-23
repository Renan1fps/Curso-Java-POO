package br.com.abc.Java.Lambdas.teste;

import br.com.abc.Java.Lambdas.classes.Carro;


import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

import static java.util.Arrays.asList;

public class LambdasTeste4 {
    public static void main(String[] args) {
        List < Carro > lamb4 = asList ( new Carro ( "Verde" , 2010 ) ,
                new Carro ( "Vermelho" , 2015 ) ,
                new Carro ( "Amarelo" , 2000 ) ,
                new Carro ( "Preto" , 2012 ) );

        Collections.sort ( lamb4 , (o1 , o2) -> o1.getCor ().toUpperCase ().compareTo ( o2.getCor () ) );//organizando a lista com lambda

        // imprime ( lamb4 , System.out::println );//chamando o metodo e usando lambda para imprimir
        // lamb4.forEach ( System.out::println );//imprimindo com lambda

        List<String> nomes= asList("Renan","Emerson", "Lucas","eduardo");
        nomes.sort ( String::compareTo );// mas na minha classe deve ter implementado a interface CompareTo; *substituindo o Collections

    }

    public static < T > void imprime(List < T > list , Consumer < T > f) {//A interface consumer me da a possibilidade de fazer algumas logicas com a lista
        for (T e : list) {
            f.accept ( e );

        }

    }
}
