package faculdade.paralelismo.classes;

import faculdade.paralelismo.test.MaiorMenorTest;
import faculdade.paralelismo.test.MediaThreadTest;

public class MediaThread extends Thread {
    int inicio, fimm;
    private  double somatot;
    String nomes;
    private static double somas;

    public MediaThread(int inici, int fim, String name) {
        this.inicio = inici;
        this.fimm = fim;
        this.nomes=name;
    }
    public MediaThread() {

    }

    public void run(){
        for(int pos = inicio; pos<fimm; pos++){
            somatot+= MediaThreadTest.vetor[pos];

            System.out.println("eu sou a thread "+nomes+" e nesse momento tenho no total "+somatot);
            if(pos==fimm-1){
                somas+=somatot;
                MediaThreadTest.somaTotal=somas;
            }

        }

    }



}
