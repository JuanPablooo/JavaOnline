package br.com.abc.javacore.ZZAgenerics.teste;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        // type erasure
        List<String> lista = new ArrayList<>();
        lista.add("salve");
        lista.add("outro salve");
        lista.add("ultimo salve");

        for(String indice: lista){
            System.out.println(indice);
        }
        add(lista, 1L);


    }
    public static void add(List lista, Long l){
        lista.add(l);  // se tentarmos imprimir ou usar a lista apos adicionar o long
        // teremos uma exception, por que a jvm vai tentar fazer o cast de uma long para estring, deixamos explicito
        // que a lista e do tipo string List<String>
    }

}
