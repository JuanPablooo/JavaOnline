package faculdade.aula3.classes;

public class Faculdade {
    private String nome;
    private Sala[] salas;
    private Curso[] cursos;
    private Endereco endereco;

    public Faculdade() {
    }

    public Faculdade(String nome) {
        this.nome = nome;
    }

    public Faculdade(String name, Sala[] salas, Curso[] cursos, Endereco endereco) {
        this.nome= name;
        this.salas = salas;
        this.cursos = cursos;
        this.endereco = endereco;
    }
    public void imprimeFaculdade(){
        System.out.println("-=-=-=-=-=-relatorio faculdade-=-=-=-=-=-=-");
        System.out.println("nome: "+this.nome);
        System.out.println("salas");
        for(Sala sal:salas){
            System.out.print(sal.getNome()+" ");
        }
        System.out.println("cursos");
        for(Curso cur: cursos){
            System.out.print(cur.getNome()+" ");
        }
        System.out.println("endereço: "+this.endereco);
    }

    public Sala[] getSalas() {
        return salas;
    }

    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
