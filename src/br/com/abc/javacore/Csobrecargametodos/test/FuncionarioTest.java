package br.com.abc.javacore.Csobrecargametodos.test;

import br.com.abc.javacore.Csobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("juan", "155", "55555", 5000);
        Funcionario funcionario1 = new Funcionario();
        funcionario.imprime();
        System.out.println("depois");
        funcionario1.imprime();

    }

}

