package br.com.abc.Java.Introduçaometodos.classes;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public void print() {
        System.out.println("nome:" + this.nome);
        System.out.println("idade:" + this.idade);
        if (this.notas != null) {
            for (double nota : this.notas) {
                System.out.println(nota + " ");
            }

        }
    }

    public void MediaAluno() {
        if (notas == null) {
            System.out.println("sem notas");
            return;
        }

        double media = 0;
        for (double nota : this.notas) {
            media += nota;

        }
        media = media / notas.length;
        this.aprovado = true;
        if (media > 6) {
            System.out.printf("Aluno aprovado!!");
            return;
        } else {
            this.aprovado = false;
            System.out.printf("Aluno reprovado!!");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("idade inexistente!");
            return;
        }
        this.idade = idade;

    }

    public void setNotas(double[] notas) {
        this.notas = notas;

    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return this.notas;
    }
    public boolean isAprovado(){
        return this.aprovado;
    }
}




