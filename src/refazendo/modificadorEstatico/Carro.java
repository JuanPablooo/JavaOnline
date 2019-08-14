package refazendo.modificadorEstatico;

public class Carro {
    private String nome;
    private double velocidadeMaxima;

    // atributo estatico faz  parte da classe e nao do objeto, ou seja, se mudaddo durante a execucao
    // a mudanca sera atribuida para todo o programa
    // ou seja se objetos estiverem usando um atributo estatico, essa mudanca sera aplicada tambem para estes objetos
    private static double velocidadeLimite = 240;

    public Carro() {
    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void ImprimeCarro(){
        System.out.println("=-=-=-=-=-=-=-=");
        System.out.println("nome:" + this.nome);
        System.out.println("velocidade limite:" + this.velocidadeMaxima);
        System.out.println("velocidade maxima permitida:" + velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
}
