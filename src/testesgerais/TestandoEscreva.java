package testesgerais;

import br.com.abc.javacore.Bintroducaometodos.classes.Calculadora;
import refazendo.exercico.classes.Aluno;

import java.util.Scanner;

public class TestandoEscreva extends Aluno {


    public static void calc (int... numer){
        for (int i : numer) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        calc(1, 2, 3, 8, 9, 5, 6);

    }
}
