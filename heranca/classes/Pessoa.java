package br.com.abc.Java.heranca.classes;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected int idade;
    protected Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa(){

    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Idade: " + this.idade);
        System.out.println("Bairro: " + this.endereco.getBairro() + " " + " Rua:" + this.endereco.getRua());

    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
