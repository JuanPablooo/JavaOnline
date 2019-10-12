package br.com.abc.javacore.ZZCjdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
    //java.sql = Connection, Stantment, ResultSet
    //DriveManager
    public Connection getConexao(){
        String url = "jdbc:mysql://localhost:3306/agencia";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println(connection);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
