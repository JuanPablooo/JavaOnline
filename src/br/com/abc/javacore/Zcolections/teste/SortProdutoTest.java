package br.com.abc.javacore.Zcolections.teste;

import br.com.abc.javacore.Zcolections.classes.Produto;

import java.util.*;

class ProdutoNomeComparator implements Comparator<Produto>{

    @Override
    public int compare(Produto produto, Produto t1) {
        return produto.getNome().compareTo(t1.getNome());
    }
}


public class SortProdutoTest {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto[] produtosArray = new Produto[4];
        Produto produto1 = new Produto("123", "Laptop lenovo", 2000.0);
        Produto produto2 = new Produto("321", "picanha", 26.0);
        Produto produto3 = new Produto("879", "teclado", 1000.0);
        Produto produto4 = new Produto("012", "sansumg", 3000.0);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtosArray[0] = produto1;
        produtosArray[1] = produto2;
        produtosArray[2] = produto3;
        produtosArray[3] = produto4;
        //Collections.sort(produtos, new ProdutoNomeComparator());
        //System.out.println(Arrays.toString(produtosArray));

//        produtos.forEach(System.out::println);
        Arrays.sort(produtosArray);//, new ProdutoNomeComparator());
        for(Produto p:produtosArray){
            System.out.println(p);
        }


    }
}
