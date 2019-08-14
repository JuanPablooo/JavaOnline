package br.com.abc.javacore.Passertions.testes;

public class AssertTest {
    public static void main(String[] args) {
        calculaSalario(-2);
        //calcSalario(-20);
    }

    private static void calculaSalario(double salario) {
        assert (salario > 0) : "o salario nao deve ser menor que zero, o salario veio como: " + salario;
        System.out.println("tudo ok");
    }

    public static void calcSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("salario nao deve ser menor que zero o salario veio como: " + salario);
        }
    }

    public static void calcDiaSemana(int dia) {
        switch (dia) {
            case 1:break;
            case 2:break;
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            default:assert false;
        }
    }
}
