package br.com.abc.javacore.Wio.teste;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class BufferedTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");


        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(file));
            BufferedReader bf = new BufferedReader(new FileReader(file));
            bw.write("esvrevanendo qualquer coisa aqui para testar");
            bw.newLine();
            bw.write("kgshfgsj sflldsf");
            bw.flush();
            String in = null;
            while ((in = bf.readLine()) != null){
                System.out.println(in);

            }

            bf.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
