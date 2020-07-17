package br.com.abc.Java.associacao.classes;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno() {
    }

    public void imprime() {
        System.out.println(" Aluno: " + this.nome);
        System.out.println(" Idade: " + this.idade);
        if (seminario!=null){
        System.out.println("Participara do seminário:" + this.seminario.getTitulo());}
        else {
            System.out.println("O aluno nao esta em nenhum seminario");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
