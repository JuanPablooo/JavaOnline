package faculdade.paralelismo.classes;

import faculdade.paralelismo.test.InverterOrdemTest;

public class InverterOrdem extends Thread{
    private int tamanho;
     int[] vetorrr;
    public InverterOrdem(int tamanhos,int[] vetor){
        this.tamanho=tamanhos;
        vetorrr= vetor;
    }



    public void run(){
        for(int vet = vetorrr.length;vet==1;vet++){
            vetorrr[tamanho-vet]=vetorrr[vet];
        }
        for (int mostra:vetorrr) {
            System.out.print(vetorrr[mostra]);
        }
    }
}
