package br.com.abc.Java.colecoes.teste;

import java.util.HashMap;
import java.util.Map;

public class MapTeste {
    public static void main(String[] args) {
        Map < String, String > maptest = new HashMap <> ();//nao aceita repetiçoes mas se tiver ela vai sobreescrever oq ja tem;
        maptest.put ( "teklado" , "teclado" );//para colocar elemntos usamos "put";
        maptest.put ( "mouze" , "mouse" );
        maptest.put ( "vc" , "você" );
        for (String key : maptest.keySet ()) {//para imprimir as chaves
            System.out.println ( key );
        }
        System.out.println ( "---------------------" );
        for (Map.Entry < String, String > map : maptest.entrySet ()) {//imprimindo a chave e valor juntos;
            System.out.println ( map.getKey () + " " + map.getValue () );

        }

    }
}

//for (String valor : maptest.values ()) {//para imprimir os valores
//                System.out.println ( valor );
