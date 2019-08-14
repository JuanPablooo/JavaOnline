package refazendo.exercico.classes;

public class Professor {
    private String nome;
    private String Especialidade;
    private Seminario[] seminarios;


    public Professor() {
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        Especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void mostraProfessor(){
        System.out.println("nome: " + this.nome);
        System.out.println("especialidade: " + this.Especialidade);
    }
    public void mostraProfessorDetalhado(){
        mostraProfessor();
        if (seminarios != null && seminarios.length!=0) {
            for(Seminario sem:this.seminarios){
                System.out.println("participa do seminario: " + sem.getTitulo());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(String especialidade) {
        Especialidade = especialidade;
    }
}
