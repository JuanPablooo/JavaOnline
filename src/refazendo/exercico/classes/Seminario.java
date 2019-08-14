package refazendo.exercico.classes;

public class Seminario {
    private Aluno[] alunos;
    private Professor professor;
    private Local local;
    private String titulo;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void mostraSeminario(){
        System.out.println("mostrando seminario");
        System.out.println("titulo: " + this.titulo);
        if (this.alunos!= null && this.alunos.length !=0){
            System.out.println("=-=-=-=-mostrando alunos=-=-=-=-=");
            for(Aluno alun: this.alunos){
                alun.mostraAluno();
            }
        }
        else {
            System.out.println("nenhum aluno no seminario");
        }


        System.out.println("=-=-=-=-=- professor =-=-=-=-=-=");
        professor.mostraProfessor();
        System.out.println("=-=-= no local =-=--==-=");
        if (local!=null){
            this.local.mostraLocal();
        }
        else
            System.out.println("nenhum local cadastrado");






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

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
