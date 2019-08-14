package br.com.abc.introducao.controlefluxo;

public class ControleFluxo2exeer {
    public static void main(String[] args) {
        int dia = 7;
        switch (dia) {
            case 1:
                System.out.println("domingo");
                System.out.println("aproveite o final de semana");
                break;
            case 2:
                System.out.println("segunda");
                System.out.println("dia util");
                break;
            case 3:
                System.out.println("terça");
                System.out.println("dia util");
                break;
            case 4:
                System.out.println("quarta");
                System.out.println("dia util");
                break;
            case 5:
                System.out.println("quinta");
                System.out.println("dia util");
                break;
            case 6:
                System.out.println("sexta");
                System.out.println("dia util");
                break;
            case 7:
                System.out.println("sabado");
                System.out.println("final de semana");
        }
        if (dia == 1) {
            System.out.println("final de semana");
        }
        if (dia == 7) {
            System.out.println("FINAL DE SEMANA");
        }
    }
}