package faculdade.aula2.classes;

public class Professor extends Funcionariooo {
    private String nome;
    private double salario;

    public Professor() {
    }

    public Professor(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void contribuicao(){
        System.out.println("Da aula");
    }

    public void recebeEmTroca(){
        System.out.println("dinheiro e propina de aluno");
    }

    public double bonificaçaoo(){
        return this.salario+=getSalario()*0.2;
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
