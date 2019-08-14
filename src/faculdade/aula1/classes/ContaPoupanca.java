package faculdade.aula1.classes;

import javax.swing.*;

public class ContaPoupanca extends Conta {
    private double debito;


    public ContaPoupanca(String nome,double saldoo){
        super(nome,saldoo);
        debito=this.saldo;
    }
    public ContaPoupanca(){

    }
    public double atualiza(){
        JOptionPane.showMessageDialog(null,"-------ATUALIZANDO-------");
        return this.saldo+=this.deposita+deposita*(taxa*3)-getSacar();
    }

    public void setDeposita(double deposita) {
        this.deposita = deposita;
    }
    public double getSacar(){
        return this.sacar;
    }

    public void imprime(){
        JOptionPane.showMessageDialog(null,"nome: "+nome);
        JOptionPane.showMessageDialog(null,"saldo atual da conta poupança: "+this.saldo);
    }
}



