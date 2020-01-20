package br.com.abc.javacore.ZZCjdbc.conn;

import java.sql.*;

public class ConexaoFactory {
    //java.sql = Connection, Stantment, ResultSet
    //DriveManager
    public static Connection getConexao(){
        String url = "jdbc:mysql://localhost:3306/agencia";
        String user = "root";
        String password = "";
        try {
            return DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void close (Connection connection){
        try {
            if(connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void close(Connection connection, Statement statement){
        close(connection);
        try {
            if(statement != null)
                statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void close(Connection connection, Statement statement, ResultSet rs){
        close(connection, statement);
        try {
            if(rs != null)
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
