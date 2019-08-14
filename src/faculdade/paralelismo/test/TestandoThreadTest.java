package faculdade.paralelismo.test;

import faculdade.paralelismo.classes.ExercicioThread0;

import java.util.Random;

public class TestandoThreadTest {
    public static int N = 200;
    public static int[] vetor;
    public static int[] soma;
    public static int parr;
    public static int imparr;
    public static void main(String[] args) {
        ExercicioThread0 num = new ExercicioThread0();

        vetor =new int[N];
        soma = new int[2];

        //enchendo o vetor
        for (int pos = 0; pos <N; pos++){
            vetor[pos] = pos;
        }

        ExercicioThread0 thread_par = new ExercicioThread0 (0,N, "par");
        ExercicioThread0 thead_impar = new ExercicioThread0(1, N,"impar");
        thread_par.start();
        thead_impar.start();
        try {
            thread_par.join();
            thead_impar.join();
        }catch (InterruptedException ex){

        }
        int somafinal = 0;
        somafinal=imparr+parr;
        System.out.println("soma final "+somafinal);
        System.out.println("pares: "+parr);
        System.out.println("impar "+imparr);


    }
}
