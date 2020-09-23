package br.com.abc.Java.colecoes.teste;

import br.com.abc.Java.colecoes.classes.Consumidor;
import br.com.abc.Java.colecoes.classes.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTeste {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor ( "Renan Oliveira" , "122" );
        Consumidor consumidor2 = new Consumidor ( "DevDojo" , "321" );
        Produto produto1 = new Produto ( "Notebook aspire 3" , 2500d , "1456" , 0 );
        Produto produto2 = new Produto ( "Samsung galaxy s7" , 4500d , "1943" , 10 );
        Produto produto3 = new Produto ( "carne de picanha" , 26d , "4526" , 5 );
        Produto produto4 = new Produto ( "teclado Razer" , 450d , "7567" , 0 );

        Map < Consumidor, List < Produto > > map = new HashMap <> ();
        List < Produto > produtosCon1 = new ArrayList <> ();
        produtosCon1.add ( produto1 );
        produtosCon1.add ( produto2 );
        List < Produto > produtosCon2 = new ArrayList <> ();
        produtosCon2.add ( produto3 );
        produtosCon2.add ( produto4 );
        map.put ( consumidor1 , produtosCon1 );
        map.put ( consumidor2 , produtosCon2 );
        for (Map.Entry < Consumidor, List < Produto > > entry : map.entrySet ()) {
            System.out.println ( "\n " + entry.getKey ().getNome ()+ " " );
            for (Produto pro : entry.getValue ()) {
                System.out.print ( " " + pro.getNome ()+ "," );

            }


        }

    }

}

