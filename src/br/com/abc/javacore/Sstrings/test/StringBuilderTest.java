package br.com.abc.javacore.Sstrings.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String s = "uma frase comum";
//as classes sao diferentes, entao nao da para sb receber diretamente uma variavei do tipo String,tem que usar um metodo
        StringBuilder sb = new StringBuilder(16);
        sb.append("uma frase comum");
        sb.append(s);
        // nao eh possivel fazer uma String apontar para uma stringBuilder, sao classes diferentes
        // o metodo toString retorna uma String, entao posso adicionar essse retorno em uma uma String

        s = sb.toString();
        System.out.println("-=-=");
        System.out.println(s);
        System.out.println(sb);
        // o metedo reverse inverte a ordem dos caracteres
        System.out.println(sb.reverse());
// defghi ihed

        sb = null;
        sb = new StringBuilder();
        sb.append("0123456789");
        System.out.println(sb);
        // o delete, delata caratcteres, para utilizar eh necessario dois argumentos, representando o indice do inicio
        // o segundo eh responsavel por o]indicar ate onde vai ser deletado
        System.out.println(sb.delete(1, 2));
        System.out.println(sb);
        // o insert, insere caracteres, pede dois argumentos, o indice de onde vai inserir, e o conteudo a ser inserido
        System.out.println(sb.insert(2, "llll"));
    }
}
