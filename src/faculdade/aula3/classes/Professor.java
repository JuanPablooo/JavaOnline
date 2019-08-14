package faculdade.aula3.classes;

public class Professor {
    private Materia[] materias;
    private String nome;

    public Professor() {
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(Materia[] materias, String nome) {
        this.materias = materias;
        this.nome = nome;
    }
    public void imprimeProfessor(){
        System.out.println("-=-=-=relatotio professor");
        System.out.println("nome: "+this.nome);
        System.out.println("apto a dar aula em");
        for(Materia mater: materias){
            System.out.println(mater.getNome());
        }
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
