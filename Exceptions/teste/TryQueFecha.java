package br.com.abc.Java.Exceptions.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TryQueFecha {
    public static void main(String[] args) {
        String[] lines = new String[]{"olá, Bom dia!", "Olá, boa noite!", "olá, como está?"};
        String path = "d:\\Music\\newText.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {//colocar dentro do parenteses classes que fecham
            for (String line : lines) {                                    // posso usar sem o cath mas preciso lançar a exeception
                bw.write(line);
                bw.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


