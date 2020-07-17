package br.com.abc.Java.introduçaoclasses.test;

import br.com.abc.Java.introduçaoclasses.classe.Estudante;

public class EstudanteTest1 {
    public static void main(String[] args) {
        Estudante renan = new Estudante();
        renan.nome = "renan";
        renan.matricula = "0808";
        renan.idade = 20;
        System.out.println(renan.idade);
        System.out.println(renan.nome);
        System.out.println(renan.matricula);
    }
}
