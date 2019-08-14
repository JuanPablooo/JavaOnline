package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.modelo = "gol";
        carro.placa = "YPY1999";
        carro.velocidadeMaxima = 120f;
        System.out.println(carro.placa);
    }
}
