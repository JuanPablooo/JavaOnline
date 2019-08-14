package faculdade.aula1.test;

import faculdade.aula1.classes.ContaCorrente;
import faculdade.aula1.classes.ContaPoupanca;

import javax.swing.*;

public class ContaTest {
    public static void main(String[] args) {
        ContaCorrente contaCo = new ContaCorrente();
        contaCo.setNome("juan");
        contaCo.imprime();
        contaCo.setDeposita(Integer.parseInt(JOptionPane.showInputDialog("digite o valor do deposito")));
        contaCo.setSacar(Integer.parseInt(JOptionPane.showInputDialog("quanto quer sacar ? se nao quiser digite 0")));
        contaCo.atualiza();
        contaCo.imprime();

        JOptionPane.showMessageDialog(null,"finalizando");
        ContaPoupanca contPop = new ContaPoupanca();
        contPop.setNome("juan esperto");
        contPop.imprime();
        contPop.setDeposita(Integer.parseInt(JOptionPane.showInputDialog("digite o valor do deposito")));
        contPop.setSacar(Integer.parseInt(JOptionPane.showInputDialog("quanto quer sacar ? se não quiser digite 0")));
        contPop.atualiza();
        contPop.imprime();
    }
}
