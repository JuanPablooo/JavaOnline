package br.com.abc.introducao.controlefluxo;

public class ControleFluxo3 {
    public static void main(String[] args) {
        byte dia = 7;
        switch (dia){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
        }
        String sexo = "l";
        switch (sexo){
            case "f":
                System.out.println("feminino");break;
            case "m":
                System.out.println("masculino");
            default:
                System.out.println("opção invalida");break;
        }
    }
}
