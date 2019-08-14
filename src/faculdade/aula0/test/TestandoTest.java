package faculdade.aula0.test;
import faculdade.aula0.classes.Met;

import javax.swing.JOptionPane;

public class TestandoTest {
    public static void main(String[] args) {
        Met calc = new Met();
//        int anos, meses, dias, totdias;
////        anos = Integer.parseInt(JOptionPane.showInputDialog("digite os anos"));
////        meses = Integer.parseInt(JOptionPane.showInputDialog("digite os meses"));
////        dias = Integer.parseInt(JOptionPane.showInputDialog("digite os dias"));
////        totdias = (anos*365)+(meses*30)+dias;
////
////        JOptionPane.showMessageDialog(null, "total de dias: " + totdias);

        int num, nume;
        num = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
        //nume =Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero"));
        //recebeDoisNumeros(num, nume);
        //verifica(num);
        calc.verifica(num);

    }


    }

