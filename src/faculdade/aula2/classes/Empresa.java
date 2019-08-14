package faculdade.aula2.classes;

public abstract class Empresa {
    protected String nomeEmpresa = "JUANRICASSO";
    protected String nomeFiliado;


    public abstract void contribuicao();
    public abstract void recebeEmTroca();
    public abstract void valorGerado();
    public abstract void chamaMet();

    public String getNomeEmpresa(){
        return this.nomeEmpresa;
    }
    public void setNomeEmpresa(String name){
        this.nomeEmpresa=name;

    }
    public String getNomeFiliado(){
        return this.nomeFiliado;
    }
    public void setNomeFiliado(String names){
        this.nomeFiliado=names;
    }
}
