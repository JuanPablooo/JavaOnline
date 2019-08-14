package br.com.abc.javacore.Jmodificadorfinal.teste;

import br.com.abc.javacore.Jmodificadorfinal.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.getComprador());
        c.getComprador().setNome("dono do carro");
        System.out.println(c.getComprador());
        c.getComprador().setNome("dono ");
        System.out.println(c.getComprador());
        Carro car = new Carro();
        System.out.println("=-=-=-=-=-");
        System.out.println(car);
        System.out.println(car.getComprador());
        car.getComprador().setNome("lanci");
        System.out.println(car.getComprador());

    }

}
