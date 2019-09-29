package br.com.abc.javacore.Zcolections.teste;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversaoDeListasArray {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(3);
        numeros.add(4);
        System.out.println(numeros);
        Integer[] numerosArray = new Integer[numeros.size()];
        numeros.toArray(numerosArray);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println("=-=----=-=--=-=--=-=--=-=--=-=");
        Integer[] numerosArray2 = new Integer[4];
        numerosArray2[0] = 2;
        numerosArray2[1] = 0;
        numerosArray2[2] = 4;
        numerosArray2[3] = 3;
        List<Integer>  numerosListaArr = Arrays.asList(numerosArray2);
        System.out.println(numerosListaArr);
        /* neste caso temos que tomar cuidado por que a lista esta apontando para o endereco de memoria
        hip ou seja onde esta o array, entao se mechermos em um a mudanca tb vai mudar o outro
        logo se adicionar um item na lista, vai dar erro, pq a jvm vai tentar adicionar tb no array
        e um array nao pode alterar seu tamanho
        entao temos que criar uma nova lista com o new para ela ser alocada em uma outra parte da memoria
        e adcionamos todos os elemtnos do array exemplo abaixo
         */
        List<Integer> numerosLista = new ArrayList<>();
        numerosLista.addAll(Arrays.asList(numerosArray2));



    }
}
