package br.com.abc.Java.newIO.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvendoPath {
    public static void main(String[] args) {
        Path dir = Paths.get ( "home\\william" );//path 1
        Path arquivo = Paths.get ( "dev\\arquivo.txt" );//path 2
        Path resultado = dir.resolve ( arquivo );//juntando os dois arquivos;
        System.out.println ( resultado );
    }
}
//se eu pegar um path relativo e tentar juntar com absoluto ele devolvera so o caminho absoluto
//ex: Path absoluto = Paths.get ( "home\\william\\" );
//    Path relativo = Paths.get ( "dev" );
// o resultado sera \home\william pq esse caminho é absoluto...todo e outro é mais generico;
