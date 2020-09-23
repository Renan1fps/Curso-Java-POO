package br.com.abc.Java.IOfiles.teste;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class IoTeste {
    public static void main(String[] args) {
        Date datanova= new Date ();
        File file = new File ( "arquivo.txt" );//estanciando o arquivo sem passar o caminho; sempre com try catch
        try {
            file.createNewFile ();//criando o arquivo em branco
            System.out.println ( file.canRead () );//se tenho permissao para leitura, retorna booleano;
            System.out.println ( file.isDirectory () );// se é uma pasta;
            System.out.println ( file.getName () );//pega o nome do arquivo;
            System.out.println ( file.getAbsoluteFile () );//me retona o caminho onde o arquivo está;
            System.out.println ( file.getPath () );//onde está o arquivo, sem passar o caminho todo;
            System.out.println ( new Date ( file.lastModified () ) );//ultima vez que foi modificado; tem que estar em um date;
            System.out.println ( file.isHidden () );//para sabe se é um aquivo oculto; retorna true ou false;
            System.out.println ( file.exists () );//para saber se existe;retorna true ou false;
            file.setLastModified ( datanova.getTime () );//se eu quiser setar....


        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
