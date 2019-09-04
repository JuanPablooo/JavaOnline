package br.com.abc.javacore.Xnio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvendoPaths {
    public static void main(String[] args) {
        Path dir = Paths.get("home/juan/");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path result = dir.resolve(arquivo); // o resolve basicamente adiciona um
        // caminho ou um arquivo em outro caminho, deve ser chamado pelo caminho que vai ser adicionado
        // e deve receber o caminho a ser adicionado ao final do chamador nesse caso do dir
        System.out.println(result); // imprime home/juan/dev/arquivo.txt

        Path absoluto = Paths.get("/home/juan");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");
        System.out.println("1 "+absoluto.resolve(relativo));
        System.out.println("2 "+absoluto.resolve(file));
        System.out.println("3 "+relativo.resolve(file));
        System.out.println("4 "+relativo.resolve(absoluto));
        System.out.println("5 "+file.resolve(absoluto));
        System.out.println("6 "+file.resolve(relativo));



    }
}
