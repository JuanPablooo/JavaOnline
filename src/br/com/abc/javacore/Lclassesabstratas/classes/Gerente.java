package br.com.abc.javacore.Lclassesabstratas.classes;

public class Gerente extends Funcionario {

    public Gerente(){

    }
    public Gerente(String nome, String clt, double salario){
        super(nome, clt, salario);
    }

    @Override
    public void calculaSalario(){
        salario = this.salario+(this.salario*0.3);
    }

}
