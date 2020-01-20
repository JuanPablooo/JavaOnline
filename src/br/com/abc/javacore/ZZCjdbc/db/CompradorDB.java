package br.com.abc.javacore.ZZCjdbc.db;

import br.com.abc.javacore.ZZCjdbc.classes.Comprador;
import br.com.abc.javacore.ZZCjdbc.conn.ConexaoFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CompradorDB {
    public static void save (Comprador comprador){
        String sql = "INSERT INTO agencia.comprador" +
                " (cpf, nome)" +
                " VALUES ('"+ comprador.getNome() +"'," +
                " '"+comprador.getCpf() +"')";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement smt = conn.createStatement();
            System.out.println(smt.executeUpdate(sql));
            ConexaoFactory.close(conn, smt);
            System.out.println("registro inserido com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void delete (Comprador comprador){
        if(comprador == null || comprador.getId() == null){
            System.out.println("nao foi possivel excluir o registro");
            return;
        }
        String sql = String.format(" DELETE FROM agencia.comprador WHERE id ='%d'", comprador.getId());
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement smt = conn.createStatement();
            System.out.println(smt.executeUpdate(sql));
            ConexaoFactory.close(conn, smt);
            System.out.println("registro excluido com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void update (Comprador comprador){
        if(comprador == null || comprador.getId() == null){
            System.out.println("nao foi possivel atualizar o registro");
            return;
        }
        String sql = String.format(" UPDATE agencia.comprador " +
                "SET cpf= '%s', nome = '%s'" +
                "WHERE id ='%d'",
                comprador.getCpf(), comprador.getNome(), comprador.getId());
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement smt = conn.createStatement();
            System.out.println(smt.executeUpdate(sql));
            ConexaoFactory.close(conn, smt);
            System.out.println("registro atualizado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static List<Comprador> selectAll(){
        String sql = "SELECT * FROM agencia.comprador";

        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            List <Comprador> compradorList = new ArrayList<>();
            while (rs.next()){
                compradorList.add(
                        new Comprador(rs.getInt("id"),rs.getString("cpf"),rs.getString("nome"))
                );
            }
            rs.close();  // fechando a result set
            ConexaoFactory.close(conn, smt);
            System.out.println("registros selecionados com sucesso");
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static List<Comprador> searchByName(String nome){
        String sql = "SELECT * FROM agencia.comprador where nome like '%"+nome+"%'";

        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            List <Comprador> compradorList = new ArrayList<>();
            while (rs.next()){
                compradorList.add(
                        new Comprador(rs.getInt("id"),rs.getString("cpf"),rs.getString("nome"))
                );
            }
            rs.close();  // fechando a result set
            ConexaoFactory.close(conn, smt);
            System.out.println("registros selecionados com sucesso");
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
