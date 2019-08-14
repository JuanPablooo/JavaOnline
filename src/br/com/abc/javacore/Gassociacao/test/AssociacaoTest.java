package br.com.abc.javacore.Gassociacao.test;

import br.com.abc.javacore.Gassociacao.classes.Aluno;
import br.com.abc.javacore.Gassociacao.classes.Local;
import br.com.abc.javacore.Gassociacao.classes.Professor;
import br.com.abc.javacore.Gassociacao.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno=new Aluno("juan",20);
        Aluno aluno1=new Aluno("joao",24);
        Seminario sem = new Seminario("como ser um programador foda");
        Professor prof = new Professor("Wilian Suanne","doutorado em ensino");
        Local locals = new Local("Rua Regina Lucia","KM 18");
        aluno.setSeminario(sem);
        aluno.imprimeAluno();

        sem.setProfessor(prof);
        sem.setLocaliza(locals);
        sem.setAlunos(new Aluno[]{aluno,aluno1});
        Seminario[] semAray = new Seminario[1];
        semAray[0]=sem;
        prof.setSeminariosProf(semAray);
        prof.imprimeProfessor();
        sem.imprimeSemina();

    }

}
