package br.com.abc.Java.colecoes.teste;

import br.com.abc.Java.colecoes.classes.Produto;

import java.util.*;

class produtoNomeComparator implements Comparator < Produto > {

    @Override
    public int compare(Produto o1 , Produto o2) {
        return o1.getNome ().toUpperCase ().compareTo ( o2.getNome () );
    }
}

public class ComparatorTeste {
    public static void main(String[] args) {
        Produto [] produtosArray= new Produto[4];
        List < Produto > produtos = new ArrayList <> ();
        Produto produto1 = new Produto ( "Notebook aspire 3" , 2500d , "1456" );
        Produto produto2 = new Produto ( "Samsung galaxy s7" , 4500d , "1943" );
        Produto produto3 = new Produto ( "carne de picanha" , 26d , "4526" );
        Produto produto4 = new Produto ( "teclado Razer" , 450d , "7567" );

        produtosArray[0]=produto1;
        produtosArray[1]=produto2;
        produtosArray[2]=produto3;
        produtosArray[3]=produto4;


        produtos.add ( produto1 );
        produtos.add ( produto2 );
        produtos.add ( produto3 );
        produtos.add ( produto4 );

        Collections.sort ( produtos, new produtoNomeComparator ());
//        for (Produto pro : produtos) {
//            System.out.println ( pro );
//
//        }
        Arrays.sort(produtosArray, new produtoNomeComparator ());
        for (Produto pro : produtosArray) {
            System.out.println ( pro );

       }


      //  System.out.println ( Arrays.toString (produtosArray));
    }

}

/*usando o comparator agora caso eu queria mudar o tipo de ordenaçao sem mexer na minha classe produto;
e nesse caso no meu metodo é só eu instaciar um new Comparator
Tomar cuidado com letras maiusculas e minusculas quando for usar para comparar por nome;
Arrays.toString serve para imprimir arrays sem foreach;
Arrays.sort(produtosArray, new produtoNomeComparator ()); para ordenar meu array de acordo como eu quiser
 */
