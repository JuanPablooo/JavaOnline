package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Estudante;

import java.util.Scanner;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        int idade; String nome;  double nota1, nota2, nota3;
        Scanner digite = new Scanner(System.in);

        System.out.println("digite a idade");
        estudante.setIdade(digite.nextInt());

        System.out.println("digite o nome");
        estudante.setNome(digite.next());

        System.out.println("digite a primeira nota");
         nota1 = digite.nextInt();
        System.out.println("digite a segunda nota");
        nota2 = digite.nextInt();
        System.out.println("digite a ultima nota");
        nota3 = digite.nextInt();
        estudante.setNotas(new double[]{nota1, nota2, nota3});
        estudante.mostraatributos();
        System.out.println(estudante.getIdade());

        System.out.println(estudante.getNome());
        System.out.println(estudante.isAprovado());
    }


}
