package br.com.abc.javacore.Zcolections.teste;

import br.com.abc.javacore.Zcolections.classes.Produto;

import java.util.*;

public class SetTest {
    /*
    Set<Produto> produtoSet = new HashSet<>();
    a classe HasSet cria uma lista sem indice, nao segue a order de insercao e nao permite itens duplicados
    ja a classe LinkedHashSet<> contem a ordem de insercao
     */
    public static void main(String[] args) {
        Produto produto1 = new Produto("123", "Laptop lenovo", 2000.0);
        Produto produto2 = new Produto("321", "picanha", 26.0);
        Produto produto3 = new Produto("879", "teclado", 1000.0);
        Produto produto4 = new Produto("012", "sansumg", 3000.0);
        Produto produto5 = new Produto("999", "sansumg", 3000.0);
        Set<Produto> produtoSet = new LinkedHashSet<>();
        produtoSet.add(produto1);
        produtoSet.add(produto2);
        produtoSet.add(produto3);
        produtoSet.add(produto4);
        produtoSet.add(produto5);

        for(Produto p:produtoSet){
            System.out.println(p);
        }
    }
}
