package br.com.abc.Java.sobrecargametodos.teste;

import br.com.abc.Java.sobrecargametodos.classes.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.init("Renan", "066.676125-60", 4.500, "32645-6");
        funcionario.imprime();

    }
}
