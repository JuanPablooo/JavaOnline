package faculdade.aula1.classes;

public class Avioes extends Veiculos {
    private String turbinas;
    private String tripulacao;
    public Avioes(){
        super("077","gasolina kkk","muito graande");
        turbinas = "duas turbinas";
        tripulacao="muitas pessoas";
    }
    public Avioes(String nom, String comb, String tip,String turbinass,String tripu){
        nomes = nom;
        combustiveeis= comb;
        tipos = tip;
        turbinas=turbinass;
        tripulacao = tripu;
    }
    public void imprimeAvioes(){
        System.out.println("turbunas: "+getTurbinas());
        System.out.println("tripulacao: "+getTripulacao());
    }

    public String getTurbinas() {
        return turbinas;
    }

    public void setTurbinas(String turbinas) {
        this.turbinas = turbinas;
    }

    public String getTripulacao() {
        return tripulacao;
    }

    public void setTripulacao(String tripulacao) {
        this.tripulacao = tripulacao;
    }
}
