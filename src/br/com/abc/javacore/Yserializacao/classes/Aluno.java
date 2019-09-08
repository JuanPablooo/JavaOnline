package br.com.abc.javacore.Yserializacao.classes;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno implements Serializable {
    private Long id;
    private String nome;

    // o transiente faz com que o atributo nao seja serializado, sendo assim nao a senha nao sera salva no objeto serializado
    private  transient String password;

    private Turma turma;
    /*
    como aluno tem uma referencia para a classe Turma, a classe precisa implementar a interface serializable
    ou receber um transient para ser ignorada no momento em que o objeto aluno for serialado
    ou podemos criar dois metodos
    writeObject

     */

    // atributos estaticos nao sao serializados, por que nao faz parte do objeto e sim da classe
    private static String nomeEscola = "DevDojo";

    public Aluno(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;

    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", turma='" + turma+ '\'' +
                '}';
    }
    // metodo do java
    private void writeObject(ObjectOutputStream oos){
        try{
            oos.defaultWriteObject();
            // pedindo para serializar os atributos da turma setada no objeto aluno que for serializado
            oos.writeUTF(turma.getNome());
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    private void readObject(ObjectInputStream ois){
        try {
            ois.defaultReadObject();
            // pegando o atributo turma serializado
            Turma t = new Turma(ois.readUTF());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   public static String getNomeEscola(){
        return Aluno.nomeEscola;
   }
   public static void setNomeEscola(String nomeEscola){
        Aluno.nomeEscola = nomeEscola;
   }
}
