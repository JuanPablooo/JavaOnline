package refazendo.modificadorEstatico;

public class TestaCarro {



    public static void main(String[] args) {

        Carro car = new Carro("golzinho",140);
        Carro car2 = new Carro("celta",120);
        Carro car3 = new Carro("uno",150);


        car.ImprimeCarro();
        car2.ImprimeCarro();
        car3.ImprimeCarro();

        Carro.setVelocidadeLimite(100);

        System.out.println("------------------");
        car.ImprimeCarro();
        car2.ImprimeCarro();
        car3.ImprimeCarro();


    }


}
