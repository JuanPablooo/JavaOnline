package br.com.abc.javacore.Fmodificadorestatico.classes;

public class Cliente {
    // quando o bloco de inicialização é criado cada vez que instanciar um novo objeto o bloco é executado
    // mas se o bloco for statico ele sera executado apenas uma vez idependente da quantidade de objetos instaciados
    private static int[] parcelas;
    static {
        parcelas = new int[100];
        System.out.println("dentro do bloco de inicializaçao");
        System.out.println("-=-=-=-=-=-=-=");
        for(int parcela=1;parcela<100;parcela++){
            parcelas[parcela-1]= parcela;
        }
    }

    {
        System.out.println("***************");
    }

    public Cliente(){
    }
    public int[] getParcelas(){
        return parcelas;
    }
}
