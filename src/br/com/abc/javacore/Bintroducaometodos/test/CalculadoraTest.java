package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        int nume = 3;
        int numero = 4;
        Calculadora calculo = new Calculadora();
        calculo.somaDoisNumeros();
        System.out.println("continuando");
        System.out.println("------------");
        calculo.subtraiDoisNumeros();
        calculo.multiplicaDoisNumeros(nume, 5);
        System.out.println(calculo.divideDoisNumeros(11,3));
        calculo.imprimeDoisNumerosDivididos(10,1);
        System.out.println("-=-=-=-=-=-=-");
        int[] arr = {1, 2, 3, 4};
        calculo.somaArray(arr);
        calculo.somargs(1, arr);


    }
}
