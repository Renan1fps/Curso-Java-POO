package br.com.abc.Java.conexaoJDBC.teste;

import br.com.abc.Java.conexaoJDBC.classes.Comprador;
import br.com.abc.Java.conexaoJDBC.db.CompradorDAOimpl;
import br.com.abc.Java.conexaoJDBC.interfaces.CompradorDAO;

import java.util.List;
import java.util.Scanner;

public class ConexaoCRUD {
    public static Scanner teclado = new Scanner ( System.in );
   private static CompradorDAO com= new CompradorDAOimpl ();

    public static void main(String[] args) {
        int op;
        while (true) {
            menu ();
            op = Integer.parseInt ( teclado.nextLine () );
            if (op == 0) {
                System.out.println ( "Saindo do sistema:" );
                break;
            }
            executar ( op );
        }

    }

    public static void executar(int op) {
        switch (op) {
            case 1:
                inserir ();
                break;
            case 2:
                atualizar ();
                break;
            case 3:
                listar ();
                break;
            case 4:
                System.out.println ( "digite o nome a ser buscado:  " );
                buscarPorNome ( teclado.nextLine () );
                break;
            case 5:
                deletar ();
                break;
        }


    }

    private static void inserir() {
        Comprador c = new Comprador ();
        System.out.println ( "Nome:" );
        c.setNome ( teclado.nextLine () );
        System.out.println ( "Cpf:" );
        c.setCpf ( teclado.nextLine () );
        com.save ( c );

    }

    private static void atualizar() {
        System.out.println ( "Selecione um dos compradores abaixo para atualizar:" );
        List < Comprador > listaparaatt = listar ();
        Comprador c = listaparaatt.get ( Integer.parseInt ( teclado.nextLine () ) );
        System.out.println ( "dgite o novo nome ou aperte enter para manter o mesmo:" );
        String nome = teclado.nextLine ();
        System.out.println ( "dgite o novo cpf ou aperte enter para manter o mesmo:" );
        String cpf = teclado.nextLine ();
        if (!nome.isEmpty ()) {
            c.setNome ( nome );
        }
        if (!cpf.isEmpty ()) {
            c.getCpf ();
        }
        com.update ( c );
    }

    private static List < Comprador > listar() {
        List < Comprador > compradorBuscar = com.selectAll ();
        for (int i = 0; i < compradorBuscar.size (); i++) {
            Comprador c = compradorBuscar.get ( i );
            System.out.println ( i + " " + c.getNome () + " " + c.getCpf () );

        }
        return compradorBuscar;
    }

    private static void buscarPorNome(String nome) {
        List < Comprador > compradorBuscar = com.searchByNAme ( nome );
        for (int i = 0; i < compradorBuscar.size (); i++) {
            Comprador c = compradorBuscar.get ( i );
            System.out.println ( i + " " + c.getNome () + " " + c.getCpf () );

        }
    }

    public static void deletar() {
        System.out.println ( "selecione um dos compradores abaixo para deletar: " );
        List < Comprador > compradorList = listar ();
        int index = Integer.parseInt ( teclado.nextLine () );
        System.out.println ( "tem certeza que deseja deletar? s/n" );
        String op = teclado.nextLine ();
        if (op.startsWith ( "s" )) {
            com.deletando ( compradorList.get ( index ) );
        }
    }


    private static void menu() {
        System.out.println ( "Digite a operaçao para começar: " );
        System.out.println ( "1-Inserir comprador" );
        System.out.println ( "2-Atualizar Comprador" );
        System.out.println ( "3-Listar todos os compradores" );
        System.out.println ( "4-Buscar comprador por nome" );
        System.out.println ( "5-Deletar" );
        System.out.println ( "0-Sair" );
    }
}
