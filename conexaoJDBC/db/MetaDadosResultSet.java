package br.com.abc.Java.conexaoJDBC.db;

import br.com.abc.Java.conexaoJDBC.cnn.ConexaoFactory;

import java.sql.*;

public class MetaDadosResultSet {
    public static void selectMetaDate() {
        String sql = "SELECT * FROM agencia.comprador;";
        Connection cnn = ConexaoFactory.getConexao ();
        try {
            Statement stm = cnn.createStatement ();
            ResultSet rs = stm.executeQuery ( sql );
            ResultSetMetaData rsmd = rs.getMetaData ();
            rs.next ();
            int qtdColunas = rsmd.getColumnCount ();
            System.out.println ( "Quantidade de colunas: " + qtdColunas );
            for (int i = 1; i < qtdColunas; i++) {
                System.out.println ( "tabela: " + rsmd.getTableName ( i ) );//Nome da tabela;
                System.out.println ( "Nome Coluna: " + rsmd.getColumnName ( i ) );
                System.out.println ( "Tamanho Coluna: " + rsmd.getColumnDisplaySize ( i ) );


            }
            ConexaoFactory.close ( cnn , stm , rs );
        } catch (SQLException e) {
            e.printStackTrace ();
        }

    }


}
