package faculdade.paralelismo.test;

import faculdade.paralelismo.classes.MaiorMenor;

public class MaiorMenorTest {
    public static int[] vetor;
    public static int n =100 ;
    public static int menor;
    public static int maior;



    public static void main(String[] args) {
        MaiorMenor maiorMenor = new MaiorMenor();
        vetor=new int[n];
        for(int x=0; x< n;x++){
            vetor[x]=x;
        }
        MaiorMenor primeirathread = new MaiorMenor(0,n/2);
        MaiorMenor segundathread = new MaiorMenor(n/2,n);
        primeirathread.start();
        segundathread.start();
        try {
            primeirathread.join();
            segundathread.join();
        }catch (InterruptedException ex){

        }
        System.out.println("o maior foi da foi "+maior);
        System.out.println("o menor foi "+menor);


    }
}
