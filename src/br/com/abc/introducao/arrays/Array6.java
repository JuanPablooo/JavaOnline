package br.com.abc.introducao.arrays;

public class Array6 {
    public static void main(String[] args){
//        int[][] indice =new int[3][];
//        indice[0]= new int[2];
//        indice[1]= new int[]{1, 2, 3};
//        indice[2]= new int[4];
        int[][] indice = new int[][]{{0,0}, {1, 2, 3}, {0, 0, 0, 0}};
        for (int[] pegaindice: indice){
            for (int pegatamanho: pegaindice){
                System.out.println(pegatamanho);
                System.out.println("-----------------------");
            }
        }
    }
}
