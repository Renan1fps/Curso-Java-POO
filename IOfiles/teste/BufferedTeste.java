package br.com.abc.Java.IOfiles.teste;

import java.io.*;

public class BufferedTeste {
    public static void main(String[] args) {
        File file = new File ( "Arquivo.txt" );

        //metodo melhorado;
        try (BufferedWriter bw = new BufferedWriter ( new FileWriter ( file ) );
             BufferedReader br = new BufferedReader ( new FileReader ( file ) )) {//nao preciso de close
            bw.write ( "Escrevendo no arquivoe pulando uma linha!" );
            bw.newLine ();//para pular linha
            bw.write ( "escrevendo com bf" );
            bw.flush ();
            String line;
            while ((line = br.readLine ()) != null) {
                System.out.println ( line );
            }

        } catch (IOException e) {
            e.printStackTrace ();
        }

        //metodo "piorado"
//        try {
//            FileWriter fileWriter = new FileWriter ( file );
//            BufferedWriter bw = new BufferedWriter ( fileWriter );
//
//            bw.write ( "Escrevendo no arquivoe pulando uma linha!" );
//            bw.newLine ();//para pular linha
//            bw.write ( "escrevendo com bf" );
//            bw.flush ();
//            bw.close ();
//            FileReader fr = new FileReader ( file );
//            BufferedReader br = new BufferedReader ( fr );
//            String line = null;
//            while ((line = br.readLine ()) != null) {
//                System.out.println ( line );
//            }
//            br.close ();//o br que é mais externo fecha o mais interno que é o fr
//
//        } catch (IOException e) {
//            e.printStackTrace ();
//        }

    }
}
