package br.com.abc.introducao.controlefluxo;

public class ControleDeFluxo {
    public static void main(String[] args) {
        int idade = 19;
        String categoria;
        if (idade < 10) {
            categoria = " menor que 10";
        } else {
            categoria = "maior que dez";
        }
        System.out.println(categoria);
    }
}
