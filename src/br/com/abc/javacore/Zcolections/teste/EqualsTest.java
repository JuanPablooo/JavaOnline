package br.com.abc.javacore.Zcolections.teste;

import br.com.abc.javacore.Zcolections.classes.Celular;

public class EqualsTest {



    public static void main(String[] args){
//        String nome1 = new String("juan");
//        String nome2 = "juan";
//        System.out.println(nome1 == nome2);

        /*
         retorna false por que estao localizadas em lugares, usando o new estamos instanciando na memoria hip
         e sem usar o new ele esta no pool string que e outro local, basicamente estao em locais diferentes.
         e quando se compara, ele compara o local onde estao armazenados


         */


        Integer int1 = 5;
        Integer int2  = new Integer(5);
        System.out.println(int1 == int2); // false
        // o metodo equal verifica o valor e nao a localizacao
        System.out.println(int1.equals(int2)); // true
        System.out.println("-=-=--");
        Celular c1 = new Celular("asus", "1235");
        Celular c2 = new Celular("asus", "1235");
        System.out.println(c1.equals(c2));


    }
}
