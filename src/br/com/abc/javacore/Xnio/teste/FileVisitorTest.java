package br.com.abc.javacore.Xnio.teste;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;


class AcharTodosOsBkps  extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if(file.getFileName().toString().endsWith(".bkp")){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class FileVisitorTest {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("pasta"), new AcharTodosOsBkps());

    }
}

class PrintDir extends SimpleFileVisitor<Path>{


    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        System.out.println("pre: "+dir);
        if (dir.getFileName().toString().equals("subsubpasta")){
            // se entrar na subsubpasta termina as buscas
            return FileVisitResult.TERMINATE;
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.println("file "+file.getFileName());
        return FileVisitResult.CONTINUE;
    }



    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc)throws IOException {

        return FileVisitResult.CONTINUE;
    }


    public FileVisitResult postVisitDirectory(Path dir, IOException exc)throws IOException {
        System.out.println("pos: "+dir);
        return FileVisitResult.CONTINUE;
    }







}
