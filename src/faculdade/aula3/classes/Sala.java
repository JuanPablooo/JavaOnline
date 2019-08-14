package faculdade.aula3.classes;

public class Sala {
    private String nome;
    private Materia materia;
    private Professor professor;
    private Aluno[] alunos;

    public Sala() {
    }

    public Sala(String name,Materia materia, Professor professor, Aluno[] alunos) {
        this.nome=name;
        this.materia = materia;
        this.professor = professor;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
