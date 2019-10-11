package br.com.abc.javacore.ZZBclassesinternas.teste;

public class ClassesInternasTest {
    private String nome = "Juan Pablo Gomes Pereira";

    class Interna{
        private String subnome = "sube nome";
        public void verClassesExterna(){
            System.out.println(nome);
            System.out.println(this); // o this refencia a classe mais proxima, neste caso a interna
            System.out.println(ClassesInternasTest.this); // aqui temos o this da classe superior
        }

    }

    public static void main(String[] args) {

        ClassesInternasTest internasTest = new ClassesInternasTest();

        ClassesInternasTest.Interna in = internasTest.new Interna();
        in.verClassesExterna();

    }
}
