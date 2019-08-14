package faculdade.paralelismo.classes;

import faculdade.paralelismo.test.TestandoThreadTest;

public class ExercicioThread0 extends Thread{
    public ExercicioThread0(){

    }
    String nome;
    int inicio,termino, par;
    public ExercicioThread0(int ini, int fim, String name){
        inicio = ini;
        termino=fim;
        nome=name;

    }@Override

    public void run(){
        System.out.println("Thread: "+nome+" Inicio: "+inicio+" Fim: "+termino);
        for (int i=inicio;i<termino;i+=2){
            if(nome=="par"&& i%2==0 ){
                TestandoThreadTest.parr+=1;
            }else if (i%2==1){
                TestandoThreadTest.imparr+=1;
            }




        }
    }


}
