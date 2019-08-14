package br.com.abc.introducao.operadores;

public class Parcelas1000 {
    public static void main(String[] args) {
        double ValorProduto = 30000;
        for (int parcelas = (int) ValorProduto; parcelas >=1; parcelas--) {
            double ValorParcela = ValorProduto / parcelas;
            if (ValorParcela<= 1000) {
                continue;

            } System.out.println("o prodruto de " + ValorProduto + " podera ser dividido em " +
                    "" + parcelas + " e cada parcela custara " + ValorParcela);
        }
    }
}
