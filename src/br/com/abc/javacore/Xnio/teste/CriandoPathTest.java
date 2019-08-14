package br.com.abc.javacore.Xnio.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CriandoPathTest {
    public static void main(String[] args) {
        //J:\projetos\JavaOnline
        Path p = Paths.get("J:\\projetos\\JavaOnline\\arquivo_renomeado.txt");
        Path p1 = Paths.get("J:\\projetos\\JavaOnline", "arquivo_renomeado.txt");
        Path p2 = Paths.get("J:", "\\projetos\\JavaOnline", "arquivo_renomeado.txt");
        Path p3 = Paths.get("J:", "projetos", "JavaOnline", "arquivo_renomeado.txt");
        // mostrando o caminho absoluto
        System.out.println(p3.toAbsolutePath());
        /* a classe file eh diferente da classe Path, ou seja nao sao do mesmo tipo, logo para
        jogar uma objeto File em uma instancia da classe File, tem que se usar o medoto toFile  */
        File file = p3.toFile();
        // o mesmo acontece com o objeto Path para receber um file temos que usar o metodo toPath
        Path fil = file.toPath();

        Path path1 = Paths.get("pasta");
        // colocando o caminho de pastas e subpastas
        Path path2 = Paths.get("pasta\\subpasta\\subsubpasta");
        Path arquivo = Paths.get("pasta\\subpasta\\subsubpasta\\arqui.txt");
        try {
            // verificando se ja existe
//            if(Files.notExists(path1)){
//                Files.createDirectory(path1);
//            }

//            if(Files.notExists(path2)){
//                // metodo usado para criar diretorios dentro de diretorios
//                Files.createDirectories(path2);
//            }
            // para criar um arquivo dentro de pastas precisamos usar o metodo getParent,
            // se nao se cria uma pasta com a extensao do arquivo
            if (Files.notExists(arquivo.getParent())) {
                // metodo usado para criar diretorios dentro de diretorios
                Files.createDirectories(arquivo.getParent());
            }
            if (Files.notExists(arquivo))
                Files.createFile(arquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }


        Path source = Paths.get("folder2\\aqruivo.txt");
        // path2 tem o caminho da pasta, acessando o metodo to string recebi o caminho dele, entao
        // adiciono o nome do arquivo
        Path target = Paths.get(path2.toString()+"\\arquivoCopiado.txt");
        try {
            // StandardCopyOption.REPLACE_EXISTING faz com que sobreescreva o arquivo que recebera a copia
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            Files.deleteIfExists(target);        // deleta se existe
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
