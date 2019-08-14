package br.com.abc.javacore.Lclassesabstratas.classes;

public abstract class Pessoa {
    protected String nome;

    // esse metodo devera ser sobreescrito nas classes nao abstratas, mas se a alguma classe abstrata herdar essa classe
    // e sobreescrever como um metodo nao abstrato, nao sera necessario sobreescrever nas classes nao abstratas
    public abstract void imprime();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
