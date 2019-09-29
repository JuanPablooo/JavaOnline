package br.com.abc.javacore.Zcolections.teste;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        /*
         map e um dicionario, que precisa da chave e do valor
         Map<String,String> map = new HashMap<>(); com o Hash ele nao mantem a ordem de insercao
         Map<String,String> map = new LinkedHashMap<>(); com o linkedHasMap ele mantem, se baseando no hash da chave(key)
         */

        Map<String,String> map = new LinkedHashMap<>();
        map.put("teckado", "teclado");
        map.put("mouze", "mouse");
        map.put("meza", "mesa");
        map.put("meza", "mesa2");
         for(String key: map.keySet()){ // acessandoos as chaves, se fosse valores seria map.values()
             System.out.println(key);
         }
         // assim acessamos as chaves e os valores
         for(Map.Entry<String, String> entry :  map.entrySet()){
             System.out.println(entry.getKey() + "->" + entry.getValue());
         }
    }
}
