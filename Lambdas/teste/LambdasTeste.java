package br.com.abc.Java.Lambdas.teste;

import br.com.abc.Java.Lambdas.classes.Carro;
import br.com.abc.Java.Lambdas.interfaces.CarroPredicate;

public class LambdasTeste {
    public static void main(String[] args) {//lambdas só pode ser usada com classes funcionais(que possuem apenas um metodo)
        //utilizando uma classe anomima
        CarroPredicate carroPredicate = new CarroPredicate () {
            @Override
            public boolean teste(Carro carro) {
                return carro.getCor ().equals ( "verde" );
            }
        };
        System.out.println ( carroPredicate.teste ( new Carro ( "verde" , 2010 ) ) );





        //utlizando lambdas
        CarroPredicate carroPredicate1 = (Carro carro) -> carro.getCor ().equals ( "verde" );
        System.out.println ( carroPredicate1.teste ( new Carro ( "verde" , 2010 ) ) );


    }
    //poderia substituir o CarroPredicate pela Interface Predicate<> que retorna true ou false; usada para fazer validações
}
