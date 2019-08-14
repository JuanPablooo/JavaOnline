package faculdade.paralelismo.test;

import faculdade.paralelismo.classes.InverterOrdem;

public class InverterOrdemTest {
    public static int[] vetor;
    public static int[] vvetor;
    public static int numero =10;




    public static void main(String[] args) {
        vetor= new int[numero];
        vvetor= new int[numero];

        for (int pos = 0; pos<numero; pos++){
            vetor[pos]=pos;
            System.out.print(vetor[pos]);

        }
        //  for (int mostra:vetor){
        //  System.out.print(vetor[mostra]);
        // }
//        InverterOrdem threadteste = new InverterOrdem(vetor.length,vetor);
//        threadteste.start();
//        try {
//            threadteste.join();
//        }catch (InterruptedException e){
//
//        }
        for(int vet =0;vet<vetor.length;vet++){
            vvetor[((vetor.length-1)-vet)]=vetor[vet];
            System.out.println(vvetor[vet]);
        }
        System.out.println("\n");
        System.out.println("-=-=-=-=-=-=-=-=-=-");
        for (int mostra=0;mostra<vvetor.length;mostra++){
            System.out.print(vvetor[mostra]);
        }


    }
}
