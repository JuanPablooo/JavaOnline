package faculdade.aula2.testes;

import faculdade.aula2.classes.Administra;
import faculdade.aula2.classes.Professor;

public class AbsTest {
    public static void main(String[] args) {
        Professor prof = new Professor("Goku",2500);
        Administra admin = new Administra("Lula",1500);
        System.out.println("mostrando o professor");
        System.out.println(prof.getNome());
        prof.contribuicao();
        System.out.println("recebe: "+prof.getSalario());
        prof.bonificaçaoo();
        System.out.println("salario com bonus");
        System.out.println(prof.getSalario());
        System.out.println("-=-=-=-=-=-=-=-");
        System.out.println("mostrando admin");
        System.out.println(admin.getNome());
        admin.contribuicao();
        System.out.println("recebe: "+admin.getSalario());
        admin.bonificaçaoo();
        System.out.println("salario com bonus");
        System.out.println(admin.getSalario());

    }


}
