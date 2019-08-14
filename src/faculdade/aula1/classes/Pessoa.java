package faculdade.aula1.classes;

public class Pessoa {
    protected int identificador;
    protected String nome, endereco;

    public Pessoa(){
        identificador = 0;
        nome = "0";
        endereco = "ABC";
    }
    public Pessoa(int identificado,String nomes,String enderecos){
        identificador = identificado;
        nome=nomes;
        endereco=enderecos;

    }
    public Pessoa(Pessoa p){
        identificador= p.identificador;
        nome=p.nome;
        endereco=p.endereco;
    }
    public void imprime(){
        System.out.println("nome: "+this.nome);
        System.out.println("id: "+this.identificador);
        System.out.println("ender: "+this.endereco);
    }
}
