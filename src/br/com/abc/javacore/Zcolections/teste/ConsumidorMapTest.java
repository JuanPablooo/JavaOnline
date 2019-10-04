package br.com.abc.javacore.Zcolections.teste;

import br.com.abc.javacore.Zcolections.classes.Consumidor;
import br.com.abc.javacore.Zcolections.classes.Produto;

import java.util.ArrayList;
import java.util.List;

public class ConsumidorMapTest {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("juan", "122");
        Consumidor consumidor2 = new Consumidor("dev dojo", "321");

        Produto produto1 = new Produto("123", "Laptop lenovo", 2000.0);
        Produto produto2 = new Produto("321", "picanha", 26.0);
        Produto produto3 = new Produto("879", "teclado", 1000.0);
        Produto produto4 = new Produto("012", "sansumg", 3000.0);
    }
}
