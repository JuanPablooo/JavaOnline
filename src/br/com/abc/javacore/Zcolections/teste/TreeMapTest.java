package br.com.abc.javacore.Zcolections.teste;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        /*
        a interface TreeMap usa a chave para ordenar, ou seja, a classe que for utilizado como chave
        deve ter implementada a interface comparable
         */
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "letra A");
        map.put("D", "letra D");
        map.put("B", "letra B");
        map.put("C", "letra C");
        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        /*
        map.headMap(chave) retorna chaves menores que a a chave passada, chave por que o TreeMap organiza
        se baseando na chave, se algum valor for removido da lista ele sera removido da variavel que guardar
        o map.headMap MESMO QUE TENHA SIDO DECLARADO ANTES

         SortedMap<String, String> c = map.headMap("C");
        System.out.println(c);  {A=letra A, B=letra B}
        System.out.println(map.remove("B"));  remove letra B
        System.out.println(c); {A=letra A}

         */
        System.out.println(map.headMap("C"));
        System.out.println(map.ceilingEntry("C")); // C
        System.out.println(map.higherEntry("C")); // D
        System.out.println(map.descendingMap()); // ordem inversa


    }
}
