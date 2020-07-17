package br.com.abc.Java.Introduçaometodos.teste;

import br.com.abc.Java.Introduçaometodos.classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(10, 20);
        double result = (calc.divisaoDoisNumeros(20, 2));
        System.out.println(result);
        System.out.println("--------------------");
        calc.imprimeDivisaoDoisNumeros(20, 0);
        System.out.println("Continua o programa");
        int[] numeros = {1, 2, 3, 4, 5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1, 2, 3, 4, 5, 6);


    }
}
