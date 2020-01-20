package br.com.abc.javacore.ZZCjdbc.test;

import br.com.abc.javacore.ZZCjdbc.classes.Comprador;
import br.com.abc.javacore.ZZCjdbc.conn.ConexaoFactory;
import br.com.abc.javacore.ZZCjdbc.db.CompradorDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TesteConexao {
    public static void main(String[] args) {
        //deletar();
        //atualizar();
        List <Comprador> listaCompradores = selecionarPeloNome("ua");
        System.out.println("------------");
        System.out.println(listaCompradores);
    }
    public static void inserir (){
        Comprador comprador = new Comprador("166.197.164.32", "Juan Pablo");
        CompradorDB.save(comprador);
    }
    public static void deletar (){
        Comprador comprador = new Comprador();
        comprador.setId(1);
        CompradorDB.delete(comprador);
    }
    public static void atualizar (){
        Comprador comprador = new Comprador(2,"155.197.426-69", "Juan Pablo");
        CompradorDB.update(comprador);
    }
    public static List <Comprador> selecionarTudo (){
        return CompradorDB.selectAll();
    }
    public static List <Comprador> selecionarPeloNome (String nome){
        return CompradorDB.searchByName(nome);
    }
}
