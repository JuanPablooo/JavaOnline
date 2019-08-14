package br.com.abc.javacore.Lclassesabstratas.classes;

public abstract class Funcionario extends Pessoa{

    protected String clt;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", clt='" + clt + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void imprime() {
        System.out.println(" como sobreescrevi o metodo, nao sera obrigatorio a sobreescrita nas classes filhas");
    }

    public abstract void calculaSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
