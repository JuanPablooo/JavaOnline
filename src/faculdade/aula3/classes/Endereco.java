package faculdade.aula3.classes;

public class Endereco {
    private Faculdade faculdade;
    private Aluno[] alunos;
    private Professor[] professores;

    public Endereco() {
    }

    public Endereco(Faculdade faculdade, Aluno[] alunos, Professor[] professores) {
        this.faculdade = faculdade;
        this.alunos = alunos;
        this.professores = professores;
    }

    public Faculdade getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(Faculdade faculdade) {
        this.faculdade = faculdade;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
