package br.com.abc.Java.interfaces.teste;

import br.com.abc.Java.interfaces.classes.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto pro = new Produto("notebook", 3200, 3);
        pro.calculaFrete();
        pro.calculaImposto();
        System.out.println(pro);
    }
}
