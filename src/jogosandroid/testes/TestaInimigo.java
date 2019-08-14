package jogosandroid.testes;

import jogosandroid.classes.Inimigo;

public class TestaInimigo {
    public static void main(String[] args) {
        Inimigo inimigo1 = new Inimigo(10, 20, 0);
        inimigo1.draw();
        inimigo1.mover(10,100);
        System.out.println("colisao: "+inimigo1.colider());
        Inimigo inimigo = new Inimigo(10,30,50);
        inimigo.draw();
        inimigo.mover(10,40);
        System.out.println("colisao: "+inimigo.colider());
    }
}
