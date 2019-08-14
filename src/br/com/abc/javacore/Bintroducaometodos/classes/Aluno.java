package br.com.abc.javacore.Bintroducaometodos.classes;

import javax.swing.*;

public class Aluno {
    public void CalculaMedia (double nota1, double nota2, double nota3, int idade, String nome){
        double media = (nota1+nota2+nota3)/3;
        JOptionPane.showMessageDialog(null,"media igual de "+nome+" e igual a "+media+
        " do aluno de "+ idade+ "anos");
        if (media>=6){
            JOptionPane.showMessageDialog(null, "APROVADO");
        }else {
            JOptionPane.showMessageDialog(null, "REPROVADO");
        }
    }
}
