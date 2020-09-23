package br.com.abc.Java.threads.teste;

public class Conta {
    private Integer saldo = 50;

    public Integer getSaldo() {
        return saldo;
    }

    public void saque(int valor) {
        this.saldo = saldo - valor;
    }
}
