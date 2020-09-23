package br.com.abc.Java.newIO.teste;

import java.io.IOException;
import java.nio.file.*;

public class PathMatcherTeste {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get ( "pasta2/subpasta/subpasta/arquivo.txt" );
        Path path2 = Paths.get ( "arquivo.txt" );
        PathMatcher matcher = FileSystems.getDefault ().getPathMatcher ( "glob:*.txt" );
        System.out.println ( matcher.matches ( path1 ) );
        System.out.println ( matcher.matches ( path2 ) );
        System.out.println ( "============================" );
        matcher ( path1 , "glob:*.txt" );
        matcher ( path1 , "glob:**.txt" );
        matcher ( path1 , "glob:*.txt" );
        matcher ( path1 , "glob:*.txt" );

    }

    public static void matcher(Path path , String glob) {
        PathMatcher matcher = FileSystems.getDefault ().getPathMatcher ( glob );
        System.out.println ( glob + " " + matcher.matches ( path ) );

    }
}
