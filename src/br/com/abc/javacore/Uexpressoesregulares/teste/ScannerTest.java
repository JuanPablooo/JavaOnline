package br.com.abc.javacore.Uexpressoesregulares.teste;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        /*
        por padrao a classe Scanner usa o espaco em branco como delimitador
        para trocar da para usar o metodo scanner.useDelimiter() e passar o delimitador desejado
        como parametro

         */
        String o = "lal";

        Scanner scanner = new Scanner("1 true oi");


        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
        Scanner scanner2 = new Scanner("1 true oi");
        while (scanner2.hasNext()){
            if(scanner2.hasNextInt()){
                int i = scanner2.nextInt();
                System.out.println(i);
            }
            else if (scanner2.hasNextBoolean()){
                boolean b = scanner2.nextBoolean();
                System.out.println(b);
            }
            else {
                String strin = scanner2.next();
                System.out.println(strin);
            }
        }

    }
}
