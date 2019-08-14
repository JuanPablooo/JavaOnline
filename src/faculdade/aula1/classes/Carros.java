package faculdade.aula1.classes;

public class Carros extends Veiculos {
    private String marchas;
    private String cor;

    public Carros (){
        super("BMW","FLEX","4 portas");
        marchas="5 ";
        cor="preta";
    }
    public Carros (String marcha,String corr){
        super("BMW","FLEX","4 portas");
        this.marchas= marcha;
        this.cor=corr;
    }
    public void imprimeCarros(){
        System.out.println("tem "+getMarchas()+" marchas");
        System.out.println("a cor é "+getCor());
    }

    public String getMarchas() {
        return marchas;
    }

    public void setMarchas(String marchas) {
        this.marchas = marchas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
