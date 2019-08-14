package br.com.abc.javacore.Wio.teste;

import java.io.Console;

public class ConsoleTest {
    public static void main(String[] args) {
        // nao eh possivel executar este arquivo pela IDE
        Console c = System.console();
        char[] ch = c.readPassword( );
        for(char letra:ch){
            c.format("%c", letra);
        }
        c.format("\n");
    }
}
