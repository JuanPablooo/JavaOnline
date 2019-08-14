package refazendo.modificadorEstatico;

public class Cliente {
    // 0 o bloco de inicializacao eh carregado na primeira referencia para a classe Cliente
    // 1 é aloca o espaço em memoria para o objeto que sera criado
    // 2 inicializado os atributos com valores dafault ou padrao
    // 3 bloco de inicializacao é inicializado
    // 4 construtor é inicializado
    private static int[] parcelas;

    static {
        System.out.println("-=-=-=-");
        // parcelas ainda eh apenas um espaco do tipo array de inteiros, mas nao sabemos o tamanho dele
        // sendo assim nao eh possivel atribuir valores durante a execucao
        // se eu nao criar o objeto array, nao sera possivel atribuir valor a ele
        parcelas = new int[20];    // criando o objeto e dando tamanho a ele
        for (int i= 1; i <=20; i++){
            parcelas[i-1]= i;
        }
        System.out.println("blocooo");
    }
    {
        System.out.println("-----------");
    }

    public Cliente(){

    }

    public void mostraParcelas(){
        for(int parcela: parcelas){
            System.out.println(parcela);
        }
    }

}
