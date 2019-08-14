package faculdade.aula1.test;

import faculdade.aula1.classes.Avioes;
import faculdade.aula1.classes.Carros;

public class TestaVeiculos {
    public static void main(String[] args) {
        Carros car = new Carros();
        car.imprime();
        car.imprimeCarros();
        System.out.println("-=-=-=-=-=-=-=--==-=-=-=-");
        System.out.println("agora avioes");
        Avioes av = new Avioes();
        av.imprime();
        av.imprimeAvioes();
    }
}
