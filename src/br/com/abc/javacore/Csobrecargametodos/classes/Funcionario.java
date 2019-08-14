package br.com.abc.javacore.Csobrecargametodos.classes;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String rg;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
        System.out.println(this.rg);
    }
    public void setNome(String nome){
       this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public void setRg(String rg){
        this.rg = rg;
    }
    public String getRg(String rg){
        return this.rg = rg;
    }
    public String getNome (){
        return this.nome = nome;
    }
    public String getCpf (){
        return this.cpf = cpf;
    }
    public double getSalario (){
        return this.salario = salario;
    }
    public Funcionario(String nome,String cpf, String rg, double salario){
     this.nome = nome;
     this.cpf = cpf;
     this.rg = rg;
     this.salario = salario;
    }
    public Funcionario (){

    }
    public void init(String nome, String cpf,String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }
    public void init(String nome, String cpf,String rg, double salario){
        init(nome,cpf,rg);
        this.salario = salario;
    }
}
