package br.com.abc.javacore.Fmodificadorestatico.classes;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    // o static permite mudar o objeto da classe toda para todos os outros objetos nesse caso para todos carros
    private static double velocidadeLimite=240;

    public Carro (String nome, double velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
        this.nome = nome;
    }
    public Carro(){
    }
    public void imprime(){
        System.out.println("------------");
        System.out.println("nome: "+this.nome);
        System.out.println("velocidade maxima: "+this.velocidadeMaxima);
        System.out.println("velocidade limite: "+velocidadeLimite);
    }
    public void setNome(String nome){
       this.nome= nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;

    }
    public double getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }
    public static void setVelocidadeLimite(double velocidade){
        Carro.velocidadeLimite=velocidade;
    }
    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

}
