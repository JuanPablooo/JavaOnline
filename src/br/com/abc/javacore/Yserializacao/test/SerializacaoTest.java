package br.com.abc.javacore.Yserializacao.test;

import br.com.abc.javacore.Yserializacao.classes.Aluno;
import br.com.abc.javacore.Yserializacao.classes.Turma;

import java.io.*;

public class SerializacaoTest {
    /*serializacao serve para salvar e ler objetos o problema eh que na leitura nao se roda o
    * construtor, sendo assim o super nao eh executado, podendo perder algo da heranca*/

    public static void main(String[] args) {
        gravadorObjeto();
        leitoObjeto();
    }
    private static void gravadorObjeto(){
        Turma turma = new Turma("desenvolvimento");
        Aluno aluno = new Aluno(1L, "juan", "8867");
        aluno.setTurma(turma);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"))) {
            oos.writeObject(aluno);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void leitoObjeto(){
       try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.ser"))) {
            Aluno aluno = (Aluno) ois.readObject();
           System.out.println(aluno);

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
