package testesgerais;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TesteDivisor {
    public static void main(String[] args) {
        int [] array = {9, 10, 20, 20, 10, 10, 30, 50, 10, 20};
        int quantidade = 0;
        List<Integer> listaCombinacoes = new ArrayList<>();
        int numerosIdenticos ;
       for(int indice1 = 0;indice1<array.length; indice1++){
            numerosIdenticos = 0;
           for(int indice2 = indice1;indice2<array.length; indice2++){
               if(indice1!= indice2){
                   if(listaCombinacoes.isEmpty() || !listaCombinacoes.contains(array[indice1])) {
                       if (array[indice1] == array[indice2]) {
                           numerosIdenticos++;
                       }
                   }
               }
           }
           if(numerosIdenticos > 0){
               listaCombinacoes.add(array[indice1]);
               quantidade += numerosIdenticos/2;
           }

       }
        System.out.println("quantidade de combinacoes => "+quantidade);
    }
}
