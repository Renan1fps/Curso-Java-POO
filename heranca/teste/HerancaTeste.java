package br.com.abc.Java.heranca.teste;

import br.com.abc.Java.heranca.classes.Endereco;
import br.com.abc.Java.heranca.classes.Funcionario;
import br.com.abc.Java.heranca.classes.Pessoa;

public class HerancaTeste {
    public static void main(String[] args) {
        Pessoa pes = new Pessoa("Renan");
        pes.setCpf("066.676.125.60");
        pes.setIdade(20);
        Endereco end = new Endereco();
        end.setRua("Rua dos Bobos");
        end.setBairro("Centro");
        pes.setEndereco(end);
        pes.imprime();
        System.out.println("------------------------");
        Funcionario f = new Funcionario("Emersom Valentin");
        f.setCpf("054.254.451-54");
        f.setIdade(18);
        f.setSalario(2500);
        f.setEndereco(end);
        f.imprime();

    }
}
