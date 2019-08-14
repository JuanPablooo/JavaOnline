package refazendo.sobrecargaConstrutores;

public class Loja {
    private String funcionario;
    private String mercadoria;
    private String clientes;

    public Loja(String funci, String mercadoriaa){
        this.funcionario = funci;
        this.mercadoria = mercadoriaa;
    }

    public Loja(String fun, String mercadoriaa, String clientess){
        this(fun, mercadoriaa);
        this.clientes = clientess;
    }

    public Loja(){

    }


    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getMercadoria() {
        return mercadoria;
    }

    public void setMercadoria(String mercadoria) {
        this.mercadoria = mercadoria;
    }

    public String getClientes() {
        return clientes;
    }

    public void setClientes(String clientes) {
        this.clientes = clientes;
    }
}
