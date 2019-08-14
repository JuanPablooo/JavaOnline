package br.com.abc.javacore.Oexception.checkedexception.teste;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
//        try {
//            criarArquivo();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        abrindoArquivo();

    }

    public static void criarArquivo() throws IOException{
        File file = new File("text.txt");
        try{
            System.out.println("arquivo criado? " + file.createNewFile());
            System.out.println("arquivo criado");
        }catch(IOException e){
            System.out.println("fudeu");
            e.printStackTrace();
            throw e;
        }

    }
    public static String abrindoArquivo(){
        try {
            System.out.println("abrindo arquivo");
            return null;

        }catch (Exception e){
            System.out.println("fudeu");
        }

        // o finally sempre sera executado, mesmo que o codigo tenha um return
        finally {
            System.out.println("fechando o arquivo");
        }
        System.out.println("lindaas");
        return null;
    }
}
