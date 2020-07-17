package br.com.abc.Java.Introduçaometodos.teste;

import br.com.abc.Java.Introduçaometodos.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "sergio";
        prof.matricula = "201715410339";
        prof.rg = "2515555";
        prof.cpf = "67612560";


        Professor prof2 = new Professor();
        prof2.nome = "marcio";
        prof2.matricula = "201815410459";
        prof2.rg = "5353535";
        prof2.cpf = "515848418";


        prof.imprime(prof);
        prof.imprime(prof2);


    }
}


