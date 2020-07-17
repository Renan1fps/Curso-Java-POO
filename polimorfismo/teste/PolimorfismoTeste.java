package br.com.abc.Java.polimorfismo.teste;

import br.com.abc.Java.polimorfismo.classes.Gerente;
import br.com.abc.Java.polimorfismo.classes.Relatorio;
import br.com.abc.Java.polimorfismo.classes.Vendedor;

public class PolimorfismoTeste {
    public static void main(String[] args) {
        Gerente g = new Gerente("Renan", 3500, 2000);
        Vendedor v = new Vendedor("Emersom", 2000, 5000);
        Relatorio relatorio = new Relatorio();
        relatorio.relatorioSalario(g);
        System.out.println("------------------");
        relatorio.relatorioSalario(v);

    }
}
