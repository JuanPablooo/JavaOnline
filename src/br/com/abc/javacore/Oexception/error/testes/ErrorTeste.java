package br.com.abc.javacore.Oexception.error.testes;

public class ErrorTeste {
    public static void main(String[] args) {
        stackOverflowError();
    }
    public static void stackOverflowError(){
        stackOverflowError();
    }
}
