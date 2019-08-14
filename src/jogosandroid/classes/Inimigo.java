package jogosandroid.classes;

public class Inimigo {
    float posicaox;
    float posicaoy;
    float vida;
    public Inimigo(float x, float y, float v) {
        posicaox = x;
        posicaoy = y;
        vida = v;
    }
    public void draw() {
        System.out.println("inimigo: " + posicaox + " " + posicaoy);
    }



    public void mover(float dx, float dy) {
        posicaoy += dy;
        posicaox += dx;
    }

    public boolean colider() {
        if(posicaoy >= 100){
            return true;
        } else {
            return false;
        }
    }
}
