package br.com.abc.javacore.ZZAgenerics.teste;

import br.com.abc.javacore.ZZAgenerics.classes.Carro;
import br.com.abc.javacore.ZZAgenerics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>();
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
        ObjetosAlugaveis<Carro> carrosAlugavel = new ObjetosAlugaveis<>(carrosDisponiveis);
        Carro carro = carrosAlugavel.getObjetoDisponivel();
        carrosAlugavel.devolverObjeto(carro);
        List<Computador> computadores = new ArrayList<>();
        computadores.add(new Computador("mac"));
        computadores.add(new Computador("linux"));
        ObjetosAlugaveis<Computador> computadorObjetosAlugaveis = new ObjetosAlugaveis<>(computadores);
        Computador c = computadorObjetosAlugaveis.getObjetoDisponivel();
        computadorObjetosAlugaveis.devolverObjeto(c);

    }



}
// a letra T e abreviacao de type (tipo)
class ObjetosAlugaveis<T>{
    private List<T> objetosDisponiveis = new ArrayList<>();

    public ObjetosAlugaveis(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T getObjetoDisponivel(){
        T t = objetosDisponiveis.remove(0);
        System.out.println("alugando objeto "+ t);
        System.out.println("objetos disponiveis "+ objetosDisponiveis);

        return t;
    }
    public void devolverObjeto(T t){
        System.out.println("devolvendo objetos "+ t);
        objetosDisponiveis.add(t);
        System.out.println("objetos disponiveis "+ objetosDisponiveis);
    }
}
