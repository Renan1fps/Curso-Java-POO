package br.com.abc.Java.IOfiles.teste;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipandoTeste {
    public static void main(String[] args) {
        Path dirZip = Paths.get ( "pastaP" );//1*
        Path dirFiles = Paths.get ( "pasta2/subpasta/subpasta" );//2*
        Path zipFile = dirZip.resolve ( "arquivo.zip" );//3*
        try (ZipOutputStream zip = new ZipOutputStream ( new FileOutputStream ( zipFile.toFile () ) );//4*
             DirectoryStream < Path > stream = Files.newDirectoryStream ( dirFiles )) {//5*
            for (Path pth : stream) {
                ZipEntry zipEntry = new ZipEntry ( pth.getFileName ().toString () );//6*
                zip.putNextEntry ( zipEntry );//7*
                FileInputStream fileInputStream = new FileInputStream ( pth.toFile () );
                byte[] buff = new byte[2048];//8*
                int bytesRead;//bytes lidos
                while ((bytesRead = fileInputStream.read ( buff )) > 0) {//9*
                    zip.write ( buff , 0 , bytesRead );//10*
                }
                zip.closeEntry ();
                fileInputStream.close ();

            }


        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}

/*1- diretorio em que ficara o zip;

2- a pasta onde esta os arquivos que quero zipar;

3- nome de como ficara o arquivo zipado, juntado com a pasta de destino, usando resolve (dirZip.resolve);

4- ZipOutputStream zip= new ZipOutputStream ( new FileOutputStream ( zipFile.toFile () ) <-- chamo a classe zip
e declado um file (pq estou zipando um arquivo) e passo o path do zip e convertendo ele para file;

5- DirectoryStream<Path>  para percorrer a pasta e me devolver todos os aquivos e passo o path onde está os arquivos
e coloco ele dentro do try para nao precisar colocar o .close;

6-  ZipEntry <--- é para colocar os arquivos dentro do zip (entradas), passo a variavel do for .getFileName.ToString
para ele converter em string ( so o .getFileName retona um path)

7- zip.putNextEntry ( zipEntry ) <-- chamo o zip da classe ZipOut... e chamo o metodo put para colocar o que vir
 de zipEntry dentro do meu zip

8- pegando os dados dos arquivos em forma de byte, para depois escrever no zip

9- (bytesRead= fileInputStream.read (buff) <-- a minha variavel bytesRead vai receber o que vier do buff em forma de
byte por meio ddo metodo fileInputStream. read

10-zip.write ( buff,0,bytesRead ); metodo para escrever no arquivo oq vier do meu array de bytes, o zero significa
que é da posiçao zero e e o bytesRead é o tanto de bytes que serão escritos
 */
