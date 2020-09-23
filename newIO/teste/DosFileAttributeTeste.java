package br.com.abc.Java.newIO.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributeTeste {
    public static void main(String[] args) {
        Path path = Paths.get ( "Rename\\dosteste.txt" );
        try {
           // Files.createFile ( path );
            Files.setAttribute ( path , "dos:hidden" , true );//colocando ele para oculto
            Files.setAttribute ( path , "dos:readonly" , true );//colocando ele apenas  para leitura;
            DosFileAttributes dos = Files.readAttributes ( path , DosFileAttributes.class );//lendo com dos;
            System.out.println ( dos.isHidden () );
            System.out.println ( dos.isReadOnly () );


            //maneira mais facil de modificar o arquivo; Essa classe é exclusiva para Windows;
            DosFileAttributeView dosview= Files.getFileAttributeView ( path, DosFileAttributeView.class );
            dosview.setHidden ( false );
            dosview.setReadOnly ( false );
            dos = Files.readAttributes ( path , DosFileAttributes.class );//tenho que usar essa classe de novo para leitura
            System.out.println ( dos.isHidden () );
            System.out.println ( dos.isReadOnly () );
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
//  DosFileAttributes dos= Files.readAttributes ( path, DosFileAttributes.class ); serve para ler atributos
