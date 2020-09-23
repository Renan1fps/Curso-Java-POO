package br.com.abc.Java.Exceptions.teste;

import java.io.File;
import java.io.IOException;

public class MultiplasExceçoes {
    public static void main(String[] args) {
        try {
            criaArquivo1();
        } catch (Exception e) { //exception é usado pq pega todos as exeçoes que o metodo pode lançar;
            e.printStackTrace();
        }

        try {//lembrar de colocar as execeptions das subclasses para super classes
            criaArquivo2();
        } catch (IOException | IllegalArgumentException | IndexOutOfBoundsException e) {
            e.printStackTrace();
        }


    }

    public static void criaArquivo1() throws IOException, IllegalArgumentException {//se lançar a exeption sou obrigado a tratar com try cath
        File file = new File("d:\\Music\\intellij");
    }

    public static void criaArquivo2() throws IOException, IllegalArgumentException, IndexOutOfBoundsException {
        File file = new File("d:\\Music\\intellij");

    }
}
