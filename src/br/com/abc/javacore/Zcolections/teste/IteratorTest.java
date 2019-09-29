package br.com.abc.javacore.Zcolections.teste;

import br.com.abc.javacore.Zcolections.classes.Produto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("123", "Laptop lenovo", 2000.0, 0);
        Produto produto2 = new Produto("321", "picanha", 26.0, 10);
        Produto produto3 = new Produto("879", "teclado", 1000.0, 5);
        Produto produto4 = new Produto("012", "sansumg", 3000.0, 0);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

/*      nao podemos usar o for each por que nao se pode modificar a lista dentro dele, para ele nao
        se perder na lista, exemplo vc tem uma lista com duas posicoes, entao o for vai iterar suas vezes
        mas se vc remover ou alterar um item como que vc garante que ele vai passar por todos elementos
        ou que ele vai tentar acessar um que foi removido?

        for(Produto produto:produtos){
            if(produto.getQuantidade() == 0){
                produtos.remove(produto);
            }
        }*/
        Iterator<Produto> produtoIterator = produtos.iterator();
        System.out.println("tamanho:" +produtos.size());
        while (produtoIterator.hasNext()) {
            Produto produto = produtoIterator.next();
            if(produto.getQuantidade() == 0){
                produtoIterator.remove();
            }
            /*
            estaforma ocupa menos memoria, dexei a de cima por questao de semantica
            if(produtoIterator.next().getQuantidade() == 0){
                produtoIterator.remove();
            }*/
        }
        System.out.println("tamanho:" +produtos.size());


    }
}
