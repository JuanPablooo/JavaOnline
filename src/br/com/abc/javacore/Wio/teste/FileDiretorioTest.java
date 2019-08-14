package br.com.abc.javacore.Wio.teste;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {
    public static void main(String[] agrs){
//        File diretorio = new File("folder");
//        boolean mkdir = diretorio.mkdir();
//        System.out.println("diretorio criado? "+mkdir);
//        File arquivo = new File(diretorio,"aqruivo.txt");
//        File file = new File(diretorio,"arquivo_renomeado.txt");
//
//        try {
//
//            boolean criado = arquivo.createNewFile();
//            System.out.println("arquivo criado? "+criado);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        // o metodo eh acionado a partir de um objeto tipo file (arquivo1), e recebe um outro objeto tipo file (arquivo2)
//        // e faz com que o arquivo1 receba o nome e o diretorio do arquivo2.
//        boolean renamed = arquivo.renameTo(file);
//        System.out.println("arquivo renomeado? " + renamed);
//        File newFolder = new File("folder2");
//
//        System.out.println("renomeado? " + diretorio.renameTo(newFolder));

        buscaArquivos();

    }
    public static void buscaArquivos(){
        // criando um objeto file e jogando a pasta andre nele
        File fil = new File("C:\\Users\\juanp\\Downloads\\andre");
        // o metodo list devolve um array com os nomes dos arquivos dentro do objeto chamador, neste caso os arquivos na
        // pasta andre
        String[] arquivos = fil.list();
        for(String arq: arquivos){
            System.out.println(arq);
        }
    }
}
