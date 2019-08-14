package br.com.abc.javacore.Tdatas.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
// classe para formatar numeros, muito util para trabalhar com dinheiro
public class NumberFormatTest {
    public static void main(String[] args) {
        float valor = 123.4567f;
        Locale locJp = new Locale("jp");
        Locale locFc = new Locale("fr");
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locFc);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(locFc);

        for (NumberFormat nb:nfa){
            System.out.println(nb.format(valor));
        }

        System.out.println("-=-=-=-=-");
        NumberFormat nf = NumberFormat.getInstance();
        // pegando quantidade de numeros considerados apos a virgula ou ponto
        System.out.println(nf.getMaximumFractionDigits());
        System.out.println(nf.format(valor));
        // modificando o valor a ser considerado apos a virgula ou ponto
        nf.setMaximumFractionDigits(5);
        System.out.println(nf.format(valor));
        String valorStrin = "123,4567";


        try {

            // parse converte uma string para um valor numerico
            System.out.println(nf.parse(valorStrin));
            // parseIntegriOnly faz com que seja desconsiderado os valores apos a virgula do numero
            nf.setParseIntegerOnly(true);
            System.out.println(nf.parse(valorStrin));

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
