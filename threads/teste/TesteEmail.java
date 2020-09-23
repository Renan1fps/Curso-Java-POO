package br.com.abc.Java.threads.teste;

import br.com.abc.Java.threads.classes.ClasseEntregador;
import br.com.abc.Java.threads.classes.ListaMembros;

import javax.swing.*;

public class TesteEmail {
    public static void main(String[] args) {
        ListaMembros listaMembros = new ListaMembros ();
        Thread t1 = new Thread ( new ClasseEntregador ( listaMembros ) , "entregado1" );
        Thread t2 = new Thread ( new ClasseEntregador ( listaMembros ) , "entregado2" );
        t1.start ();
        t2.start ();
        while (true) {
            String email = JOptionPane.showInputDialog ( "digite o email: " );
            if (email == null || email.isEmpty ()) {
                listaMembros.fechandoLista ();
                break;
            }
            listaMembros.adicionandoEmailLista ( email );
        }
    }
}
