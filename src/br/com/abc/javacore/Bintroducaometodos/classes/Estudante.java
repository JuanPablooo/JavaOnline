package br.com.abc.javacore.Bintroducaometodos.classes;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;


    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade (int idade){
        if (idade < 0){
            System.out.println("voce não pode fazer isso");
        }
        else {
            this.idade = idade;
        }
    }
    public void setNotas (double[] x){
        this.notas = x;
    }
    public void mostraatributos(){
        System.out.println("nome: "+this.nome);
        System.out.println("idade: " +this.idade);
        double media=0;
        for (double nota:this.notas){
            media +=nota;
        } media= media/this.notas.length;
        System.out.print("o aluno "+this.nome+" obteve "+media+ " de media portanto o aluno foi ");
        if (media>=6){
            aprovado = true;
            System.out.println("APROVADO");
        }else{
            System.out.println("REPROVADO");
        }
    }
    public int getIdade(){
        return this.idade;
    }
    public double[] getNotas(){
        return this.notas;
    }
    public String getNome(){
        return this.nome;
    }

    public boolean isAprovado(){
        return this.aprovado;
    }
}
