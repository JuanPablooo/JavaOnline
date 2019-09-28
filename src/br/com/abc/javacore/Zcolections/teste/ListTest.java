package br.com.abc.javacore.Zcolections.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("juan");
        nomes.add("salve");
         // usando o metodo forEach
        nomes.forEach(System.out::println);
        System.out.println("=-=-=-=-=--==-");
        List<String> nomes2 = new ArrayList<>();
        nomes2.add("juan2");
        nomes2.add("salve");
        nomes.addAll( 1, nomes2);
        nomes.forEach(System.out::println);


        List<Integer> numeros = new ArrayList<>();
        numeros.add(0);
        numeros.add(10);
        numeros.add(50);
        numeros.add(0);
        // usando o metodo forEach
        numeros.forEach(System.out::println);
        System.out.println("=-=-=-=-=--==-");
        numeros.remove(0);
        numeros.forEach(System.out::println);



    }
}
