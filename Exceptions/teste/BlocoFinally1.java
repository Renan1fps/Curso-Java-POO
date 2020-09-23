package br.com.abc.Java.Exceptions.teste;

import java.io.File;
import java.io.IOException;

public class BlocoFinally1 {
    public static void main(String[] args) {
        try {
            criaArquivo();
        } catch (IOException e) {

        }

    }

    public static void criaArquivo() throws IOException {//lançando a exceçao para quem chamou
        File file = new File("d\\intellij");
        try {
            file.createNewFile();
            System.out.println("Arquivo criado");
            System.out.println("escrevendo no arquivo");
            //se o metodo tiver retorno, lembrar de colocar o return no try e no return null no finally

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            System.out.println("fechando");//aqui ele será executado independente do try cath
        }

    }
}



