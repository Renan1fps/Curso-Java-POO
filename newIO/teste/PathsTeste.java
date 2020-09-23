package br.com.abc.Java.newIO.teste;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class PathsTeste {//path=interface paths=classe  usa-se muito polimorfismo;

    public static void main(String[] args) {//maneiras de pegar,passar...o path, pastas... ao inves de File
//        Path p1 = Paths.get ( "C:\\Users\\renan\\IdeaProjects\\primeiro, Arquivo.txt " );
//        Path p2 = Paths.get ( "C:" , "Users\\renan\\IdeaProjects\\primeiro ,Arquivo.txt " );
//        Path p3 = Paths.get ( "C:" , "Users" , "renan" , "IdeaProjects" , "primeiro" , "Arquivo.txt " );
//        File file = p3.toFile ();//tranformando um path em um file e vice versa..
//        Path path = file.toPath ();
//
        Path path1 = Paths.get ( "pastaP" );//caminho da pasta e nome
        Path path2 = Paths.get ( "pasta2\\subpasta\\subpasta" );
        Path arquivo = Paths.get ( "pasta2\\subpasta\\subpasta\\arquivo.txt" );
        try {
            if (Files.notExists ( path1 ))//para saber se existe;
                Files.createDirectory ( path1 );//criando pasta com Files;
            if (Files.notExists ( path2 ))
                Files.createDirectories ( path2 );//criando mais de uma pasta;
            if (Files.notExists ( arquivo ))
                Files.createFile ( arquivo );//tenho que criar um path e passar o caminho, se usar directories ele cria uma pasta;
        } catch (IOException e) {
            e.printStackTrace ();
        }
        Path copiarArquivo = Paths.get ( "pastaP\\corinthians.txt" );//passo o path e o arquivo;
        Path pastaDestino = Paths.get ( path2.toString () + "\\copiado.txt" );//chamo path2.toString e o nome do arquivo;
        try {
            Files.copy ( copiarArquivo , pastaDestino );//chamo o metodo copy e passo o nome das variaveis;
            Files.deleteIfExists ( pastaDestino );
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }

}
// Files.copy ( copiarArquivo , pastaDestino, StandardCopyOption.REPLACE_EXISTING );//para renomerar oq ja existe;
// Files.deleteIfExists ( pastaDestino );//para deletar caso o arquivo exista na pasta destino;
