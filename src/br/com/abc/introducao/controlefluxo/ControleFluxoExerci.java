package br.com.abc.introducao.controlefluxo;

public class ControleFluxoExerci {
    public static void main(String[] args ){
        int salario = 2500;
        System.out.println("seu salario é "+ salario+ " reais");
        if (salario <1000){
            salario = salario-(salario*5/100);
        } else if (salario>=1000 && salario < 2000){
            salario = salario - (salario*10/100);
        }else if (salario >= 2000 && salario <= 4000){
            salario = salario - (salario*15/100);
        }else if (salario > 4000){
            salario = (salario - (salario*20/100));
        }
        System.out.println("seu salario com reajuste é "+salario+" reais");
    }
}
