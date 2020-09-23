package br.com.abc.Java.padroesDeProjeto.Teste;

import br.com.abc.Java.padroesDeProjeto.classes.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa.PessoaBuilder ()
                .nome ( "REnan" )
                .nomeDoMeio ( "Oliveira" )
                .ultimoNome ( "nunes" )
                .apelido ( "nan" )
                .nomePai ( "neuzan" )
                .criarPessoa ();
        System.out.println (pessoa);

    }
}
