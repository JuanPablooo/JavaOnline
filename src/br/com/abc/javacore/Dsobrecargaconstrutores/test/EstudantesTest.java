package br.com.abc.javacore.Dsobrecargaconstrutores.test;

import br.com.abc.javacore.Dsobrecargaconstrutores.classes.Estudantes;

public class EstudantesTest {
    public static void main(String[] args) {
        Estudantes estudant = new Estudantes("juan","1999",new double[]{7,6,5},"10/5/2019");
        estudant.imprimir();
    }
}
