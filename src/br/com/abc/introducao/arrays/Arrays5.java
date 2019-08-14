package br.com.abc.introducao.arrays;

public class Arrays5 {
    public static void main(String[] args){
        int[][] dias =new int[2][2];
        dias [0][0] = 30;
        dias [0][1] = 31;
        dias [1][0] = 29;
        dias [1][1] = 28;
        int cont = 0;
        for (int indarray = 0; indarray<dias.length; indarray++){
            cont++;
            System.out.println("no mes "+cont+" temos");
            for (int pegadia=0; pegadia < dias[indarray].length; pegadia++ ){
                if (pegadia==0){
                    System.out.println("o mes "+pegadia+1+" com "+dias[indarray][pegadia]+" dias");
                }else {
                    System.out.println("e o mes "+pegadia+1+" com "+dias[indarray][pegadia]+" dias");
                    System.out.println("-=");
                }

            }
        }
         for (int[] pegames : dias){
             for (int pegday :pegames){
                 System.out.println(pegday);
             }
         }
    }
}
