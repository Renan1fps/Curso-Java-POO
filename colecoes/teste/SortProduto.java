package br.com.abc.Java.colecoes.teste;

import br.com.abc.Java.colecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto ( "Notebook aspire 3" , 2500d , "1456" );
        Produto produto2 = new Produto ( "Samsung galaxy s7" , 4500d , "1943" );
        Produto produto3 = new Produto ( "carne de picanha" , 26d , "4526" );
        Produto produto4 = new Produto ( "teclado Razer" , 450d , "7567" );
        List < Produto > produtos = new ArrayList <> ();
        produtos.add ( produto1 );
        produtos.add ( produto2 );
        produtos.add ( produto3 );
        produtos.add ( produto4 );
        Collections.sort ( produtos );
        for (Produto pro : produtos) {
            System.out.println ( pro );

        }
    }
}
/* nesse caso eu nao posso chamar a classe Colletions.sort pq o java nao sabe oq ele tem que ordenar, para isso temos
que implementar na classe de meu produto a interface Comparable<Produto> e sobreescrever o metodo dela, para depois
podermos chamar.
 */
