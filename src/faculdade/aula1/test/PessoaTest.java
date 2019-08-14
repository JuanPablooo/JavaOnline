package faculdade.aula1.test;

import faculdade.aula1.classes.Fisicas;
import faculdade.aula1.classes.Juridica;

public class PessoaTest {
    public static void main(String[] args) {
        Juridica jurid = new Juridica();
        Fisicas fisic = new Fisicas();
        jurid.imprimeJuridica();
        jurid.imprime();
        System.out.println("######");
        System.out.println("agora o fisica");
        fisic.imprimeFisica();
        fisic.imprime();
    }

}
