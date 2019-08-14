package faculdade.aula3.classes;

public class Aluno {
    private Curso curso;
    private String nome;


    public Aluno() {
    }

    public Aluno(String nome) {
        this.nome = nome;

    }
    public void imprimeAluno(){
        System.out.println("nome: "+this.nome);
        if(this.curso != null){
            System.out.println("cursando"+this.curso.getNome());
        }else {
            System.out.println("nenhum curso encontrado");
        }
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
