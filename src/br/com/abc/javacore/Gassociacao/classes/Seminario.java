package br.com.abc.javacore.Gassociacao.classes;


public class Seminario {
    private Aluno[] alunos;
    private Professor professor;
    private String titulo;
    private Local localiza;

    public Seminario(String titulos) {
        //this.alunos = alunos;
        // this.professor = professor;
        titulo = titulos;
    }

    public Seminario() {
    }
    public void imprimeSemina(){
        System.out.println("titulos: "+titulo);
        System.out.println("professor: "+professor.getNome());
        System.out.println("local:  "+this.localiza.getRua()+" "+this.localiza.getBairro());
        System.out.println("alunos");
        for(Aluno aluno:alunos){
            System.out.print(aluno.getNome()+" ");

        }
        System.out.println("\n");
    }
    public Local getLocaliza() {
        return localiza;
    }
    public void setLocaliza(Local localiza) {
        this.localiza = localiza;
    }
    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        titulo = titulo;
    }
}
