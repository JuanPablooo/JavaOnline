package br.com.abc.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {

//    public void relatorioPagamentoGerente(Gerente gerente){
//        System.out.println("gerando relatorio de pagamento para a gerencia");
//        gerente.calcularPagamento();
//        System.out.println("nome: "+gerente.getNome());
//        System.out.println("salario desse mes: "+gerente.getSalario());
//    }
//
//    public void relatorioPagamentoVendedor(Vendedor vendedor){
//        System.out.println("relatorio de pagamento dos vendedores");
//        vendedor.calcularPagamento();
//        System.out.println("nome: "+vendedor.getNome());
//        System.out.println("salario deste mes: "+vendedor.getSalario());
//    }

    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("gerando relatorio de pagamento");
        funcionario.calcularPagamento();
        System.out.println("nome: "+funcionario.getNome());
        System.out.println("salario deste mes: " + funcionario.getSalario());

        // verifica se a instancia e do tipo gerente gerente e filha de funcionario ou seja, tambem e do tipo funcionario
        // entao podemos mandar um objeto do tipo gerente, onde estiver pedindo um objeto do tipo funcionario
        // pq gerente e um funcionario, se podemos passar um gerente como funcionario, podemos verificar
        // se o objeto passado e realmente um gerente.
        if (funcionario instanceof Gerente){
            Gerente g = (Gerente) funcionario;
            System.out.println("participacao nos lucros: "+g.getPnl());
        }
        else if (funcionario instanceof Vendedor){
            System.out.println("total vendas: "+((Vendedor) funcionario).getTotalVendas());
            System.out.println(funcionario);
        }

    }

}
