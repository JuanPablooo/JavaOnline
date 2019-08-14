package faculdade.paralelismo.test;

import faculdade.paralelismo.classes.MediaThread;

public class MediaThreadTest {
    public static double somaTotal;
    public static double media;
    public static double[] vetor;
    public static int quantidade=4;
    public static String nome;

    public static void main(String[] args) {
        vetor = new double[quantidade];
        for(int posica=0; posica<quantidade/2;posica++){
            vetor[posica]=6;
        }
        for(int posi=quantidade/2; posi<quantidade; posi++){
            vetor[posi]=7;
        }
        MediaThread thread1= new MediaThread(0,quantidade/2,"#####11111");
        MediaThread thread2= new MediaThread((quantidade/2),quantidade,"2222222####");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){

        }
        System.out.println("--=-=-=-=-=-=-=");
        System.out.println("a soma total foi "+somaTotal);
        System.out.println("e a media foi "+somaTotal/quantidade);




    }
}
