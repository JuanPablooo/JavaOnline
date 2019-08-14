package br.com.abc.javacore.Fmodificadorestatico.test;

import br.com.abc.javacore.Fmodificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro car = new Carro("gol", 230);
        Carro c1 = new Carro("BMW",300);
        Carro c2 = new Carro("FERRARI",250);
        c1.imprime();
        c2.imprime();
        car.imprime();
        System.out.println("##############");
        Carro.setVelocidadeLimite(250);
        c1.imprime();
        c2.imprime();
        car.imprime();
        System.out.println("=-=-=-=-=-=-");
        System.out.println(Carro.getVelocidadeLimite());
    }
}
