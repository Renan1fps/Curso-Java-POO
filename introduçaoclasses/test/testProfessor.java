package br.com.abc.Java.introduçaoclasses.test;

import br.com.abc.Java.introduçaoclasses.classe.Professor;

public class testProfessor {
    public static void main(String[] args) {
        Professor sergio = new Professor();
        sergio.nome = "sergio";
        sergio.matricula = "201715410339";
        sergio.rg = 2515555;
        sergio.cpf = 67612560;
        System.out.println(sergio.cpf);
        System.out.println(sergio.matricula);
        System.out.println(sergio.nome);
        System.out.println(sergio.rg);
    }
}
