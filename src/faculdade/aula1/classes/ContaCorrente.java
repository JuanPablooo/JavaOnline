package faculdade.aula1.classes;

import javax.swing.*;

public class ContaCorrente extends Conta {
    private String idContaCorrente;
    private double creditos;

    public ContaCorrente(){
    }

    public ContaCorrente(String nom, double sald, String idContaCorrente) {
        super(nom, sald);
        this.idContaCorrente = idContaCorrente;

    }

    public ContaCorrente(String idContaCorrente) {
        this.idContaCorrente = idContaCorrente;

    }
    public double atualiza(){
        JOptionPane.showMessageDialog(null,"-------ATUALIZANDO-------");
        return this.saldo+=this.deposita+deposita*(taxa*2)-getSacar();
    }

    public void setDeposita(double deposita) {
        this.deposita = deposita-0.10;
    }
    public double getSacar() {
        return sacar;
    }
    public void setSacar(double sacar) {
        this.sacar = sacar;
    }

    public void imprime(){
        JOptionPane.showMessageDialog(null,"nome: "+nome);
        JOptionPane.showMessageDialog(null,"saldo atual da conta corrente: "+this.saldo);
    }

}
