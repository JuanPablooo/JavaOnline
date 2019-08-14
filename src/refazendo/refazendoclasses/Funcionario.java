package refazendo.refazendoclasses;

import javax.xml.transform.sax.SAXResult;

public class Funcionario {
    private String nome;
    private String cpf;
    private String rg;
    private int idade;

    public void init(String nome,String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    public void init(String na,String cp,int ida,String rg){
        this.init(na,cp,ida);
        this.rg = rg;
    }
    public void imprimeFunc(String nme, String cpf,int idad ){
        System.out.println("-=-=-=-=-=-=-=-=-");
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.idade);
    }

    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setNome(String name){
        this.nome = name;
    }
    public void setCpf(String cp){
        this.cpf = cp;
    }
    public void setIdade(int idad){
        this.idade = idad;
    }
}
