package br.com.abc.Java.newIO.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AtributosBasicosTeste {
    public static void main(String[] args) throws IOException {

        //modo "antigo" para se trabalahar com arquivos
        Date primeiroDezembro = new GregorianCalendar ( 2015 , Calendar.DECEMBER , 1 ).getTime ();//criando uma data
        File file = new File ( "Rename\\novo68.txt" );
        file.createNewFile ();
        file.setLastModified ( primeiroDezembro.getTime () );//setando uma data
        System.out.println ( file.lastModified () );
        file.delete ();




        //java 8 para se trabalhar com arquivos...
        Path path = Paths.get ( "novo08" );
        Files.createFile ( path );
        FileTime fileTime = FileTime.fromMillis ( primeiroDezembro.getTime () );//para modificar datas é preciso FileTime
        Files.setLastModifiedTime ( path , fileTime );
        System.out.println ( Files.getLastModifiedTime ( path ) );
        Files.deleteIfExists ( path );


        path = Paths.get ( "src\\br\\com\\abc\\Java\\associacao\\classes" );
        System.out.println ( Files.isExecutable ( path ) );//se é executavel
        System.out.println ( Files.isReadable ( path ) );//se é para leitura
        System.out.println ( Files.isWritable ( path ) );//Se é para escrever


//para se trabalhar com atributos de arquivos, passando o path e usando essa interface BasicFileAttributes, ao invés de Files
// ela é só para leitura, caso eu queira setar valoes uso a basicView
        BasicFileAttributes basicFileAttributes = Files.readAttributes ( path , BasicFileAttributes.class );
        System.out.println ( basicFileAttributes.isDirectory () );
        System.out.println ( basicFileAttributes.lastAccessTime () );
        System.out.println ( basicFileAttributes.lastModifiedTime () );
        System.out.println ( basicFileAttributes.creationTime () );

        //para se trabalhar com modificaçao de arquivos usamos
        FileTime lastModified = basicFileAttributes.lastModifiedTime();
        FileTime created = basicFileAttributes.creationTime();
        FileTime lastAcess = FileTime.fromMillis(System.currentTimeMillis());

        //para alteraçao de files a diferença é o view e o getFileAttributeView ao invés de readAttributes
        BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        basicView.setTimes(lastModified,lastAcess,created);
        basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("create "+ basicFileAttributes.creationTime());
        System.out.println("lastAccess "+ basicFileAttributes.lastAccessTime());
        System.out.println("LastModified "+ basicFileAttributes.lastModifiedTime());




    }
}
