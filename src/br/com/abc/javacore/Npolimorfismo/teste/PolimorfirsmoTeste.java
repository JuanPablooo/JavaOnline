package br.com.abc.javacore.Npolimorfismo.teste;

import br.com.abc.javacore.Npolimorfismo.classes.Funcionario;
import br.com.abc.javacore.Npolimorfismo.classes.Gerente;
import br.com.abc.javacore.Npolimorfismo.classes.RelatorioPagamento;
import br.com.abc.javacore.Npolimorfismo.classes.Vendedor;

public class PolimorfirsmoTeste {
    public static void main(String[] args) {
        Gerente g = new Gerente("naldo", 5000, 2000);
        Vendedor v = new Vendedor("yuri", 2000, 20000);
        RelatorioPagamento relatorio = new RelatorioPagamento();
//        relatorio.relatorioPagamentoGerente(g);
//        System.out.println("--------");
//        relatorio.relatorioPagamentoVendedor(v);

        //Funcionario f = g;
        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("-----------");
        relatorio.relatorioPagamentoGenerico(v);



//        System.out.println("-=-=-=-=-=-=-=-=-=-=");
//        Funcionario f = g;
//        relatorio.relatorioPagamentoGenerico(f);
//        System.out.println("------");
//        f = v;
//        relatorio.relatorioPagamentoGenerico(f);

    }
}
