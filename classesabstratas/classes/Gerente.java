package br.com.abc.Java.classesabstratas.classes;

public class Gerente  extends Funcionario{

    public Gerente() {
    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public void calculaSalario() {
        super.salario= salario+ (salario*0.5);
    }
}
