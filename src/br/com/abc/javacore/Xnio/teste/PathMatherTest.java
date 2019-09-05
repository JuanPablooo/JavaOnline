package br.com.abc.javacore.Xnio.teste;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


class FileAllTest extends SimpleFileVisitor<Path>{
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java, class}");
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(matcher.matches(file)){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}


public class PathMatherTest {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("pasta/subpasta/subsubpasta/file.bkp");
        Path path2 = Paths.get("file.bkp");
        Path path3 = Paths.get("juan");
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.bkp");
        System.out.println(matcher.matches(path1));
        System.out.println(matcher.matches(path2));
        System.out.println("=-=--=-=-");
        matches(path1, "glob:*.bkp");
        matches(path1, "glob:**/*.bkp");
        matches(path1, "glob:*");
        matches(path1, "glob:**");
        System.out.println("=-=--=-=-");
        matches(path1, "glob:*.???");
        matches(path1, "glob:**/*.???");
        matches(path1, "glob:**.???");
        System.out.println("=-=--=-=-");

        matches(path1, "glob:{juan*, pablo*}");
        matches(path1, "glob:{juan, pablo*}");
        matches(path1, "glob:{juan*, pablo}");

        Files.walkFileTree(Paths.get("./"), new FileAllTest());




    }

    private static void matches(Path path, String globo){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(globo);

        System.out.println(globo+" "+matcher.matches(path));
    }


}
