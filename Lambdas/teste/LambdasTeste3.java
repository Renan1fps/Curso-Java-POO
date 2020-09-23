package br.com.abc.Java.Lambdas.teste;

import br.com.abc.Java.Lambdas.classes.Carro;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class LambdasTeste3 {
    public static void main(String[] args) {

        List < Carro > carros = asList ( new Carro ( "azul" , 2005 ) ,
                new Carro ( "verde" , 2010 ) ,
                new Carro ( "vermelho" , 2008 ) );

        Collections.sort ( carros , (o1 , o2) -> o1.getAno ().compareTo ( o2.getAno () ) );

        System.out.println ( carros );

    }
}
