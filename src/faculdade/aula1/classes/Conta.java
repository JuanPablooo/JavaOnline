package faculdade.aula1.classes;

import javax.swing.*;

public class Conta {
    protected static String nome;
    protected double saldo = 100;
    protected double deposita;
    protected double sacar;
    protected double taxa=0.01;

    public Conta(String nom,double sald){
        this.nome = nom;
        this.saldo = sald;
    }
    public Conta(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDeposita() {

        return deposita;
    }

    public void setDeposita(double deposita) {
        this.deposita = deposita;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }
    public double atualiza(){
        JOptionPane.showMessageDialog(null,"-------ATUALIZANDO-------");
        return this.saldo+=this.deposita+deposita*taxa;
    }

    public void imprime(){
        JOptionPane.showMessageDialog(null,"nome: "+this.nome);
        JOptionPane.showMessageDialog(null,"saldo atual: "+this.saldo);
    }
}
