package br.com.abc.javacore.Zcolections.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortLisTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("willian");
        nomes.add("suane");
        nomes.add("breno");
        nomes.add("bruno");
        Collections.sort(nomes);
        for(String nom:nomes){
            System.out.println(nom);
        }
        List<Double> numeros = new ArrayList<>();
        numeros.add(1.6);
        numeros.add(1.3);
        numeros.add(1.1);
        numeros.add(1.9);
        Collections.sort(numeros);
        numeros.forEach(System.out::println);
    }
}
