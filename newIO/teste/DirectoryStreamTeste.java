package br.com.abc.Java.newIO.teste;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTeste {
    public static void main(String[] args) {

        Path dir = Paths.get ( "Rename" );
        try (DirectoryStream < Path > stream = Files.newDirectoryStream ( dir )) {// para buscar todos os arquivos de uma vez
            for (Path stt : stream) {
                System.out.println ( stt.getFileName () );

            }

        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
