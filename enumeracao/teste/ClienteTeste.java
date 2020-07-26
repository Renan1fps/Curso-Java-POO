package br.com.abc.Java.enumeracao.teste;

import br.com.abc.Java.enumeracao.classes.Cliente;
import br.com.abc.Java.enumeracao.classes.TipoCliente;

import java.util.Scanner;

public class ClienteTeste {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter with your name:");
        String nome= sc.nextLine();
        System.out.println("what kind of person are you?");
        TipoCliente tip= TipoCliente.valueOf(sc.nextLine());
        Cliente cliente = new Cliente(nome, tip);
        System.out.println(cliente);

    }
}
