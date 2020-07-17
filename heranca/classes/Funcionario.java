package br.com.abc.Java.heranca.classes;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome){
        super(nome);

    }

    public void imprime(){
        super.imprime();
        System.out.println("Salário: " + this.salario);
        imprimeRecibo();

    }
    public void imprimeRecibo(){
        System.out.println("Eu " + super.nome + " recebi o salario integral.");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
