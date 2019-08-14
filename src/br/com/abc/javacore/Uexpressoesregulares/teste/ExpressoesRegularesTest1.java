package br.com.abc.javacore.Uexpressoesregulares.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest1 {
    public static void main(String[] args) {
        /*
        \d todos os digitos (numero)
        \D tudo que nao for digito
        \s todos espacos em branco
        \S tudo que nao for espaco em branco
        \w carateres de palavras a-z, A-Z, digitos e _
        \W tudo que nao for caracter
        QUANTIFICADORES (quando vc tem que procurar uma ou mais ocorrencia de determinada expressao)
        ? zero ou uma
        * zero ou mais
        + uma ou mais
        {n,m} customizada a partir de um numero nesse caso de n ate m
        ( ) eh utilizado para agrupar uma expressao
        | sinal de ou
        $ final de linha
        o(v|c)o aqui ele encontraria dois valores validos ovo ou aco
        . coringa ex 1.3 assim ele vai devolver tudo que tiver 1(alguma coisa) 3 tipo 123 143 1-3
        ^ negacao quero tao coisa menos ^,

         */

//
//        String regex = "([\\w\\.])+@([a-zA-Z])+(\\.([a-zA-Z])+){2}";
//        String texto = "juan@hotmail.com, koliu@email.com.hod.com, ploo@email.com.br";

//        String regex ="\\d{2}/\\d{2}/\\d{2,4}";
//        String texto = "05/10/1998 02/23/9728 ";

        String regex = "\\d{2}/\\d{2}/\\d{2,4}";
        String texto = "05/10/1998 02/23/9728 ";


        // esse objeto guarda o padrao a (caracter) ser procurado
        Pattern pattern = Pattern.compile(regex);
        // esse objeto vai guardar o texto que sera pesquisado/vasculhado a procura do padrao/caracter(s) desejados
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice: 01234567890123456789");
        System.out.println("expressao: " + matcher.pattern());
        System.out.println("posicoes encontradas");

        /*
        o find procura o padrano dentro do texto instaciado, porem, quando encontra o padrao, ele vai
        procurar apos o indice que participa do padrao ex: se estiver procurando
        as letra ara palavra arara ele ira devolver apenas o indice 0, porque o segundo "a" faz parte do padrao
        e nao sera considerado na proxima busca
         */
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }


    }
}
