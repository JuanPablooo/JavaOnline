package br.com.abc.javacore.Hheranca.classes;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nom, double salario) {
        super(nom);
        this.salario = salario;
    }
    public Funcionario(){

    }

    // passando o nome para o construtor da classe pai
    public Funcionario(String nome) {
        super(nome);
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);

    }

    public void imprimeReciboPagamento(){
        System.out.println("nome: "+super.nome+" recebeu o pagamento de salario no valor de :"+salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
