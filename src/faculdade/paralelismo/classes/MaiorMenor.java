package faculdade.paralelismo.classes;

import faculdade.paralelismo.test.MaiorMenorTest;

public class MaiorMenor extends Thread {
    int inicio;
    int fim;

    public MaiorMenor( int inicioo, int fimm) {
        this.inicio = inicioo;
        this.fim = fimm;
    }
    public MaiorMenor(){

    }

    public void run(){
        for(int pos = inicio;pos<fim ; pos++){
            if(pos==0){
                MaiorMenorTest.maior=pos;
                MaiorMenorTest.menor=pos;
            }
            else if(pos >MaiorMenorTest.maior){
                MaiorMenorTest.maior=pos;
            }else if(pos<MaiorMenorTest.menor){
                MaiorMenorTest.menor=pos;
            }
        }
    }

}
