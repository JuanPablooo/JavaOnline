package faculdade.aula2.classes;

public class Administra extends Funcionariooo {
    private String nome;
    private double salario;

    public Administra() {
    }

    public Administra(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void contribuicao(){
        System.out.println("fali a faculdade");
    }

    public void recebeEmTroca(){
        System.out.println("salario e bronca");
    }

    public double bonificaçaoo(){
        return this.salario+=getSalario()*0.1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
