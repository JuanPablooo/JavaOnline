package br.com.abc.javacore.Bintroducaometodos.classes;
public class Calculadora {
    public void somaDoisNumeros (){
        System.out.println(5+5);
    }public void subtraiDoisNumeros(){
        System.out.println(15-5);
    }
    public void multiplicaDoisNumeros(int num, int num2){
        System.out.println(num*num2);
    }
    public double divideDoisNumeros (double num1, double num2){
        if (num2 !=0){
            return (int) num1 / num2;
        }
        return 0;
    }
    public void imprimeDoisNumerosDivididos (int num1, int num2 ){
        if (num2 !=0){
            System.out.println(num1/num2);
            return;
        }else {
            System.out.println("nao pode ");
        }
    }
    public void alteraDoisNumeros (int num1, int num2){
        num1 = 30;
        num2 = 40;
        System.out.println("dentro do parame");
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
    }
    public void somaArray (int[] valor){
        int soma = 0;
        for (int num :valor){
            soma +=num;
        }
        System.out.println(soma);
    }public void somargs (double n1, int... x){

        for(int zer:x){
            n1+=zer;
        }
        System.out.println(n1);
    }
}
