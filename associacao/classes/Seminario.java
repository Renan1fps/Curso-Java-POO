package br.com.abc.Java.associacao.classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professores professores;
    private Local local;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void imprime() {
        System.out.println(this.titulo);
        System.out.println(this.professores.getNome());
        System.out.println(this.local.getRua()+ local.getBairro());
        for (Aluno aux : alunos) {
            System.out.println(aux.getNome());
        }
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professores getProfessores() {
        return professores;
    }

    public void setProfessores(Professores professores) {
        this.professores = professores;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
