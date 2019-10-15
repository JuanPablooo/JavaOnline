package testesgerais;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(3, 5, 7, 9, 2);
        System.out.println(lista);

        Collections.sort(lista);
        System.out.println(lista);
        System.out.println(oddNumbers(3, 9));


//        int [] array = {9, 10, 20, 20, 10, 10, 30, 50, 10, 20, 20, 20, 20,20};
//        int k = 10;
//        String result = "";
//        List<Integer> lista = Arrays.asList(9, 10, 20, 20, 10, 10, 30, 50, 10, 20, 20, 20, 20,20);
//        result = (lista.contains(k)) ? "YES": "NO";
//        System.out.println(result);

        System.out.println(fatorial(5));
        System.out.println("-=-=-=-");
        System.out.println(computeNoOfCombns(4, 2));
    }
    static List<Integer> oddNumbers(int l, int r) {
        List<Integer> lista = new ArrayList<>();
        for(int i = l; i <= r; i++){
            if(i % 2 == 1){
                lista.add(i);
            }
        }
        return lista;
    }

    static int computeNoOfCombns(int totalNumbers, int numbersInGroup) {
        int fat1 = fatorial(totalNumbers);
        int fat2 = fatorial(numbersInGroup);
        int resposta ;
        resposta = fat1/((fat2) * (totalNumbers-numbersInGroup));





        return resposta;

    }
    static int fatorial(int n){
        if(n == 0){
            return 1;
        }
        int r = n;
        while (n> 2){
            r *= --n;
        }
        return r;
    }



}
