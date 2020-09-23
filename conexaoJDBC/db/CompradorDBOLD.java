package br.com.abc.Java.conexaoJDBC.db;

import br.com.abc.Java.conexaoJDBC.classes.Comprador;
import br.com.abc.Java.conexaoJDBC.cnn.ConexaoFactory;

import javax.sql.rowset.JdbcRowSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompradorDBOLD {
    public static void save(Comprador comprador) {//inserindo dados no MYSQL
        String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('" + comprador.getCpf () + "', '" + comprador.getNome () + "');";
        Connection conn = ConexaoFactory.getConexao ();
        try {
            Statement stm = conn.createStatement ();
            stm.executeUpdate ( sql );
            ConexaoFactory.close ( conn , stm );
            System.out.println ( "Resgistro inserido com sucesso!" );

        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }

    public static void transacao() {//inserindo dados no MYSQL
        String sql1 = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('TESTE1', 'TESTE1');";
        String sql2 = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('TESTE2', 'TESTE2');";
        String sql3 = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('TESTE3', 'TESTE3');";
        String sql4 = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('TESTE4', 'TESTE4');";
        String sql5 = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('TESTE5', 'TESTE5');";
        Connection conn = ConexaoFactory.getConexao ();
        try {
            conn.setAutoCommit (false);
            Statement stm = conn.createStatement ();
            stm.executeUpdate ( sql1);
            stm.executeUpdate ( sql2);
            stm.executeUpdate ( sql3);
            stm.executeUpdate ( sql4);
            stm.executeUpdate ( sql5);
            conn.commit ();
            ConexaoFactory.close ( conn , stm );
            System.out.println ( "Resgistro inserido com sucesso!" );

        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }

    public static void deletando(Comprador comprador) {//Excluindo dados no MYSQL
        if (comprador == null || comprador.getId () == null) {
            System.out.println ( "Nao foi possivel excluir o resgistro!" );
            return;
        }
        String sql = "DELETE FROM `agencia`.`comprador` WHERE (`idcomprador` = '" + comprador.getId () + "')";
        Connection conn = ConexaoFactory.getConexao ();
        try {
            Statement stm = conn.createStatement ();
            stm.executeUpdate ( sql );
            ConexaoFactory.close ( conn , stm );
            System.out.println ( "Resgistro excluido com sucesso!" );
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }

    public static void update(Comprador comprador) {//Atualizando dados no MYSQL
        if (comprador == null || comprador.getId () == null) {
            System.out.println ( "Nao foi possivel atualizar o resgistro!" );
            return;
        }
        String sql = "UPDATE `agencia`.`comprador` SET `cpf` = '" + comprador.getCpf () + "', `nome` = '" + comprador.getNome () + "' WHERE (`idcomprador` = '" + comprador.getId () + "')";
        Connection conn = ConexaoFactory.getConexao ();
        try {
            Statement stm = conn.createStatement ();
            stm.executeUpdate ( sql );
            ConexaoFactory.close ( conn , stm );
            System.out.println ( "Resgistro atualizado com sucesso!" );
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }

    public static List < Comprador > selectAll() {//buscar
        String sql = "SELECT idcomprador,nome, cpf FROM agencia.comprador;";
        Connection conn = ConexaoFactory.getConexao ();
        try {
            Statement stm = conn.createStatement ();
            ResultSet rs = stm.executeQuery ( sql );
            List < Comprador > compradors = new ArrayList <> ();
            while (rs.next ()) {
                compradors.add ( new Comprador ( rs.getInt ( 1 ) , rs.getString ( "nome" ) , rs.getString ( "cpf" ) ) );
            }

            ConexaoFactory.close ( conn , stm , rs );
            return compradors;
        } catch (SQLException e) {
            e.printStackTrace ();
        }
        return null;

    }

    public static void posicionaCursor() {
        String sql = "SELECT idcomprador,nome, cpf FROM agencia.comprador;";
        Connection conn = ConexaoFactory.getConexao ();
        try {
            Statement stm = conn.createStatement ( ResultSet.TYPE_SCROLL_INSENSITIVE , ResultSet.CONCUR_READ_ONLY );
            ResultSet rs = stm.executeQuery ( sql );
            if (rs.last ()) {//move para a ultima linha
                System.out.println ( "Ultima Linha: " + new Comprador ( rs.getInt ( 1 ) , rs.getString ( "nome" ) , rs.getString ( "cpf" ) ) );
                System.out.println ( "Numero Ultima Linha: " + rs.getRow () );
            }
            System.out.println ( "Foi para primeira linha? " + rs.first () );//move para primeira linha
            System.out.println ( "Primeira linha:" + rs.getRow () );//me retorna o numero da linha
            rs.absolute ( 2 );//vai para a linha que eu desejo
            System.out.println ( new Comprador ( rs.getInt ( 1 ) , rs.getString ( "nome" ) , rs.getString ( "cpf" ) ) );
            rs.afterLast ();
            System.out.println ( "==========================" );
            while (rs.previous ()) {//movi para a ultima linha e estou imprimindo pela ordem inversa
                System.out.println ( new Comprador ( rs.getInt ( 1 ) , rs.getString ( "nome" ) , rs.getString ( "cpf" ) ) );
            }

            ConexaoFactory.close ( conn , stm , rs );

        } catch (SQLException e) {
            e.printStackTrace ();
        }


    }

    public static void atualizandoNomesParaMinisculo() {
        String sql = "SELECT idcomprador, nome, cpf FROM agencia.comprador";
        Connection cnn = ConexaoFactory.getConexao ();
        try {
            Statement stm = cnn.createStatement ( ResultSet.TYPE_SCROLL_INSENSITIVE , ResultSet.CONCUR_UPDATABLE );
            ResultSet rs = stm.executeQuery ( sql );
            while (rs.next ()) {
                rs.updateString ( "nome" , rs.getString ( "nome" ).toLowerCase () );//vou atualizar no resultset
                rs.updateRow ();//aqui vou atualizar no banco
            }
            rs.beforeFirst ();
            while (rs.next ()) {
                System.out.println ( rs.getString ( "nome" ) );
            }
            System.out.println ( "=====================" );
            //inserindo dados no banco com resultSet
            rs.absolute ( 3 );
            rs.moveToInsertRow ();
            rs.updateString ( "nome" , "Renan".toUpperCase () );
            rs.updateString ( "cpf" , "999.999.999-99" );
            rs.insertRow ();


        } catch (SQLException e) {
            e.printStackTrace ();
        }

    }

    public static void updateComPreparedStatement(Comprador comprador) {
        if (comprador == null || comprador.getId () == null) {
            System.out.println ( "Por favor, informe os dados do comprador!" );
        }
        String sql = "UPDATE `agencia`.`comprador` SET `cpf` = ?, `nome` = ? WHERE (`idcomprador` = ?);";
        Connection conn = ConexaoFactory.getConexao ();
        try {
            PreparedStatement ps = conn.prepareStatement ( sql );
            ps.setString ( 1 , comprador.getCpf () );
            ps.setString ( 2 , comprador.getNome () );//lembrar de nao setar o id
            ps.setInt ( 3 , comprador.getId () );
            ps.executeUpdate ();
            ConexaoFactory.close ( conn , ps );
            System.out.println ( "Registros atualizados com sucesso!" );
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }

    public static void inserindoTeste() {
        String sql = "INSERT INTO  comprador(nome, cpf) VALUES (?,?)";
        Connection conn = ConexaoFactory.getConexao ();
        try {
            PreparedStatement ps = conn.prepareStatement ( sql );
            ps.setString ( 1 , "Araos" );
            ps.setString ( 2 , "125.789.456-78" );
            ps.executeUpdate ();
            ConexaoFactory.close ( conn , ps );

        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }

    public static List < Comprador > searchByNameRowSet(String nome) {//buscar
        String sql = "SELECT idcomprador,nome, cpf FROM agencia.comprador WHERE nome LIKE ?";
        JdbcRowSet jrs = ConexaoFactory.getRowSet ();
        List < Comprador > compradors = new ArrayList <> ();
        try {
            jrs.setCommand ( sql );
            jrs.setString ( 1 , "%" + nome + "%" );
            jrs.execute ();
            while (jrs.next ()) {
                compradors.add ( new Comprador ( jrs.getInt ( 1 ) , jrs.getString ( "nome" ) , jrs.getString ( "cpf" ) ) );
            }

            ConexaoFactory.close ( jrs );
            return compradors;
        } catch (SQLException e) {
            e.printStackTrace ();
        }
        return null;

    }

    public static void updateRowSet(Comprador comprador) {//Atualizando dados no MYSQL
        if (comprador == null || comprador.getId () == null) {
            System.out.println ( "Nao foi possivel atualizar o resgistro!" );
            return;
        }
        String sql = "SELECT * FROM agencia.comprador where idcomprador in(?)";
        JdbcRowSet jrs = ConexaoFactory.getRowSet ();
        try {
            jrs.setCommand ( sql );
            jrs.setInt ( 1 , comprador.getId () );
            jrs.execute ();
            jrs.next ();
            jrs.updateString ( "nome" , comprador.getNome () );
            jrs.updateRow ();
            ConexaoFactory.close ( jrs );
            System.out.println ( "Resgistro atualizado com sucesso!" );
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }

}


