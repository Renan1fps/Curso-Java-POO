package br.com.abc.Java.associacao.teste;

import br.com.abc.Java.associacao.classes.Aluno;
import br.com.abc.Java.associacao.classes.Local;
import br.com.abc.Java.associacao.classes.Professores;
import br.com.abc.Java.associacao.classes.Seminario;

public class SeminarioTeste {
    public static void main(String[] args) {
        Aluno estudy2 = new Aluno(" Emersom Delas", 18);
        Aluno estudy = new Aluno("renan", 20);
        Professores prof = new Professores("yoda", "mestre jaja");
        Seminario sem = new Seminario(" A Arte de passar raiva programando");
        Local loc = new Local("Rua dos bobos ", "Brás");

        estudy.setSeminario(sem);
        estudy2.setSeminario(sem);

        sem.setProfessores(prof);
        sem.setLocal(loc);
        sem.setAlunos(new Aluno[]{estudy,estudy2});

        prof.setSeminario(new Seminario[]{sem});

       sem.imprime();




    }
}
