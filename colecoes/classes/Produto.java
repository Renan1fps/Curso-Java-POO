package br.com.abc.Java.colecoes.classes;

import java.util.Objects;

public class Produto implements Comparable < Produto > {
    private String nome;
    private Double preco;
    private String serialNumero;
    private Integer quantidade;


    public Produto(String nome , Double preco , String serialNumero) {
        this.nome = nome;
        this.preco = preco;
        this.serialNumero = serialNumero;
    }

    public Produto(String nome , Double preco , String serialNumero , Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.serialNumero = serialNumero;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto=" +
                " nome: " + nome + "|" +
                " preco: " + preco + "|" +
                " serialNumero: " + serialNumero + "|" +
                "quantidade" + quantidade;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Produto produto = (Produto) o;
        return Objects.equals ( serialNumero , produto.serialNumero );
    }

    @Override
    public int hashCode() {
        return Objects.hash ( serialNumero );
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getSerialNumero() {
        return serialNumero;
    }

    public void setSerialNumero(String serialNumero) {
        this.serialNumero = serialNumero;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return this.preco.compareTo ( outroProduto.getPreco () );
    }
}
/*nesse metodo estou pegando um atributo que eu quero para ser comparado (ordenado), passando tudo para maisculo e comparando com o outro produto
que vem como argumento
 */
