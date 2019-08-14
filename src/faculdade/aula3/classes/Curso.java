package faculdade.aula3.classes;

public class Curso {
    private String nome = "Jogos Digitais";
    private Materia[] materias;
    private Sala[] salas;

    public Curso() {
    }

    public Curso(Materia[] materias, Sala[] salas) {
        this.materias = materias;
        this.salas = salas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }

    public Sala[] getSalas() {
        return salas;
    }

    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }
}
