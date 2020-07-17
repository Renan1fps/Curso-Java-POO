package br.com.abc.Java.enumeracao.teste;

import br.com.abc.Java.enumeracao.classes.Cliente;
import br.com.abc.Java.enumeracao.classes.TipoCliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("renan", TipoCliente.PESSOA_FISICA);
        System.out.println(cliente);

    }
}
