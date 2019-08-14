package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Juan_professor";
        professor.matricula = 1998;
        professor.rg = 155197;
        professor.cpf = 1551974266;
        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.cpf);
        System.out.println(professor.rg);
        System.out.println("----------------------");
        Professor prof2 = new Professor();
        prof2.nome = "lobianco";
        prof2.cpf = 12345;
        prof2.rg = 987456;
        prof2.matricula = 951753;
        System.out.println(prof2.nome);
        System.out.println(prof2.matricula);
        System.out.println(prof2.cpf);
        System.out.println(prof2.rg);
        professor = prof2;
        System.out.println(professor.nome);
    }
}
