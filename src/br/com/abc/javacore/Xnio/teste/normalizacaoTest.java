package br.com.abc.javacore.Xnio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class normalizacaoTest {
    public static void main(String[] args) {
        String diretorioProjeto = "JavaOnline/home/juan/dev"; // caminho do diretorio criado
        String arquivoTxt = "../../arquivo.txt";     // voltando duas pastas e pegando o arquivo
        Path p1 = Paths.get(diretorioProjeto, arquivoTxt); //
        System.out.println(p1);
        System.out.println(p1.normalize());// normalize tira os ../../ e mostra o caminho mais "limpo"
        // na navegacao de pastas ./ eh quase a mesma coisa de digitar /
        // criando um caminho com o ./
        Path p2 = Paths.get("JavaOnline./juan./dev"); // da certo mas ./ eh desnecessario
        System.out.println(p2); // exibe com o ./
        System.out.println(p1.normalize()); // exibe com o / (mais legivel)

    }
}
