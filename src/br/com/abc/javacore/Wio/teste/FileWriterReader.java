package br.com.abc.javacore.Wio.teste;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;

public class FileWriterReader {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            // se eu passar true como segundo parametro pelo construtor ele vai adicionar
            // as mensagens ao final das mensagens existentes no arquivo
            FileWriter fw  = new FileWriter(file);

            FileReader fr = new FileReader(file);
            String texto = "escrevendo mensagem \nE pulando de linha ";
            fw.write(texto);
            fw.flush();



            char[] in = new char[texto.length()];
            int size = fr.read(in);
            System.out.println("tamanho "+size);
            StringBuilder sb = new StringBuilder();

            for (int i = 0;i<size;i++){
                System.out.print(in[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
