package faculdade.aula1.classes;

public class Veiculos {
    protected String nomes, combustiveeis, tipos;

    public Veiculos(){
    }
    // constrtutor
    public Veiculos(String nome, String combustivel, String tipo){
        this.nomes = nome;
        this.combustiveeis = combustivel;
        this.tipos = tipo;
    }
    public void imprime(){
        System.out.println("o nome é: "+this.nomes);
        System.out.println("o combustivel é: "+this.combustiveeis);
        System.out.println("o tipo é: "+this.tipos);
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    public String getCombustiveeis() {
        return combustiveeis;
    }

    public void setCombustiveeis(String combustiveeis) {
        this.combustiveeis = combustiveeis;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }
}
