package br.com.abc.javacore.Lclassesabstratas.teste;

import br.com.abc.javacore.Lclassesabstratas.classes.Funcionario;
import br.com.abc.javacore.Lclassesabstratas.classes.Gerente;
import br.com.abc.javacore.Lclassesabstratas.classes.Vendedor;

public class TestaFuncionario {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("messi", "88559-3", 999, 300);
        v.calculaSalario();
        System.out.println(v);
        Gerente g = new Gerente("naldo", "99988-2", 5000);
        g.calculaSalario();
        System.out.println(g);
    }
}
