package br.com.abc.Java.conexaoJDBC.teste;

import br.com.abc.Java.conexaoJDBC.classes.Comprador;
import br.com.abc.Java.conexaoJDBC.db.CompradorDBOLD;

import java.util.List;
import java.util.Scanner;

public class ConexaoTeste {

    public static void main(String[] args) {
        // update ();
        //  List < Comprador > list = selecionarTudo ();
        //  System.out.println ( list );
        //  MetaDadosResultSet.selectMetaDate ();
        //  CompradorDBOLD.posicionaCursor ();
        //  CompradorDBOLD.atualizandoNomesParaMinisculo ();
        //  CompradorDBOLD.updateComPreparedStatement ( new Comprador ( 1 , "Renan Oliveira Da Costa Nunes" , "066.676.125-60" ) );
        // CompradorDBOLD.inserindoTeste ();
        // System.out.println ( CompradorDBOLD.searchByNameRowSet ( "nan" ) );
        //CompradorDBOLD.updateRowSet ( new Comprador (4,"Acer","545.154.565-46") );
        CompradorDBOLD.transacao ();


    }

    public static void inserir() {
        Comprador comprador = new Comprador ( "Renan Oliveira" , "066.676.125-60" );
        CompradorDBOLD com = new CompradorDBOLD ();
        com.save ( comprador );
    }

    public static void deletar() {
        Comprador comprador = new Comprador ();
        comprador.setId ( 2 );
        CompradorDBOLD.deletando ( comprador );

    }

    public static void update() {
        Comprador comprador = new Comprador ( 1 , "RENAN" , "000.000.000-00" );
        CompradorDBOLD.update ( comprador );

    }

    public static List < Comprador > selecionarTudo() {
        return CompradorDBOLD.selectAll ();
    }
}
