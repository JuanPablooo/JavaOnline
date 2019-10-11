package br.com.abc.javacore.ZZAgenerics.teste;


import br.com.abc.javacore.Hheranca.classes.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest {
    public static void main(String[] args) {
        List<Cachorro> listaDeCachorro = new ArrayList<>();
        criarArray(new Cachorro());


    }
    static <T extends Animal> void criarArray(T t){
        System.out.println("dentro do metodo");
        List<T> lista = new ArrayList<>();
        lista.add(t);
    }
// declaracao de metodo que recebe um tipo de atributo
//    static <T> List<T> criarArray(T t){
//        System.out.println("dentro do metodo");
//        List<T> lista = new ArrayList<>();
//        lista.add(t);
//        return lista;
//    }
}
