package br.com.abc.javacore.Npolimorfismo.classes;

public class Gerente extends Funcionario {
    private double pnl;

    public Gerente(String nome, double salario, double pnl){
        super(nome, salario);
        this.pnl = pnl;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "pnl=" + pnl +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public void calcularPagamento(){
        this.salario = this.salario + this.pnl;
    }

    public double getPnl() {
        return pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }
}
