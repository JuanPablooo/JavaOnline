package refazendo.associacao.testa;

import refazendo.associacao.classes.Pessoa;

public class Testa {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        System.out.println(p.getPessoass());
        p.setPessoass(p);
        System.out.println(p.getPessoass());
        p.setPessoass(null);
        System.out.println(p.getPessoass());
    }
}
