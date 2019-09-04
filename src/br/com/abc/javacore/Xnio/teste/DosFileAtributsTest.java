package br.com.abc.javacore.Xnio.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAtributsTest {
    public static void main(String[] args) {
        Path path = Paths.get("folder2/text.txt");
        try {
            //Files.createFile(path);
            Files.setAttribute(path, "dos:hidden", true); // setando atributo de arquivo oculto
            Files.setAttribute(path, "dos:readonly", true);
            // usando a interface DosFile
            DosFileAttributes dos = Files.readAttributes(path, DosFileAttributes.class);
            System.out.println(dos.isHidden());
            System.out.println(dos.isReadOnly());
            // usando interface DosView
            DosFileAttributeView dosView = Files.getFileAttributeView(path, DosFileAttributeView.class);
            // comando bem menor do que na linha 14
            dosView.setHidden(false);
            dosView.setReadOnly(false);
            dos = Files.readAttributes(path, DosFileAttributes.class);
            System.out.println(dos.isHidden());
            System.out.println(dos.isReadOnly());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
