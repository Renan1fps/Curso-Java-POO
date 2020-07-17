package br.com.abc.Java.polimorfismo.classes;

public class Relatorio {
    public void relatorioSalario(Funcionario funcionario){
        System.out.println("Relatorio de salarios");
        funcionario.calculaSalario();
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Salario: "+funcionario.salario);
    }
}
