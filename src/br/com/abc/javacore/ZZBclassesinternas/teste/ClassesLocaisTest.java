package br.com.abc.javacore.ZZBclassesinternas.teste;

public class ClassesLocaisTest {
    private String nome = "juan";
    public  void fazAlgumaCoisa(){
        class Interna{
            public void imprimeNomeExterno(){
                System.out.println(nome);
            }
        }
        System.out.println("fiz algo");
    }
    public static void main(String[] args) {
        ClassesLocaisTest classeLocal = new ClassesLocaisTest();
        classeLocal.fazAlgumaCoisa();
        // na se pode instanciar classes internas de metodos, apenas no proprio metodo
    }
}
