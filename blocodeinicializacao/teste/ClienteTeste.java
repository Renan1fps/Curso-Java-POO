package br.com.abc.Java.blocodeinicializacao.teste;

import br.com.abc.Java.blocodeinicializacao.classes.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        for (int aux : cli.getParcelas()) {
            System.out.print(aux + " ");
        }
    }
}
