package br.com.abc.introducao.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int[] quantidade = new int[]{3, 2, 1};
        for (int pos=0; pos<quantidade.length; pos++){
            System.out.println(quantidade[pos]);
        }for (int posi : quantidade){
            System.out.println(posi);
        }
    }
}
