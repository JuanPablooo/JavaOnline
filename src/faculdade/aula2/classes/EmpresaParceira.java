package faculdade.aula2.classes;

public class EmpresaParceira extends Empresa {
    public void contribuicao(){
        System.out.println("fornecer pecas para producao do produto");
    }
    public void recebeEmTroca(){
        System.out.println("dinheiro ");
    }
    public void valorGerado(){
        System.out.println("aceleracao de producao");
    }
    public void chamaMet(){
        EmpresaParceira em = new EmpresaParceira();
        System.out.println("Empresa Parceira");
        System.out.print("ligacao com: ");
        System.out.println(getNomeEmpresa());
        System.out.print("mostrando nome: ");
        em.setNomeFiliado("juan parceiro");
        System.out.println(em.getNomeFiliado());
        System.out.print("chamando metodo contribuicao: ");
        em.contribuicao();
        System.out.print("chamando metodo recebe Em troca: ");
        em.recebeEmTroca();
        System.out.print("chamando metodo valorGerado: ");
        em.valorGerado();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
    }
}
