package br.com.abc.Java.IOfiles.teste;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterTeste {
    public static void main(String[] args) {
        File file = new File ( "Arquivo.txt" );

        try (FileWriter fileWriter = new FileWriter ( file , true );//chamando o fileWriter ele ja cria o arquivo;
             FileReader fileReader = new FileReader ( file )) {//para ler o arquivo;

            fileWriter.write ( "Escrevendo no arquivo\ne pulando uma linha!" );//chamo o writer para escrever no arquivo;
            fileWriter.flush ();//para ele "cuspir" tudo, mostrar tudo;
            char[] in = new char[500];//para saber o tanto de caracteres do arquivo;
            int size = fileReader.read ( in );//para ler os caracteres do texto; recebendo o in
            System.out.println ( "tamanho: " + size );
            for (char c : in) {
                System.out.print ( c );//para imprimir oq tem no arquivo;

            }
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
