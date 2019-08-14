package br.com.abc.javacore.Kenum.classes;

public enum TipoCliente {
    /*constantes do tipo enumerate servem para enumerar opcoes e deixarmenos responsabilidades para o usuario
    * nesse caso poderia deixar o usuario digitar o tipo de pessoa, mas preferi deixar pre determinado dois tipos
    * evitando possiveis cagadas dos usuarios
    * */
    PESSOA_FISICA(1, "Pessoa Fisica"), PESSOA_JURIDICA(2, "Pessoa Juridica"){
        // constanti specific body por padrao o metodo getId retorna A, nesse caso reescrevi o metodo de pessoa juridica
        // para retornar B (motivo didatico)
        public String getId(){
            return "B";
        }
    };

    private int tipo;
    private String nome;
    TipoCliente(int tipo, String nome){
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getId(){
        return "A";
    }
    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}

