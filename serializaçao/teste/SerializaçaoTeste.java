package br.com.abc.Java.serializaçao.teste;

import br.com.abc.Java.serializaçao.classes.Aluno;
import br.com.abc.Java.serializaçao.classes.Turma;

import java.io.*;

public class SerializaçaoTeste {
    public static void main(String[] args) {
        gravadorObjeto ();
        leitorObjeto ();

    }

    public static void gravadorObjeto() {//metodo para gravar objetos em arquivos
        Turma t = new Turma ( "DevDojo" );
        Aluno aluno1 = new Aluno ( 1l , "renan" , "250798" );
        aluno1.setTurma ( t );
        try (ObjectOutputStream oos = new ObjectOutputStream ( new FileOutputStream ( "aluno.ser" ) )) {
            oos.writeObject ( aluno1 );


        } catch (IOException e) {
            e.printStackTrace ();
        }

    }

    public static void leitorObjeto() {//metodo para ler objetos em arquivos
        try (ObjectInputStream ois = new ObjectInputStream ( new FileInputStream ( "aluno.ser" ) )) {
            Aluno aluno = (Aluno) ois.readObject ();
            System.out.println ( aluno );


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace ();
        }

    }
}
