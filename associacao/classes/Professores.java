package br.com.abc.Java.associacao.classes;

public class Professores {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;


    public Professores(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professores() {
    }

    private void impime() {
        System.out.println(this.nome);
        System.out.println(this.especialidade);
        for (Seminario aux : seminario) {
            System.out.println(aux.getTitulo());

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
}
