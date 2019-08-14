package br.com.abc.javacore.Gassociacao.classes;

public class Aluno {
    private Seminario seminario;
    private String nome;
    private int idade;
    public Aluno(String name,int age){
        this.nome=name;
        this.idade=age;
        //this.seminario=seminarioss;
    }
    public Aluno(){
    }
    public void imprimeAluno(){
        System.out.println("nome: "+this.nome);
        System.out.println("idade: "+this.idade);
        if (this.seminario!= null) {
            System.out.println("seminario titulo: " + this.seminario.getTitulo());
        }else {
            System.out.println("nao temos um titulo");
        } System.out.println("-=-=-=-=-==-=-=-=-=-=-=-=-=-");
    }
    public void setSeminario(Seminario seminario1){
        this.seminario=seminario1;
    }
    public Seminario getSeminario(){
        return this.seminario;
    }
    public void setNome(String nome1){
        this.nome=nome1;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(int idade1){
        this.idade=idade1;
    }
    public int getIdade(){
        return this.idade;
    }
}
