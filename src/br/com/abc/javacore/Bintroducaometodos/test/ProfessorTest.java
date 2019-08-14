package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Professor;
//variaveis tipo primitivos sao "numericas"    , variaveis de referencia sao strings
// variaveis do tipos primitivos passam "copias" do valor para os eventos e por isso se o valor sofrer uma alteração no evento
// essa alteração so mostrada na tela ou implementada durante a execução do evento, quando retornada para a classe onde se iniciou
// a execução a variavel retoma o valor anterior, na verdade ela continua com o valor que foi definido na classe principal
// e o valor atribuido no evento deixa de existir

// no caso das variaveis de referencia esse valor é alterado até mesmo na execução na classe principal
public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "155.197.426-69";
        prof.matricula = "888.999.777";
        prof.nome = "Mario";
        prof.rg = "255.2018";
        prof.imprime();
        System.out.println("-=-=-=-==-=-=-=-=-=-=--=");

        Professor prof2 = new Professor();
        prof2.cpf = "00155.197.426-69";
        prof2.matricula = "00888.999.777";
        prof2.nome = "Mari00o";
        prof2.rg = "255.002018";
        prof2.imprime();
        System.out.println("xxxxxxxxxxxx");
        System.out.println(prof.nome);


    }
}
