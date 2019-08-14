package br.com.abc.javacore.Tdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        // ISO 639 pt portugues, br= brasil
        Locale locItaly = new Locale("it", "IT");
        Locale locSuica = new Locale("it", "CH");
        Locale locIndia = new Locale("hi", "IN");
        Locale locJapao = new Locale("ja", "JP");
        Calendar c = Calendar.getInstance();
        // adicionando uma data especifica
        c.set(2015, Calendar.DECEMBER, 23);
        DateFormat d = DateFormat.getDateInstance(DateFormat.FULL, locItaly);
        DateFormat d2= DateFormat.getDateInstance(DateFormat.FULL, locSuica);
        DateFormat d3= DateFormat.getDateInstance(DateFormat.FULL, locIndia);
        DateFormat d4= DateFormat.getDateInstance(DateFormat.FULL, locJapao);
        System.out.println("Italia " + d.format(c.getTime()));
        System.out.println("Suica "+d2.format(c.getTime()));
        System.out.println("India "+d3.format(c.getTime()));
        System.out.println("Japao  "+d4.format(c.getTime()));

        // o metodo getDisplayLanguage pega o idioma instanciado na classe locale
        // como argumentos podemos passar um objeto locale, e ai vai ser mostrado o nome da lingua, no idioma do objeto passado
        System.out.println(locSuica.getDisplayLanguage());
        System.out.println(locJapao.getDisplayLanguage());
        // o metodo getCountry devolve  nome do pais instaciado no objeto locale

        System.out.println(locItaly.getDisplayCountry());
        System.out.println(locItaly.getDisplayCountry(locSuica));
    }
}
