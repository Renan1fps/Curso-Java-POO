package br.com.abc.Java.conexaoJDBC.cnn;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class ConexaoFactory {
    public static Connection getConexao() {
        String url = "jdbc:mysql://localhost/agencia?allowPublicKeyRetrieval=true&useSSL=false&useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "20030927";
        try {
            Connection connection = DriverManager.getConnection ( url , user , password );
            return connection;
        } catch (SQLException e) {
            e.printStackTrace ();
        }
        return null;
    }

    public static JdbcRowSet getRowSet() {
        String url = "jdbc:mysql://localhost/agencia?allowPublicKeyRetrieval=true&useSSL=false&useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "20030927";
        try {
            JdbcRowSet jdbcRowSet = RowSetProvider.newFactory ().createJdbcRowSet ();
            jdbcRowSet.setUrl ( url );
            jdbcRowSet.setUsername ( user );
            jdbcRowSet.setPassword ( password );
            return jdbcRowSet;
        } catch (SQLException e) {
            e.printStackTrace ();
        }
        return null;
    }

    public static void close(JdbcRowSet jrs) {
        try {
            if (jrs != null)
                jrs.close ();
        } catch (SQLException e) {
            e.printStackTrace ();
        }

    }

    public static void close(Connection connection) {
        try {
            if (connection != null)
                connection.close ();

        } catch (SQLException e) {
            e.printStackTrace ();
        }

    }

    public static void close(Connection connection , Statement stm) {
        close ( connection );
        try {
            if (stm != null)
                stm.close ();

        } catch (SQLException e) {
            e.printStackTrace ();
        }


    }

    public static void close(Connection connection , Statement stm , ResultSet rs) {
        close ( connection , stm );
        try {
            if (rs != null)
                rs.close ();

        } catch (SQLException e) {
            e.printStackTrace ();
        }


    }
}
