package br.com.abc.introducao.controlefluxo;

public class ControleFluxo2 {
    public static void main(String[] args) {
        int idade = 14;
        String categoria;
        // nessa condição o primeiro resultado colocamos se a condição for verdadeira e a segunda se for falsa.
        // e ae colocamos um codigo que ele dentro do resultado do verdadeiro ou de falso ai ele faz mais uma verifição.
        categoria = idade > 18 ? "menor de idade": idade >= 15 && idade >18 ? "adolecente" : idade >=14 ? "menor 15" :"n"  ;
        System.out.println(categoria);
    }
}
