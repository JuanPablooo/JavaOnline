package br.com.abc.javacore.Xnio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizarTest {
    public static void main(String[] args) {
        /*
        * o metodo ralativize mostra como chegar de um diretorio a outro, ou seja se tiver uma
        * pasta/subpasta/subsubpasta/arquivo.js e uma pasta/segundasubpasta/ e chamarmos o metodo relativize
        * ele vai mostrar o caminho a ser feito pelo segundo diretorio ate chegar no primeiro
        *  ou seja vai ter que voltar uma pasta (../) e entrar na subpasta e assim por diante
        *
        * */
        Path dir = Paths.get("/home/juan");
        Path classe = Paths.get("/home/juan/java/Pessoa.java"); // a vontade eh saber como chegar em Pessoa.java
        // a partir do diretorio dir, para isso temos o metodo relativize
        Path pathParaClasse = dir.relativize(classe);
        System.out.println(pathParaClasse); // mostra java/Pessoa.java que eh o que falta no dir para chegar em Pessoa.java


        Path absolute1 = Paths.get("/home/juan");
        Path absolute2 = Paths.get("/user/local");
        Path absolute3 = Paths.get("/home/juan/java/Pessoa.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/Funcionario.java");

        System.out.println("1: "+absolute1.relativize(absolute3)); // java/Pessoa.java
        System.out.println("2: "+absolute3.relativize(absolute1)); // ../..
        System.out.println("3: "+absolute1.relativize(absolute2)); // ../../user/local
//        System.out.println("4: "+absolute1.relativize(relativo1)); // quando o java nao encontra ligacao entre os
//        dois ele da um erro de excessao
//        System.out.println("5: "+absolute1.relativize(relativo2));


    }
}
