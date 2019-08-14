package br.com.abc.javacore.Tdatas.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        /*
        existem varios jeitos de formatar datas, com a classe da para mudar o jeito que vai ser mostrado
        o padrao desejado e passado por meio de uma string, pelo construtor no momento de instanciar

               */
        /*
        nesse casso yyy.MM.dd siguinifica que quero 3 digitos do ano 2 do mes, e dois do dia
        G eh a geracao (antes ou depois de cristo)
        e o HH:mm:ss z eh horas com dois digitos, minutos com dois, e segundos com dois
         */
        String mascara = "yyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        // o metodo format retorna uma string
        System.out.println(formatador.format(c.getTime()));

    }
}
