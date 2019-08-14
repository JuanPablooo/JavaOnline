package br.com.abc.javacore.Oexception.checkedexception.teste;

import br.com.abc.javacore.Oexception.customexception.LoguinInvalidoException;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try{
            logar();
        }catch (Exception e){
            System.out.println("fudeu");
            e.printStackTrace();
        }

    }

    private static void logar() throws LoguinInvalidoException {
        String loguinBancoDeDados = "Vegeta";
        String senhaBancoDeDados = "123";
        String loguinDigitado = "Vegeta";
        String senhaDigitada = "111";

        if (!loguinBancoDeDados.equals(loguinDigitado) || !senhaBancoDeDados.equals(senhaDigitada)) {
            throw new LoguinInvalidoException();
        }
        else {
            System.out.println("logado");
        }


    }

}
