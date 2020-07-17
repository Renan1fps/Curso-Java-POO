package br.com.abc.Java.sobrescrita.teste;

import br.com.abc.Java.sobrescrita.classes.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa people = new Pessoa();
        people.setNome("Renan");
        people.setIdade(-8);
        people.setCpf("066.676.125-60");
        System.out.println(people);
        System.out.println("                                      ");
        Pessoa peo = new Pessoa();
        peo.setNome("Emerson");
        peo.setIdade(18);
        peo.setCpf("245.452.653-63");
        System.out.println(peo);
    }
}
