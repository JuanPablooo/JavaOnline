package faculdade.aula2.classes;

public class ClienteEspecial extends ClienteEmpresa {
    public void contribuicao(){
        System.out.println("compra varios produtos");
    }
    public void recebeEmTroca(){
        System.out.println("produtos");
    }
    public void valorGerado(){
        System.out.println("bastante dinheiro");
    }
    public void chamaMet(){
        ClienteEspecial clie = new ClienteEspecial();
        System.out.println("Cliente Especial da Empresa");
        System.out.print("ligacao com: ");
        System.out.println(getNomeEmpresa());
        System.out.print("mostrando nome: ");
        clie.setNomeFiliado("juan cliente ESPECIAL");
        System.out.println(clie.getNomeFiliado());
        System.out.print("chamando metodo contribuicao: ");
        clie.contribuicao();
        System.out.print("chamando metodo recebe Em troca: ");
        clie.recebeEmTroca();
        System.out.print("chamando metodo valorGerado: ");
        clie.valorGerado();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
    }
}
