package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Aluno;

import javax.swing.*;

public class AlunoTest {
    public static void main(String[] args) {
        String nome;
        Aluno aluno = new Aluno();
        double nota1,  nota2, nota3;
        int idade = 0;
        int resposta = 0 ;
        while (true){
            nota1 = Integer.parseInt(JOptionPane.showInputDialog("digite a primeira nota"));
            nota2 = Integer.parseInt(JOptionPane.showInputDialog("digite a segunda nota"));
            nota3 = Integer.parseInt(JOptionPane.showInputDialog("digite a terceira nota"));
            idade = Integer.parseInt(JOptionPane.showInputDialog("digite a sua idade"));
            nome = JOptionPane.showInputDialog("digite seu nome");
            aluno.CalculaMedia(nota1, nota2, nota3, idade, nome);
            while (true){
                resposta = Integer.parseInt(JOptionPane.showInputDialog("deseja continuar? 1 SIM, 2 NAO"));
                if (resposta==2 | resposta ==1){
                    break;
                }
            }
            if (resposta == 2){
                break;
            }
        }

    }
}
