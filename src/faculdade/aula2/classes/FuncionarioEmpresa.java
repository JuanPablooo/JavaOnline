package faculdade.aula2.classes;

public class FuncionarioEmpresa extends Empresa {


    public void contribuicao(){
        System.out.println("trabalha e sofre");
    }
    public void recebeEmTroca(){
        System.out.println("salario");
    }
    public void valorGerado(){
        System.out.println("produto");
    }
    public void chamaMet(){
        FuncionarioEmpresa fun = new FuncionarioEmpresa();
        System.out.println("Funcianario da Empresa");
        System.out.print("ligacao com: ");
        System.out.println(getNomeEmpresa());
        System.out.print("mostrando nome: ");
        fun.setNomeFiliado("juan Trabalhador");
        System.out.println(fun.getNomeFiliado());
        System.out.print("chamando metodo contribuicao: ");
        fun.contribuicao();
        System.out.print("chamando metodo recebe Em troca: ");
        fun.recebeEmTroca();
        System.out.print("chamando metodo valorGerado: ");
            fun.valorGerado();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
}


}
