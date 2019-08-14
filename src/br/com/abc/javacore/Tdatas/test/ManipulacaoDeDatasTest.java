package br.com.abc.javacore.Tdatas.test;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDatasTest {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(date.getTime()+ 3_600_000L);
        System.out.println(date);

        Calendar c = Calendar.getInstance();
        System.out.println(c);
        c.setTime(date);
        if (Calendar.SUNDAY == c.getFirstDayOfWeek()){
            System.out.println("domingo eh o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        Date date2 = c.getTime();
        System.out.println(date2);
        // o metodo roll incrementa horas e muda apenas as horas, se passar 25 deveria mudar o dia, porem nao muda
        c.roll(Calendar.HOUR, 20);
        c.roll(Calendar.MONTH, 20);
        c.roll(Calendar.MONTH, 20);
        // o metodo add adiciona e acrescenta, se passar 24 horas ele devolve o dia posterior
        c.add(Calendar.HOUR,26);




    }
}
