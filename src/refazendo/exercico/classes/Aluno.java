package refazendo.exercico.classes;

public class Aluno {
    private Seminario seminario;
    private String nome;
    private int idade;


    public Aluno(){
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(Seminario seminario, String nome, int idade) {
        this.seminario = seminario;
        this.nome = nome;
        this.idade = idade;
    }

    public void mostraAluno(){
        System.out.println("--------");
        System.out.println("nome: " + this.nome);
        System.out.println("idade: " + this.idade);

    }
    public void mostraAlunoDetalhes(){
        mostraAluno();
        if (this.seminario != null){
            System.out.println("seminario: " + this.seminario.getTitulo());
        }
        else {
            System.out.println("nenhum seminario encontrado");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
