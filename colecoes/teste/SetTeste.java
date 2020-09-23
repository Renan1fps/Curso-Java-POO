package br.com.abc.Java.colecoes.teste;

import br.com.abc.Java.colecoes.classes.Produto;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTeste {
    public static void main(String[] args) {
        Produto produto1 = new Produto ( "Notebook aspire 3" , 2500d , "1456" , 0 );
        Produto produto2 = new Produto ( "Samsung galaxy s7" , 4500d , "1943" , 10 );
        Produto produto3 = new Produto ( "carne de picanha" , 26d , "4526" , 5 );
        Produto produto4 = new Produto ( "teclado Razer" , 450d , "7567" , 0 );
        Set < Produto > produtoSet = new HashSet <> ();//nao permite elementos repetidos em sua lista e nao é organizado
        produtoSet.add ( produto1 );
        produtoSet.add ( produto2 );
        produtoSet.add ( produto3 );
        produtoSet.add ( produto4 );


        Set<Produto>produtoSet2= new LinkedHashSet <> ();//nao permite repetiçoes e mantem a ordem;
        produtoSet2.add ( produto1 );
        produtoSet2.add ( produto2 );
        produtoSet2.add ( produto3 );
        produtoSet2.add ( produto4 );

        for (Produto p : produtoSet2) {
            System.out.println ( p );

        }

    }
}
/*Set nao possue posiçoes e nao permite elementos duplicados essa é a diferença para List e se estiver trabalhando com
objetos, minha classe deve ter os metodos hashcode e equals
 */

