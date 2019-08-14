package br.com.abc.javacore.Fmodificadorestatico.test;

import br.com.abc.javacore.Fmodificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Cliente cliente1 = new Cliente();
        Cliente c = new Cliente();
        System.out.println("\nexibindo parcelas");
        for(int parcela:cliente.getParcelas()){
            System.out.print(parcela+" ");
            if(parcela==50){
                System.out.println("\n");
            }
        }
    }
}
