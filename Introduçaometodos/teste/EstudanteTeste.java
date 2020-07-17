package br.com.abc.Java.Introduçaometodos.teste;

import br.com.abc.Java.Introduçaometodos.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        aluno.setNome("renan");
        aluno.setIdade(10);
        aluno.setNotas(new double[]{3, 2, 5});
        aluno.print();
        aluno.MediaAluno();
        System.out.println("aprovado?  " + aluno.isAprovado());


    }

}

