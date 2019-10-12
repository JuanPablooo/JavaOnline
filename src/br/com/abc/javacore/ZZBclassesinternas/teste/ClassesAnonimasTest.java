package br.com.abc.javacore.ZZBclassesinternas.teste;

import br.com.abc.javacore.ZZAgenerics.classes.Carro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

class Animal{
    void andar(){
        System.out.println("andar original");
    }
}
public class ClassesAnonimasTest {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            void andar() {
                System.out.println("andar anonimamente");
            }
        };
        animal.andar();
        List<Carro> carroList = new ArrayList<>();
        carroList.add(new Carro("BMW"));
        carroList.add(new Carro("Audi"));
        /*
        aula 138 maratona java

        para o metodo sort ser usado ele precisa ser chamado de uma lista de objetos de uma
        classe que implementa a interface Comparator, ou de um parametro com uma instancia
        do objeto que implementa a interface e sobreescreve o metodo compare.
        para nao criar uma classe apenas para enviar como parametro, podemos criar uma
        classe anonima diretamento no parametro
         */
        // classe anonima
        Collections.sort(carroList, new Comparator<Carro>(){
            @Override
            public int compare(Carro c1, Carro c2){
                return c1.getNome().compareTo(c2.getNome());
            }
        });
        carroList.add(new Carro("golzinho"));
        // classe anonima usando lambda
       Collections.sort(carroList, (c1, c2)-> c1.getNome().compareTo(c2.getNome()));

    }
}
