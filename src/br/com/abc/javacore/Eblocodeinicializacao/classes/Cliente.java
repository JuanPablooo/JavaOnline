package br.com.abc.javacore.Eblocodeinicializacao.classes;

public class Cliente {
    private int[] parcelas ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    {
        parcelas = new int[100];
        System.out.println("dentro do bloco de inicializaçao");
        for(int parcela=1;parcela<100;parcela++){
            parcelas[parcela-1]= parcela;
        }
    }

    public Cliente(){

        }

    public int[] getParcelas(){
        return parcelas;
    }
    public void setParcelas(int[] parcelas){
        this.parcelas = parcelas;
    }

}
