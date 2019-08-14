package faculdade.aula2.classes;


public class GerenteEmpresa extends FuncionarioEmpresa {

    public void contribuicao(){
        System.out.println("manda todos");
    }
    public void recebeEmTroca(){
        System.out.println("salario maior");
    }
    public void valorGerado(){
        System.out.println("gerenciamento");
    }
    public void respondendo(){
        System.out.println("voce nao me perguntou nada ");
    }
    public void respondendo(String elogiando){
        System.out.println("valeu ai, mas voce nao vai ganhar aumento");
    }
    public void respondendo(int salario, String name){
        System.out.println(name+"acho que voce merece é "+salario+"a menos em ");
    }
    public void chamaMet(){
        GerenteEmpresa func = new GerenteEmpresa();
        System.out.println("Gerente da Empresa");
        System.out.print("ligacao com: ");
        System.out.println(getNomeEmpresa());
        System.out.print("mostrando nome: ");
        func.setNomeFiliado("juan Gerente");
        System.out.println(func.getNomeFiliado());
        System.out.print("chamando metodo contribuicao: ");
        func.contribuicao();
        System.out.print("chamando metodo recebe Em troca: ");
        func.recebeEmTroca();
        System.out.print("chamando metodo valorGerado: ");
        func.valorGerado();
        func.respondendo();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
    }
    public void chamaMet(String elogiando){
        GerenteEmpresa func = new GerenteEmpresa();
        System.out.println("Gerente da Empresa");
        System.out.print("ligacao com: ");
        System.out.println(getNomeEmpresa());
        System.out.print("mostrando nome: ");
        func.setNomeFiliado("juan Gerente");
        System.out.println(func.getNomeFiliado());
        System.out.print("chamando metodo contribuicao: ");
        func.contribuicao();
        System.out.print("chamando metodo recebe Em troca: ");
        func.recebeEmTroca();
        System.out.print("chamando metodo valorGerado: ");
        func.valorGerado();
        func.respondendo(elogiando);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
    }   public void chamaMet(int salario, String name){
        GerenteEmpresa func = new GerenteEmpresa();
        System.out.println("Gerente da Empresa");
        System.out.print("ligacao com: ");
        System.out.println(getNomeEmpresa());
        System.out.print("mostrando nome: ");
        func.setNomeFiliado("juan Gerente");
        System.out.println(func.getNomeFiliado());
        System.out.print("chamando metodo contribuicao: ");
        func.contribuicao();
        System.out.print("chamando metodo recebe Em troca: ");
        func.recebeEmTroca();
        System.out.print("chamando metodo valorGerado: ");
        func.valorGerado();
        func.respondendo(salario,name);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
    }



}
