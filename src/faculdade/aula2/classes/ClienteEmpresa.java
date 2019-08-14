package faculdade.aula2.classes;

public class ClienteEmpresa extends Empresa{
    public void contribuicao(){
        System.out.println("compra produto");
    }
    public void recebeEmTroca(){
        System.out.println("produto");
    }
    public void valorGerado(){
        System.out.println("dinheiro");
    }
    public void chamaMet(){
        ClienteEmpresa cli = new ClienteEmpresa();
        System.out.println("Cliente da Empresa");
        System.out.print("ligacao com: ");
        System.out.println(getNomeEmpresa());
        System.out.print("mostrando nome: ");
        cli.setNomeFiliado("juan cliente");
        System.out.println(cli.getNomeFiliado());
        System.out.print("chamando metodo contribuicao: ");
        cli.contribuicao();
        System.out.print("chamando metodo recebe Em troca: ");
        cli.recebeEmTroca();
        System.out.print("chamando metodo valorGerado: ");
        cli.valorGerado();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
    }
}
