package br.com.abc.javacore.Sstrings.test;

public class StringTest {
    public static void main(String[] args) {
        // sempre que voce declarar uma estring e seu valor ja existir em memoria a jvm nao vai criar dois espacos
        // ela vai apontar para o mesmo espaco, isso faz com que consuma menos memoria

        String nome = "juan";
        nome = nome.concat(" Pablo"); // nome += " Pablo"
        System.out.println(nome);

        String teste = "goku";
        // o metodo chatAt devolve o char de um indice
        System.out.println(teste.charAt(0));
        String teste2 = "Goku";
        // o metodo equals compra os valores de uma string devolvendo um boolean
        System.out.println(teste.equals(teste2));
        // o metodo equalsIgnoreCase iguinora o case(tamanho fonte/ minuscula maiuscula)
        System.out.println(teste.equalsIgnoreCase(teste2));
        // devolve o tamanho da string
        System.out.println(teste.length());
        // replace procura o valor desejado e substitui pelo valor desejado
        String tes= "llllloooooo";
        String tess = "pppoooomm";
        System.out.println(tes.replace('l', 'o'));
        System.out.println(tes);
        // toLowerCase passa tudo para minusculo o toUperCase passa tudo para maiusculo
        String uper = "    JUAN    ";
        System.out.println(uper.toLowerCase());
        String num = "0123456789";
        // o metodo substring devolve um pedaco de uma string, para isso temos dois parametros
        // o primeiro deles e onde comeca a parte o segundo onde termina POREMMMMM
        // o segundo parametro considera a string a partir da pos 1.( testa se nao entendeu)
        System.out.println(num.substring(2, 6));
        // o metodo trim remove todos os espacamentos do inicio e do final de uma string
        System.out.println(uper.trim());














    }
}
