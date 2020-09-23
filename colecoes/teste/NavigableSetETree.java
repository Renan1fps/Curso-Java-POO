package br.com.abc.Java.colecoes.teste;


import br.com.abc.Java.colecoes.classes.Produto;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetETree {
    public static void main(String[] args) {
        Produto produto1 = new Produto ( "Notebook aspire 3" , 2500d , "1456" , 0 );
        Produto produto2 = new Produto ( "Samsung galaxy s7" , 4500d , "1943" , 10 );
        Produto produto3 = new Produto ( "carne de picanha" , 26d , "4526" , 5 );
        Produto produto4 = new Produto ( "teclado Razer" , 450d , "7567" , 0 );
        Produto produto5 = new Produto ( "mouse logitech" , 400d , "4578," , 4 );

        NavigableSet < Produto > navigableSet = new TreeSet ();
        navigableSet.add ( produto1 );
        navigableSet.add ( produto2 );
        navigableSet.add ( produto3 );
        navigableSet.add ( produto4 );
        navigableSet.add ( produto5 );
        for (Produto pro : navigableSet) {
            System.out.println ( pro );

        }
        System.out.println ( "---------------------" );
        //lower< retorna o menor produto antes do produto que eu passar;
        //floor<=
        //higher>
        //ceiling>=
        System.out.println ( navigableSet.lower ( produto4 ) );


    }
}



/*NavigableSet < Celular > navigableSet2 = new TreeSet <> ();
        navigableSet2.add ( celular );//1*
        for (Celular cell : navigableSet2) {
            System.out.println ( cell );//dara um erro pois minha classe celular nao tem comparator nem Comparable;

só posso adicionar se meu objeto da classe Celular possuir Comparable para Treeset ou adicionar ao construtor
 um Comparator EX: new TreeSet <> (new Comparator);
 */
