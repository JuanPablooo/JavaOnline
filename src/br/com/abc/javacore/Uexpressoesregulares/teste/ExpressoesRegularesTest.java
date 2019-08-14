package br.com.abc.javacore.Uexpressoesregulares.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {
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


         */

        String regex1 = "\\w1";
        String regex2 = "[a-b A-Z]";
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";

        String texto = "12 0x 0X 0x01FFABC 0x10G 0x1";
        // esse objeto guarda o padrao a (caracter) ser procurado
        Pattern pattern = Pattern.compile(regex);
        // esse objeto vai guardar o texto que sera pesquisado/vasculhado a procura do padrao/caracter(s) desejados
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+texto);
        System.out.println("indice: 01234567890123456789");
        System.out.println("expressao: "+matcher.pattern());
        System.out.println("posicoes encontradas");

        /*
        o find procura o padrano dentro do texto instaciado, porem, quando encontra o padrao, ele vai
        procurar apos o indice que participa do padrao ex: se estiver procurando
        as letra ara palavra arara ele ira devolver apenas o indice 0, porque o segundo "a" faz parte do padrao
        e nao sera considerado na proxima busca
         */
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }



    }
}
