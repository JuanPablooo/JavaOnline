package br.com.abc.javacore.Zcolections.teste;

import br.com.abc.javacore.Zcolections.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListCelularTest {
    public static void main(String[] args) {
        Celular celular1 = new Celular("asus","123456");
        Celular celular2 = new Celular("iphone","464532");
        Celular celular3 = new Celular("sony xperia","426578");

        List<Celular> celularList = new ArrayList<>();
        celularList.add(celular1);
        celularList.add(celular2);
        celularList.add(celular3);

        for(Celular celular:celularList){
            System.out.println(celular);
        }

        Celular celular4 = new Celular("asus","123456");
        System.out.println(celularList.contains(celular4));

    }
}
