package br.com.abc.Java.evitandoNullPointer.teste;

import java.util.Optional;

public class OptionalTeste {
    public String nome;

    public static void main(String[] args) {//usado para evitar o NullPointerException

        OptionalTeste op = new OptionalTeste ();//a classe option encapsula a minha variavel

        Optional < String > optional1 = Optional.of ( "renan" );//a variavel que eu passar no optional.of nao pode ser nula

        Optional < String > optional2 = Optional.empty ();//se eu quiser iniciar o optional vazio

        Optional < String > optional3 = Optional.ofNullable ( op.nome );//aqui é quando eu nao sei se a variavel é nula ou nao

        //imprimindo os valores
        System.out.println ( optional1 );
        System.out.println ( optional2 );
        System.out.println ( optional3 );
        //buscando valores
        System.out.println (optional1.get ());//forma mais basica e é preciso ter certeza que  variavel nao sera nula
        System.out.println (optional1.orElse ( "vazio" ));//ele vai buscar a variavel, se nao tiver nada ele retorna oq tem dentro do orElse

    }
}
