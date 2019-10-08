package br.com.abc.javacore.Zcolections.teste;

import br.com.abc.javacore.Zcolections.classes.Consumidor;
import br.com.abc.javacore.Zcolections.classes.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTest {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("juan", "122");
        Consumidor consumidor2 = new Consumidor("dev dojo", "321");
        Consumidor consumidor3 = new Consumidor("dev dojoo", "321"); // como o cpf e atributo usado no metodo equals
        // pode se concluir que consumidor2 e consumidor3 sao iguals mesmo que o nome nao seja

        Produto produto1 = new Produto("123", "Laptop lenovo", 2000.0);
        Produto produto2 = new Produto("321", "picanha", 26.0);
        Produto produto3 = new Produto("879", "teclado", 1000.0);
        Produto produto4 = new Produto("012", "sansumg", 3000.0);

        Map<Consumidor, List<Produto>> map = new HashMap<>();

        List<Produto> produtoCon1 = new ArrayList<>();
        produtoCon1.add(produto1);
        produtoCon1.add(produto2);

        List<Produto> produtoCon2 = new ArrayList<>();
        produtoCon2.add(produto3);
        produtoCon2.add(produto4);

        map.put(consumidor, produtoCon1);
        map.put(consumidor2, produtoCon2);
        map.put(consumidor3, produtoCon1); //TOMAR CUIDADO aqui ele sobrescreve os valores da chave(consumidor2) por causa do cpf que e igual
        for(Map.Entry<Consumidor, List<Produto>> entry: map.entrySet()){
            System.out.println(entry.getKey().getNome()+"->");
            for(Produto produto: entry.getValue()){
                System.out.println(produto.getNome());
            }
        }



    }
}
