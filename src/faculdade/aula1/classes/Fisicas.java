package faculdade.aula1.classes;

public class Fisicas extends Pessoa {
    private String rg,cpf,celular;
    public Fisicas(){
        super(155,"juan","rua regina");
        cpf ="155";
        rg = "9999";
        celular = "11988";
    }
    public Fisicas (String rg,String cpf, String celular) {
        rg= rg;
        cpf=cpf;
        celular = celular;
    }
    public Fisicas(Fisicas x){
        cpf = x.cpf;
        rg = x.rg;
        celular = x.celular;
    }
    public void imprimeFisica(){
        System.out.println("--------------");
        System.out.println("cpf: "+this.cpf);
        System.out.println("rg: "+this.rg);
        System.out.println("celular "+this.celular);
    }
}
