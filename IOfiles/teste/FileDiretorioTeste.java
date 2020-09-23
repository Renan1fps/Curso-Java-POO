package br.com.abc.Java.IOfiles.teste;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTeste {
    public static void main(String[] args) throws IOException {
//        File file = new File ( "Folder" );
//        boolean mkdir = file.mkdir ();//para criar pastas
//        System.out.println ( "criado? " + mkdir );
//        File arquivo = new File ( file , "novo.txt" );//coloco a variavel da pasta e o novo arquivo dentro da pasta;
//        boolean newFile = arquivo.createNewFile ();
//        File renomearArquivo = new File ( file , "renomeado.txt" );//renomenado o arquivo dentro da pasta folder;
//        arquivo.renameTo ( renomearArquivo );
//        File renomearPasta = new File ( "Rename" );//renomeando pasta;
//        file.renameTo ( renomearPasta );
        buscarArquivo ();
    }

    public static void buscarArquivo() {// metodo para buscar arquivos dentro de uma pasta;
        File buscar = new File ( "Rename" );
        String[] list = buscar.list ();//tenho que criar um array de string para pegar esse arquivos; e chamo a funçao list;
        for (String arquivo : list) {
            System.out.println ( arquivo );

        }
    }
}
