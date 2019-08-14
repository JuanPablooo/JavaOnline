package br.com.abc.javacore.Gassociacao.classes;

public class Professor {
    private Seminario[] seminariosProf;
    private String nome;
    private String especializacao;

    public Professor( String nome, String especializacao) {
        //this.seminariosProf = seminariosProf;
        this.nome = nome;
        this.especializacao = especializacao;
    }

    public Professor() {
    }
    public void imprimeProfessor(){
        System.out.println("nome: "+this.nome);
        System.out.println("especializacao: "+this.especializacao);
        if (seminariosProf.length>= 1){
            for (Seminario sem: seminariosProf){
                System.out.println("titulo seminario: "+sem.getTitulo());
            }
        }else {
            System.out.println("nao temos seminarios");
        }
        System.out.println("-=-=-=-==-=-=-=-");
    }

    public Seminario[] getSeminariosProf() {
        return seminariosProf;
    }

    public void setSeminariosProf(Seminario[] seminariosProf) {
        this.seminariosProf = seminariosProf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
}
