package br.com.abc.javacore.Minterfaces.testes;

import br.com.abc.javacore.Minterfaces.classes.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p = new Produto("geladeira", 70,5000);
        p.calculaFrete();
        p.calcularImposto();
        System.out.println(p);
    }
}
