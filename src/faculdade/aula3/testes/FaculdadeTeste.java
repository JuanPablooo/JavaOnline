package faculdade.aula3.testes;

import faculdade.aula3.classes.Aluno;
import faculdade.aula3.classes.Faculdade;
import faculdade.aula3.classes.Materia;
import faculdade.aula3.classes.Professor;

public class FaculdadeTeste {
    public static void main(String[] args) {
        Faculdade faculdade = new Faculdade("Fatec");

        Materia materia = new Materia("programaçao");
        Professor prof = new Professor("Sandra");
        prof.setMaterias(new Materia[]{materia});
        Aluno al= new Aluno("juan");
        al.imprimeAluno();
        prof.imprimeProfessor();

    }



}
