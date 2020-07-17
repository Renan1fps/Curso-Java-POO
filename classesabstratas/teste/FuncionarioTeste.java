package br.com.abc.Java.classesabstratas.teste;

import br.com.abc.Java.classesabstratas.classes.Funcionario;
import br.com.abc.Java.classesabstratas.classes.Gerente;
import br.com.abc.Java.classesabstratas.classes.Vendedor;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Vendedor ven = new Vendedor("Emersom", "20171-20", 2500, 800);
        Gerente gen = new Gerente("Renan", "20171-19", 3000);
        ven.calculaSalario();
        gen.calculaSalario();
        System.out.println(gen);
        System.out.println("-----------");
        System.out.println(ven);


    }
}
