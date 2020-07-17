package br.com.abc.Java.interfaces.classes;

public class Produto implements Tributavel, Transpotavel{
    private String nome;
    private double preco;
    private double peso;
    private double valorFinal;
    private double frete;


    @Override
    public void calculaFrete() {
        this.frete= this.preco/this.peso*0.1;
    }

    @Override
    public void calculaImposto() {
        this.valorFinal=this.preco+(this.preco*IMPOSTO);

    }

    public Produto(String nome, double preco, double peso) {
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;

    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", peso=" + peso +
                ", valorComImposto=" + valorFinal +
                ", frete=" + frete +
                '}';
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public double getFrete() {
        return frete;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
