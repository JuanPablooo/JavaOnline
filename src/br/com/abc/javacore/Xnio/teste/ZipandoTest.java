package br.com.abc.javacore.Xnio.teste;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipandoTest {

    public static void main(String[] args) {
        // pasta que vai receber o arquivo zipado
        Path dirZip = Paths.get("pasta/subpasta");
        // pasta onde tem o arquivo a ser zipado
        Path dirFiles = Paths.get("pasta/subpasta/subsubpasta");
        // adicionando o arquivo zip na pasta dirZip (o arquivo ainda esta vazio)
        Path zipFile = dirZip.resolve("arquivo.zip");

        /* a classe ZipOutputStream serve para trabalhar com arquivos zip, recebe um outputstream
        logo usaremos a classe FileOutputStream que recebe um file, temos um Path que eh o diretorio
        se usarmos o metodo tofile ele converte o Path para file
         */
        try(ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile.toFile()));
            DirectoryStream<Path> stream = Files.newDirectoryStream(dirFiles)){

            for( Path path: stream){
                System.out.println(path);
                // adicionando entradas
                ZipEntry  zipEntry = new ZipEntry(path.getFileName().toString());
                zip.putNextEntry(zipEntry); // preparando para adicionar entradas
                FileInputStream fileInputStream =   new FileInputStream(path.toFile());

                byte[] buff = new byte[2048]; // vai ser usado para receber bytes e escrever no zip
                int byteRead;
                //enquanto nao estiver algo a ser lido
                while ((byteRead = fileInputStream.read(buff))>0){
                    zip.write(buff,0,  byteRead);
                }
                //BufferedInputStream buffered = new BufferedInputStream(fileInputStream);

                //zip.write(buffered.read());
                zip.flush();
                zip.closeEntry();
                fileInputStream.close();

            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
