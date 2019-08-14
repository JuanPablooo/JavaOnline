package br.com.abc.javacore.Uexpressoesregulares.teste;

public class Tokens {
    public static void main(String[] args) {
        String nomes = "juan, jose, maria, nonato";
        String nome[] = nomes.split(",");
        for (String nom: nome){
            System.out.println(nom.trim());
        }

    }
}
