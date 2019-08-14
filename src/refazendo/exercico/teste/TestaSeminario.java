package refazendo.exercico.teste;

import refazendo.exercico.classes.Aluno;
import refazendo.exercico.classes.Local;
import refazendo.exercico.classes.Professor;
import refazendo.exercico.classes.Seminario;

public class TestaSeminario {

    public static void main(String[] args) {
        Seminario seminario = new Seminario("educacao sexual");
        Seminario seminario1 = new Seminario("ideologia de genero");


        Aluno aluno = new Aluno(seminario,"juan", 20 );
        Aluno aluno1 = new Aluno(seminario, "jose", 19);
        Aluno[] alunos = {aluno, aluno1};
        seminario.setAlunos(alunos);

        Professor prof = new Professor("girafales","java", new Seminario[]{seminario, seminario1});


        Local local = new Local();
        local.setBairro("km 18");
        local.setRua("safadez sampaio");
        seminario.setLocal(local);




        seminario.setProfessor(prof);


        seminario.mostraSeminario();
        System.out.println("--------------------- alunos ------------");
        aluno.mostraAlunoDetalhes();
        System.out.println("---------- professores--------- ");
        prof.mostraProfessorDetalhado();





    }
}
