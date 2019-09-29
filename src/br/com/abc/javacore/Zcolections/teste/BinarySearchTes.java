package br.com.abc.javacore.Zcolections.teste;

import br.com.abc.javacore.Zcolections.classes.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTes {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        Collections.sort(numeros);

        System.out.println(Collections.binarySearch(numeros, 10)); // este metodo presupoe que a lista ja esta ordenada


        List<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("123", "Laptop lenovo", 2000.0);
        Produto produto2 = new Produto("321", "picanha", 26.0);
        Produto produto3 = new Produto("879", "teclado", 1000.0);
        Produto produto4 = new Produto("012", "sansumg", 3000.0);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        Collections.sort(produtos, new ProdutoNomeComparator());
        produtos.forEach(System.out::println);
        Produto produto5 = new Produto("000", "Antena", 50);
        System.out.println( Collections.binarySearch(produtos, produto5, new ProdutoNomeComparator()));


    }
}
