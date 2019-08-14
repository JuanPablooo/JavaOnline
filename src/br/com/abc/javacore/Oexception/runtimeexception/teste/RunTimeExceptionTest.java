package br.com.abc.javacore.Oexception.runtimeexception.teste;

public class RunTimeExceptionTest {
    public static void main(String[] args) {
        try{
            divisao(10, 0);
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("-=-=-=-");

        divisao(10, 5);

    }

    private static void divisao(int num, int num2){
        if (num2 == 0){
            throw new IllegalArgumentException("passe um numero diferente de 0");
        }

        int result = num/num2;
        System.out.println(result);
    }
}
