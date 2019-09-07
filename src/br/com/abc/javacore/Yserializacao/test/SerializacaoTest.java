package br.com.abc.javacore.Yserializacao.test;

import br.com.abc.javacore.Yserializacao.classes.Aluno;

import java.io.*;

public class SerializacaoTest {

    public static void main(String[] args) {
        gravadorObjeto();

    }
    private static void gravadorObjeto(){
        Aluno aluno = new Aluno(1L, "juan", "8867");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"))) {
            oos.writeObject(aluno);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void leitoObjeto(){
       try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.ser"))) {
            Aluno aluno = (Aluno)ois.readObject();


        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
