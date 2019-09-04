package br.com.abc.javacore.Xnio.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AtributosBasicosTest {
    public static void main(String[] args) throws IOException {
        Date primeiroDeDezembro = new GregorianCalendar(2015, Calendar.DECEMBER, 1).getTime();
        File file = new File("folder2/arquivo_renomeado.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        file.setLastModified(primeiroDeDezembro.getTime());
        System.out.println(file.lastModified());
        file.delete();
        Path path = Paths.get("folder2/arquivo_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.fromMillis(primeiroDeDezembro.getTime());
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.getLastModifiedTime(path));
        Files.deleteIfExists(path);
        path = Paths.get("src/br/com/abc/javacore/Aintroducaoclasses/classes/Carro.java");
        System.out.println(Files.isReadable(path)); // vendo as permissoes, pode ler
        System.out.println(Files.isWritable(path));  // pode escrever
        System.out.println(Files.isExecutable(path)); // pode executar
        //BasicFileAttributes interface para todos sistemas operacionais
        //DosFileAttributes interface para sistemas windows
        //PosixFileAttributes interface para sistemas linux e unix
        BasicFileAttributes attributesBasics = Files.readAttributes(path, BasicFileAttributes.class);
        // os atributos basicos tem permissao apenas para ler
        System.out.println("hora de criacao "+attributesBasics.creationTime());
        System.out.println("ultimo acesso "+attributesBasics.lastAccessTime());
        System.out.println("ultima modificacao "+attributesBasics.lastModifiedTime());
        System.out.println("eh diretorio "+attributesBasics.isDirectory());
        System.out.println(attributesBasics.isSymbolicLink());
        System.out.println(attributesBasics.isRegularFile());



        FileTime lastModified = attributesBasics.lastModifiedTime();
        FileTime created = attributesBasics.creationTime();
        FileTime lastAcess = FileTime.fromMillis(System.currentTimeMillis());
        BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        basicView.setTimes(lastModified, lastAcess, created);
        attributesBasics = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("=-=-=-=-=-=-");
        System.out.println("hora de criacao "+attributesBasics.creationTime());
        System.out.println("ultimo acesso "+attributesBasics.lastAccessTime());
        System.out.println("ultima modificacao "+attributesBasics.lastModifiedTime());

    }
}
