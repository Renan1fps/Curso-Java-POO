package br.com.abc.Java.colecoes.teste;

import br.com.abc.Java.colecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoveTeste {
    public static void main(String[] args) {
        Produto produto1 = new Produto ( "Notebook aspire 3" , 2500d , "1456" , 0 );
        Produto produto2 = new Produto ( "Samsung galaxy s7" , 4500d , "1943" , 10 );
        Produto produto3 = new Produto ( "carne de picanha" , 26d , "4526" , 5 );
        Produto produto4 = new Produto ( "teclado Razer" , 450d , "7567" , 0 );
        List < Produto > produtos = new ArrayList <> ();
        produtos.add ( produto1 );
        produtos.add ( produto2 );
        produtos.add ( produto3 );
        produtos.add ( produto4 );
        Iterator < Produto > produtoIterator = produtos.iterator ();
        while (produtoIterator.hasNext ()) {
            Produto produto = produtoIterator.next ();
            if (produto.getQuantidade () == 0) {
                produtoIterator.remove ();

            }

        }
        System.out.println ( produtos.size () );

    }
}
