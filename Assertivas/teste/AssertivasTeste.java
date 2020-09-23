package br.com.abc.Java.Assertivas.teste;

public class AssertivasTeste {
    public static void main(String[] args) {
        calculaSalario(-10000);

    }

    private static void calculaSalario(double salario) {//sempre privado e só colocar se tiver certeza que a logica será aquela
        assert (salario > 0);
    }
}
