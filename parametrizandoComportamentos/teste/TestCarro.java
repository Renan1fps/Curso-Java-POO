package br.com.abc.Java.parametrizandoComportamentos.teste;

import br.com.abc.Java.parametrizandoComportamentos.classePredicate.CarroPredicateCor;
import br.com.abc.Java.parametrizandoComportamentos.classes.Carro;
import br.com.abc.Java.parametrizandoComportamentos.interfaces.CarroPredicate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static java.util.Arrays.asList;

public class TestCarro {
    public static List < Carro > carroBusca(List < Carro > carros , String cor) {
        List < Carro > resultado = new ArrayList <> ();
        for (Carro cb : carros) {
            if (cb.getCor ().equals ( cor )) {
                resultado.add ( cb );
            }

        }
        return resultado;
    }

    public static List < Carro > carroBuscaPorAno(List < Carro > carros) {
        List < Carro > resultado = new ArrayList <> ();
        for (Carro cb : carros) {
            if (cb.getAno () > (Calendar.getInstance ().get ( Calendar.YEAR ) - 10))
                resultado.add ( cb );


        }
        return resultado;
    }

    public static List < Carro > filtrarCarros(List < Carro > carros , CarroPredicate predicate) {
        List < Carro > result = new ArrayList <> ();
        for (Carro car : carros) {
            if (predicate.teste ( car ))
                result.add ( car );
        }
        return result;
    }


    public static void main(String[] args) {
        List < Carro > carros = asList ( new Carro ( "Verde" , 2005 ) ,
                new Carro ( "Vermelho" , 2010 ) ,
                new Carro ( "Azul" , 1998 ) ,
                new Carro ( "Verde" , 2008 ) ,
                new Carro ( "Vermelho" , 1995 ) );

        System.out.println ( carroBusca ( carros , "Verde" ) );
         System.out.println ( carroBuscaPorAno ( carros ) );
        System.out.println ( filtrarCarros ( carros , new CarroPredicateCor () ) );

    }


}
