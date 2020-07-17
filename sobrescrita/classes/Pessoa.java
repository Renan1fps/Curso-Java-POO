package br.com.abc.Java.sobrescrita.classes;

public class Pessoa {
    private String nome;
    private int idade;
    private  String cpf;

    @Override
    public String toString() {
        return "nome: " + nome + " idade:" + idade + " cpf:" + cpf;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade<=0){
            System.out.println("Idade Iformada não existe!");

        }
        else {
            this.idade = idade;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
