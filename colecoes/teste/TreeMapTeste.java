package br.com.abc.Java.colecoes.teste;

import br.com.abc.Java.colecoes.classes.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapTeste {
    public static void main(String[] args) {
        NavigableMap < String, String > map = new TreeMap <> ();
        map.put ( "A" , "a" );
        map.put ( "E" , "e" );
        map.put ( "B" , "b" );
        map.put ( "F" , "f" );
        map.put ( "C" , "c" );
        map.put ( "D" , "d" );
        for (Map.Entry < String, String > mapsout : map.entrySet ()) {
            System.out.println ( mapsout.getKey () + " " + mapsout.getValue () );

        }

        System.out.println (map.headMap ( "F" ));//me retona chaves menores que ela e se colocar true, inclui ela
        System.out.println (map.descendingMap ());//me retorna o map na ordem contraria;
        System.out.println (map.firstEntry ());//a primeira inserçao
        System.out.println (map.higherEntry ( "C" ));//maior que ela
    }
}
/*Lembre-se de quando for usar o TreeMap, TreeSet, a classe que eu chamar tem que ter o metodo Comparable. Ou no construtor
do TreeMap, TreeSet passar um new Comparator;
*Obs= no Map somente a chave precisa que tenha uma classe que imprementa o comparable;
diferença de eu utilizar map ou NavigableMap ao instanciar o TreeSet é que a map nao tem metodos especiais
 */
