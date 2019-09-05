package br.com.abc.javacore.Wio.teste;

import java.io.*;

public class Streamstest {

    /*stream eh um fluxo de bits(dados), uma msc ou video eh um fluxo de dados que esta sendo
    *reproduzido, atravez deste fluxo,
    * InputStream eh uma classe para trabalhar com leitura de dados, imagine que vc tenha um arquivo na memoria
    * para usar dados deste arquivo a InputStream abre uma conexao, porem a cada bit e aberta uma conexao quando este bit
    * eh retornado essa conexao e fechada, isso eh ruim pq em um arquivo temos varios bits a serem pegos
    *
    * a classe BufferedInputStream cria uma conexao unica e pega todos bits requeridos e so apos isso fecha esta conexao
    * economizando processamento e ganhando tempo
    * ver na internet classes e subclasses de inputstream e outputstream  *
    *
    * */
    public static void main(String[] args) {
        gravador();
        leitor();
    }


    private static void gravador(){

        byte[] dados = {65, 66, 67, 68, 69, 70};

        try(FileOutputStream gravador = new FileOutputStream("pasta/stream.txt")){
            for(byte b:dados){
                gravador.write(b);
            }
            System.out.println("dados gravados com sucesso");

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    // melhor que gravador() questao desempenho
    private static void gravadorTunado(){ // como todos os bytes requeridos sao pegos de uma vez, "chamamos este atalho de tunel"

        byte[] dados = {65, 66, 67, 68, 69, 70};

        try(BufferedOutputStream gravadorBuffer =  new BufferedOutputStream(new FileOutputStream("pasta/stream.txt"))){
            for(byte b:dados){
                gravadorBuffer.write(b);
                gravadorBuffer.flush(); //como abrimos um stream (fluxo de dados) com o flush ele forca tudo que esta streamizado a sair
            }
            System.out.println("dados gravados com sucesso");

        }catch (IOException e){
            e.printStackTrace();
        }
    }


    private static void leitor(){
        try(FileInputStream leitor = new FileInputStream("pasta/stream.txt")){
            int leitura;
          while ((leitura = leitor.read()) != -1){
                byte b = (byte) leitura;
              System.out.println(" "+b);
          }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    // melhor que o metodo leitor() questao desempenho
    private static void leitorTunado(){
        try(BufferedInputStream leitorBuffer = new BufferedInputStream (new FileInputStream("pasta/stream.txt"))){
            int leitura;
            while ((leitura = leitorBuffer.read()) != -1){
                byte b = (byte) leitura;
                System.out.println(" "+b);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}









