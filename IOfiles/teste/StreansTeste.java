package br.com.abc.Java.IOfiles.teste;

import java.io.*;

public class StreansTeste {
    public static void main(String[] args) {
        leitor ();


    }

    //lendo e escrevendo bytes com streans

    public static void gravador() {
        byte[] dados = {65 , 66 , 67 , 68 , 69 , 70};//array de bytes para ser gravado, nao aceita String
        try (FileOutputStream gravador = new FileOutputStream ( "pastaP/stream.txt" )) {
            gravador.write ( dados );// metodo para gravar;
            System.out.println ( "dados gravados com sucesso!" );
        } catch (IOException e) {
            e.printStackTrace ();

        }

    }


    //com bufferedReader o mesmo serve para a classe leitor usando buffered
    public static void gravadorTunado() {
        byte[] dados = {65 , 66 , 67 , 68 , 69 , 70};//array de bytes para ser gravado, nao aceita String
        try (BufferedOutputStream gravadorbuffer = new BufferedOutputStream ( new FileOutputStream ( "pastaP/stream.txt" ) )) {//2-*
            gravadorbuffer.write ( dados );// metodo para gravar;
            gravadorbuffer.flush ();//para nao perder dados,  fazer todo o processo, usar por preucaçao..
            System.out.println ( "dados gravados com sucesso!" );
        } catch (IOException e) {
            e.printStackTrace ();

        }

    }

    private static void leitor() {//para ler o arquivo
        try (FileInputStream leitor = new FileInputStream ( "pastaP/stream.txt" )) {//classe de leitura;
            int leitura;//porque retorna um int
            while ((leitura = leitor.read ()) != -1) {//leitor é a classe que faz o serviço de ler o arquivo;
                byte b = (byte) leitura;//converter para byte pq os arquivos sao gravados em byte;
                System.out.println ( " " + b );

            }

        } catch (IOException e) {
            e.printStackTrace ();

        }
    }
}


//1-try(FileOutputStream gravador= new FileOutputStream ( "pastaP/stream.txt",true )){//<---para escrever no final, continuando
//2-try (BufferedOutputStream gravador = new BufferedOutputStream ( new FileOutputStream ( "pastaP/stream.txt" ) )) {//metodo mais pratico com o buffered que é otimizado
//para escrever em arquivos e ela cria automaticamente o arquivo, se existir ele é sobreescrito