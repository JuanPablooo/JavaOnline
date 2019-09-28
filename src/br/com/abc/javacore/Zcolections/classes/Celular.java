package br.com.abc.javacore.Zcolections.classes;

public class Celular {
    private String nome;
    private String IMEI;

    /*
    para fazer um metodo equals de uma classe e interessante usar um atributo unico, se for com algo do banco
    utilizar o id
     */
    public Celular(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }

    /*
    reflexivo : x.equals(x) tem que ser true para tudo que nao for null
    simetrico : para x e y diferente de null, se x.equals(y) == true logo y.equals(x) tem que ser true
    transitividade: para x, y, z diferente de null, se x.equals(y) == true e y.equals(z) == true logo x.equals(z)
    tabem e true
    consistente: x.equals(y) deve sempre retornar o mesmo valor (metodo pura > responsabilidade unica)
    se : x != null entao x.equals(null) tem que retornar igual a false
    HASCODE
         o hascode e um metodo que utiliza a tabela has de alto desempenho
         pesquisar imagens(complicado de escrever)
     devemos o usar o mesmo atributo do metodo equals no metodo hascode pois
     se x.equals(y) == true; logo y.hasCode() == x.hasCode() == true ;
     ter o hascode igual nao se]iguinifica que sao iguals perante ao metodo equals
     por que um nome diferente pode ter o mesmo hasCode (olhar imagem tabela has)
     */


    @Override
    public int hashCode() {
        return IMEI != null ? IMEI.hashCode() : 1;
    }

    @Override
    public boolean equals(Object obj){
         if(obj == null) return false; // se vier null, ja retorna falso
         if(this == obj) return true;  // se o valor for igual retorna true

         if(this.getClass() != obj.getClass()) return false; // se nao forem da mesma classe retorna false
         Celular outroCelular = (Celular) obj; // se chegar aqui e pq e um celular, entao vamos jogar em uma variavel
        return IMEI != null && IMEI.equals(outroCelular.getIMEI());
    }


    @Override
    public String toString() {
        return "Celular{" +
                "nome='" + nome + '\'' +
                ", IMEI='" + IMEI + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
}
