package br.com.abc.javacore.Dsobrecargaconstrutores.classes;

public class Estudantes {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;
    public Estudantes(String nome,String matricula,double[] notas){
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }
    public Estudantes(String nome,String matricula,double[] notas,String dataMatricula){
        this(nome, matricula, notas);
        this.dataMatricula = dataMatricula;
    }
    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.matricula);
        for(double nota:this.notas){
            System.out.println(nota);
        }
        System.out.println(this.dataMatricula);
    }
    public Estudantes(){

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public void setDataMatricula(String dataMatricula){
        this.dataMatricula = matricula;
    }
    public String getDataMatricula(){
        return matricula;
    }
}
