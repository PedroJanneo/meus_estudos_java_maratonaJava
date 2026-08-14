package estudos.java.maratonajava.javacore.YColecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {

        // no MAp recebe doi valor no operador diamante <K,V>, Chave(K),Valor(V)
        Map<String,String> map = new LinkedHashMap<>();
        map.put("teklado","teclado");
        map.put("mouze","mouse");
        map.put("vc","voce");
//        map.put("vc","voce2"); // no MAP ele sobrescreve caso a chabe seja a mesma
        map.putIfAbsent("vc2","você"); // so adiciona se nao existir
        System.out.println(map);

        for(String key : map.keySet()){ // imprimir somente as chaves + valor
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("----");

        for (String value : map.values()) { // imprimir somente valor
            System.out.println(value);
        }

        for(Map.Entry<String,String> entry: map.entrySet()){ // imprimir somente as chaves + valor
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
