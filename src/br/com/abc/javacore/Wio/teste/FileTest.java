package br.com.abc.javacore.Wio.teste;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            System.out.println(file.createNewFile());
            System.out.println("existe ? "+file.exists());
            System.out.println("path "+file.getAbsolutePath());
            System.out.println("pode ler ? "+file.canRead());
            System.out.println("pode escrever ? "+file.canWrite());
            System.out.println("eh um diretorio ? "+ file.isDirectory());
            System.out.println("esta oculto "+file.isHidden());
            System.out.println("ultima vez modificado "+new Date(file.lastModified()));
            System.out.println(" deletado ? "+file.delete());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
