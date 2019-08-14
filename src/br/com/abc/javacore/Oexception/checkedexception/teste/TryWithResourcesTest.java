package br.com.abc.javacore.Oexception.checkedexception.teste;


import br.com.abc.javacore.Oexception.checkedexception.classes.Leitor1;
import br.com.abc.javacore.Oexception.checkedexception.classes.Leitor2;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {

        lerArquivo();
    }

    /*problema, para trabalhar com arquivos externos, precisamos de uma "conexao" com este arquivo
    * mas precisamos fechar essa conexao(para nao extourar memoria do SO, banco de dados etc)
    * logo precisamos tratar erros e fechar o arquivo, mas e se durante a criacao ou leitura do arquivo for lancada uma
    * excecao? bom nesse caso nao teria como fechar, por isso fizeram o Try Resources, que executa a leitura(ou outra coisa)
    * e tambem fehca o arquivo se ele existir*/

    public static void lerArquivo(){

        // modo atualizado, a jvm fecha os arquivos de baixo para cima
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    // modo utilizado ate o java 6
    public static void lerArquivoOld(){
        Reader reader = null;
        try{
            reader = new BufferedReader(new FileReader("textt.txt"));
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        finally {
            try{
                if (reader!= null){
                    reader.close();
                }

            }catch(IOException e){
                e.printStackTrace();
            }

        }

    }
}
