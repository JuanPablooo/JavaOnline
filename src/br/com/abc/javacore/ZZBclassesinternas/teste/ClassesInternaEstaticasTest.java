package br.com.abc.javacore.ZZBclassesinternas.teste;

class Externa {
    private String nome = "juan";
    static class interna{
        void imprimir(){
            System.out.println("salve");
        }
    }
}
public class ClassesInternaEstaticasTest {
    public static void main(String[] args) {
        Externa.interna interna = new Externa.interna();
        interna.imprimir();
        Interna2 interna2 = new Interna2();
        interna2.imprimir();

    }
    static class Interna2{
        void imprimir(){
            System.out.println("salve doiiis");
        }
    }
}
