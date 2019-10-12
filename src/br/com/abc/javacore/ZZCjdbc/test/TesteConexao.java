package br.com.abc.javacore.ZZCjdbc.test;

import br.com.abc.javacore.ZZCjdbc.conn.ConexaoFactory;

public class TesteConexao {
    public static void main(String[] args) {
        ConexaoFactory conect = new ConexaoFactory();
        conect.getConexao();


    }
}
