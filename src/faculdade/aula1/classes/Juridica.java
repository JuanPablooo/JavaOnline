package faculdade.aula1.classes;

public class Juridica extends Pessoa {
    private String cnpj;

    public Juridica(){
        super(9999, "empresajuan","paulista");
        cnpj = "66583";
    }

    public Juridica(String cnpf){
        cnpj = cnpf;
    }
    public Juridica(Juridica x){
        cnpj=x.cnpj;
    }
    public void imprimeJuridica(){
        System.out.println("--------");
        System.out.println("cnpj: "+cnpj);
    }

}
