package br.com.abc.javacore.Sstrings.test;

public class StringPerformaceTest {
    public static void main(String[] args) {
        Long inicio = System.currentTimeMillis();
        concatString(30000);
        Long fim = System.currentTimeMillis();
        System.out.println("tempo gasto String "+ (fim-inicio)+ " ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(30000000);
        fim = System.currentTimeMillis();
        System.out.println("tempo gasto StringBuilder "+ (fim-inicio)+ " ms");


        inicio = System.currentTimeMillis();
        concatStringBuffer(30000000);
        fim = System.currentTimeMillis();
        System.out.println("tempo gasto StringBuffer "+ (fim-inicio)+ " ms");

    }

    private static void concatString(int tam){
        String string = "";
        for (int i=0;i<=tam;i++){
            string += i;

        }
    }

    // a classe builder tem uma performace superior a da classe string, e ainda permite multi processos ao mesmo tempo
    // isso eh muito bom
    private static void concatStringBuilder(int tam){
        StringBuilder sb = new StringBuilder(tam);
        for (int i=0;i<=tam;i++){
            sb.append(i);
        }
    }

    // a classe buffer tambem tem uma performace melhor que a string, porem menor que a buider, pois eh sincronizada(threads)
    // ou seja espera uma operacao ser realizada para realizar outra, nao faz duas coisas ao mesmo tempo
    private static void concatStringBuffer(int tam){
        StringBuffer s = new StringBuffer(tam);
        for (int i=0;i<=tam;i++){
            s.append(i);
        }
    }
}
