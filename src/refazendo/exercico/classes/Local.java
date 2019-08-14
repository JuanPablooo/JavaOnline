package refazendo.exercico.classes;

public class Local {
    private String rua;
    private String bairro;

    public String getRua() {
        return rua;
    }

    public void mostraLocal(){
        System.out.println("rua: " + this.getRua());
        System.out.println("bairro: " + this.getBairro());

    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
