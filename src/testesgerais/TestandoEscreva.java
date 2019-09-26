package testesgerais;

import br.com.abc.javacore.Bintroducaometodos.classes.Calculadora;
import refazendo.exercico.classes.Aluno;

import java.util.Arrays;
import java.util.Scanner;

public class TestandoEscreva extends Aluno {


    private static void calc (int... numer){
        for (int i : numer) {
            System.out.println(i);
        }
    }

    private static void modificaArrayInt(int[] arrayMe){
        System.out.println(Arrays.toString(arrayMe));
        Arrays.fill(arrayMe, 20);
    }
    public static void main(String[] args) {
        calc(1, 2, 3, 8, 9, 5, 6);
        int [] array = {1, 5, 8, 10, 3};
        System.out.println("before");
        for(int i=0; i < array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("dss");
        modificaArrayInt(array);
        for(int i=0; i < array.length;i++){
            System.out.println(array[i]);

        }
        System.out.println("string");
        String[] arrayString = {"bala", "bobo", "loira", "poder"};

        for(int i =0;i<arrayString.length; i++){
            System.out.println(arrayString[i]);
        }
        modifyString(arrayString);
        for(int i =0;i<arrayString.length; i++){
            System.out.println(arrayString[i]);
        }
        
    }

    public static void modifyString(String[] aString){
        for(int i =0;i<aString.length; i++){
            aString[i] = "salve";
        }
    }
}
