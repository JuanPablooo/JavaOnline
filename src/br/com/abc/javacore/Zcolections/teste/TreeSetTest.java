package br.com.abc.javacore.Zcolections.teste;

import br.com.abc.javacore.Zcolections.classes.Produto;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;
/*
 NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();
 essas classes adicionam e ordenam os elementos, entao se estiver um objeto com um atributo
 quantidade, vc quer esta lista fique na ordem se baseado na quantidade, entao essas classes fazem isso
 mas para isso a classe a ser utilizada(neste caso Produto) precisa implementar o metodo compareTo da
 interface CompareTo ou compareblo
 */

public class TreeSetTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123", "Laptop lenovo", 2000.0, 0);
        Produto produto2 = new Produto("321", "picanha", 26.0, 10);
        Produto produto3 = new Produto("879", "teclado", 1000.0, 5);
        Produto produto4 = new Produto("012", "sansumg", 3000.0, 0);
        NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();
        produtoNavigableSet.add(produto1);
        produtoNavigableSet.add(produto2);
        produtoNavigableSet.add(produto3);
        produtoNavigableSet.add(produto4);
        produtoNavigableSet.forEach(System.out::println);
        /*
        metodos de busca, se vc quiser buscar um produto menor que o produto passado por argumento
        menor de acordo atributo comparador do metodo comparator ou comparable
        lower <
        floor <=
        highter >
        celling >=
         */

        System.out.println(produtoNavigableSet.lower(produto1));
        System.out.println(produtoNavigableSet.size()); // 4 produtos
        System.out.println(produtoNavigableSet.pollFirst());  // retorna e remove o primeiro
        System.out.println(produtoNavigableSet.size()); // 3 produtos
        System.out.println(produtoNavigableSet.pollLast());   // retorna e remove o ultimo
        System.out.println(produtoNavigableSet.size()); // 2 produtos


    }
}
