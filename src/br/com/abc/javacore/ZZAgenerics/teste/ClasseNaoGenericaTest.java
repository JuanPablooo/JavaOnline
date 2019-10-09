package br.com.abc.javacore.ZZAgenerics.teste;

import br.com.abc.javacore.ZZAgenerics.classes.Carro;
import br.com.abc.javacore.ZZAgenerics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseNaoGenericaTest {
    public static void main(String[] args) {
        CarroAlugavel carroAlugavel = new CarroAlugavel();
        Carro carroAlugado = carroAlugavel.getCarroDisponivel();
        System.out.println("usando carro alugado por um mes");
        carroAlugavel.devolverCarro(carroAlugado);
    }

}
class CarroAlugavel{
    private List<Carro> carrosDisponiveis = new ArrayList<>();
    {
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
    }
    public Carro getCarroDisponivel(){
        Carro c = carrosDisponiveis.remove(0);
        System.out.println("alugando carro "+c);
        System.out.println("carros disponiveis "+carrosDisponiveis);

        return c ;
    }
    public void devolverCarro(Carro c){
        System.out.println("devolvendo carro "+c);
        carrosDisponiveis.add(c);
        System.out.println("carros disponiveis "+carrosDisponiveis);
    }
}
class ComputadorAlugavel {
    private List<Computador> computadoresDisponiveis = new ArrayList<>();

    {
        computadoresDisponiveis.add(new Computador("mac"));
        computadoresDisponiveis.add(new Computador("Windows"));
    }

    public Computador getComputadorDisponivel() {
        Computador c = computadoresDisponiveis.remove(0);
        System.out.println("alugando computador " + c);
        System.out.println("computador disponiveis " + computadoresDisponiveis);

        return c;
    }

    public void devolverComputador(Computador c) {
        System.out.println("devolvendo ccomputador " + c);
        computadoresDisponiveis.add(c);
        System.out.println("computador disponiveis " + computadoresDisponiveis);
    }
}
