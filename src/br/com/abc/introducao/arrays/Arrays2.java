package br.com.abc.introducao.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        String[] nomes = new String[2];
        nomes[0] = "juan";
        nomes[1] = "maria";
        for(int pos = 0 ; pos <nomes.length; pos++){
            System.out.println(nomes[pos]);
        }

    }
}
