package br.com.abc.Java.conexaoJDBC.db;

import br.com.abc.Java.conexaoJDBC.classes.Comprador;
import br.com.abc.Java.conexaoJDBC.cnn.ConexaoFactory;
import br.com.abc.Java.conexaoJDBC.interfaces.CompradorDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompradorDAOimpl implements CompradorDAO {
    @Override
    public  void save(Comprador comprador) {//inserindo dados no MYSQL realidade
        String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES (?, ?);";
        try (Connection conn = ConexaoFactory.getConexao ();
             PreparedStatement ps = conn.prepareStatement ( sql );) {
            ps.setString ( 1 , comprador.getCpf () );
            ps.setString ( 2 , comprador.getNome () );
            ps.executeUpdate ();
            System.out.println ( "Resgistro inserido com sucesso!" );
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }
    @Override
    public  void deletando(Comprador comprador) {//Excluindo dados no MYSQL
        if (comprador == null || comprador.getId () == null) {
            System.out.println ( "Nao foi possivel excluir o resgistro!" );
            return;
        }
        String sql = "DELETE FROM `agencia`.`comprador` WHERE (`idcomprador` = ?)";
        try (Connection conn = ConexaoFactory.getConexao ();
             PreparedStatement ps = conn.prepareStatement ( sql );) {
            ps.setInt ( 1 , comprador.getId () );
            ps.executeUpdate ();
            System.out.println ( "Resgistro excluido com sucesso!" );
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }
    @Override
    public  void update(Comprador comprador) {//Atualizando dados no MYSQL
        if (comprador == null || comprador.getId () == null) {
            System.out.println ( "Nao foi possivel atualizar o resgistro!" );
            return;
        }
        String sql = "UPDATE `agencia`.`comprador` SET `cpf` = ?, `nome` = ? WHERE `idcomprador` = ?";
        try (Connection conn = ConexaoFactory.getConexao ();
             PreparedStatement ps = conn.prepareStatement ( sql );) {
            ps.setString ( 1 , comprador.getCpf () );
            ps.setString ( 2 , comprador.getNome () );
            ps.setInt ( 3 , comprador.getId () );
            ps.executeUpdate ();
            System.out.println ( "Resgistro atualizado com sucesso!" );
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }
    @Override
    public  List < Comprador > selectAll() {//buscar
        String sql = "SELECT idcomprador,nome, cpf FROM agencia.comprador;";
        List < Comprador > compradors = new ArrayList <> ();
        try (Connection conn = ConexaoFactory.getConexao ();
             PreparedStatement ps = conn.prepareStatement ( sql );
             ResultSet rs = ps.executeQuery ();) {
            while (rs.next ()) {
                compradors.add ( new Comprador ( rs.getInt ( 1 ) , rs.getString ( "nome" ) , rs.getString ( "cpf" ) ) );
            }
            return compradors;
        } catch (SQLException e) {
            e.printStackTrace ();
        }
        return null;

    }
    @Override
    public  List < Comprador > searchByNAme(String nome) {//buscar
        String sql = "SELECT idcomprador,nome, cpf FROM agencia.comprador WHERE nome LIKE ?";
        List < Comprador > compradors = new ArrayList <> ();
        try (Connection conn = ConexaoFactory.getConexao ();
             PreparedStatement ps = conn.prepareStatement ( sql );) {
            ps.setString ( 1 , "%" + nome + "%" );
            ResultSet rs = ps.executeQuery ();

            while (rs.next ()) {
                compradors.add ( new Comprador ( rs.getInt ( "idcomprador" ) , rs.getString ( "nome" ) , rs.getString ( "cpf" ) ) );
            }
            ConexaoFactory.close ( conn , ps , rs );
            return compradors;
        } catch (SQLException e) {
            e.printStackTrace ();
        }
        return null;

    }
}
