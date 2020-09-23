package br.com.abc.Java.newIO.teste;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

class acharTodosOsbkp extends SimpleFileVisitor < Path > {//retornando todos os arquivos;
    @Override
    public FileVisitResult visitFile(Path file , BasicFileAttributes attrs) {
     if (file.getFileName ().toString ().endsWith ( ".txt" )) {
            System.out.println ( file.getFileName () );
     }
        return FileVisitResult.CONTINUE;
    }

}

public class FileVisitorTeste {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree ( Paths.get ( "pasta2" ) , new acharTodosOsbkp () );

    }
}

class outra extends SimpleFileVisitor<Path>{//retornando pastas
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs){
        System.out.println (dir);

        return FileVisitResult.CONTINUE;
    }


}
