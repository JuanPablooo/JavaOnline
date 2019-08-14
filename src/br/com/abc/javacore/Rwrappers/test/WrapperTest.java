package br.com.abc.javacore.Rwrappers.test;

public class WrapperTest {
    public static void main(String[] args) {
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10L;
        float floatPrimitivo = 10F;
        double doublePrimitivo = 10D;
        char charPrimitivo  = 'A';
        boolean booleanPrimitivo = true;

        // esses objetos sao de classes filhas da classe number, ou seja sao irmaos,logo nao tem como fazer o casting
        // com classes so eh possivel fazer casting entre pai e filho

        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer intWrapper = 1;
        Long longWrapper = 10L;
        Float floatWrapper = 10F;
        Double doubleWrapper = 10D;
        Character charWrapper = 'A';
        Boolean booleanWrapper = true;

        String valor = "10";
        Float i = Float.parseFloat(valor);
        // o metodo isDigit verifica se o valor eh numerico
        System.out.println(Character.isDigit('5'));
        // informar se eh uma letra
        System.out.println(Character.isLetter('5'));
        // informa se eh uma letra ou um numero
        System.out.println(Character.isLetter('5'));
        System.out.println(Character.isUpperCase('P'));
        System.out.println(Character.isLowerCase('P'));
        // convert a letra em upercase
        System.out.println(Character.toUpperCase('5'));


    }
}
