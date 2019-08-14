package faculdade.paralelismo.classes;

public class TreinaThred extends Thread{
    private String nome;
    private int tempo;
    public TreinaThred(String name,int time){
        this.nome=name;
        this.tempo=time;
        start();
    }

    @Override
    public void run() {

        for(int posi=0;posi<6;posi++){
            System.out.println(this.nome+" tenho o "+posi);
            try {
                Thread.sleep(tempo);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(nome+"terminei ");

        }


    }
}
