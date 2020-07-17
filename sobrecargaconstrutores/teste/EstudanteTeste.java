package br.com.abc.Java.sobrecargaconstrutores.teste;

import br.com.abc.Java.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante est = new Estudante("203456", "renan", new double[]{5, 6, 7}, "05/04/2020");
        est.imprime();

    }


}

