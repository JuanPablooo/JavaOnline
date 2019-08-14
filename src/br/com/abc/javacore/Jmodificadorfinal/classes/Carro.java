package br.com.abc.javacore.Jmodificadorfinal.classes;

// se eu colocar final em uma classe ela nao podera ser extendida(herdada), a classe String eh final
// fizeram isso para ninguem herdar pois ela ja esta "perfeita"
public class Carro {
    // final siguinifica uma constante ou seja, nao sera modificado durante a execucao
    public static final double VELOCIDADE_FINAL = 210;
    private String nome;
    private String marca;
    private final Comprador COMPRADOR = new Comprador();

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }


    public Comprador getComprador() {
        return COMPRADOR;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
