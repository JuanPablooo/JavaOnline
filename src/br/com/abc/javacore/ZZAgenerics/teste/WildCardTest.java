package br.com.abc.javacore.ZZAgenerics.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Animal{
    public abstract void consulta();
}
class Cachorro extends Animal{

    @Override
    public void consulta() {
        System.out.println("consultado cachorro");
    }
}
class Gato extends Animal{

    @Override
    public void consulta() {
        System.out.println("consultado gato");
    }
}
public class WildCardTest {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
       // consultaAnimal(gatos);
        //consultaAnimal(cachorros);
        List<Cachorro> cachorrosList = new ArrayList<>();
        cachorrosList.add(new Cachorro());
        //consultaAnimalList(cachorrosList); erro de compilacao, o metodo consulta animal so recebe lista de animal
        // somente de animal, nem das classes filhas ele aceita
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cachorro()); // podemos adicionar
        consultaAnimalList(animals);


    }



    static void consultaAnimal(Animal[] animais){
        for(Animal animal: animais){
            animal.consulta();
        }
        System.out.println("=-=-=- ");
        /*
        animais[1] = new Gato(); neste caso teremos um erro, por que foi instanciado cachorro e estamos
        tentando colocar um gato, mesmo sendo classes irmas, nao podemos por causa do que o array que foi
        passado eh do tipo Cachorro.
        nao podemos passar lista de classes filhas da classe Animal, mas no metodo que
        for chamado podemos adicionar na lista animais um animal de uma classe filha da classe animal

         */

    }
    static void consultaAnimalList(List<? extends Animal> animals){
        /*
        como recebemos uma lista de animal ou alguma classe que eh filha de animal nao podemos adicinar
        nada nesta lista, porque nao tem como garantir que vamos receber uma lista do tipo que vamos adicionar
        ex: a classe animal tem duas filhas, cachorro e gato, e passamos para este metodo uma lista de gatos
        como o java iria garantir que nao poderiamos adicionar nenhum cachorro na lista de gatos

         */
        for(Animal animal: animals){
            animal.consulta();
        }
    }
    static void consultaCachorroList(List<? super Cachorro> cachorroList){
        // podemos adicionar, pq em lista de tipos superiores(pai) podemos adicionar classes filhas
        cachorroList.add(new Cachorro());

        //cachorroList.add(new Animal()) erro compilacao, nao tem como garantir que vamos receber um animal
    }
    static void ordenaLista (List<? extends Comparable> lista){
        /*
        neste caso estamos deixando explicito que o metodo so aceita classes que implementarem a interface
        Comparable, logo podemos usar metodos da interface
         */
        Collections.sort(lista); // neste caso nao temos erro, por que garantimos que o metodo recebe
        // uma classe que implementa Comparable, que por sua vez obriga a sobreescrita do metodo compareTo
        // que e usado no metodo sort para ordenar
    }
    static void consultaCachorroList2(List<? super Animal> cachorroList){
        // podemos adicionar, pq em lista de tipos superiores(pai) podemos adicionar classes filhas ou as classe em si
        cachorroList.add(new Cachorro());
        cachorroList.add(new Gato());
    }

}
