package estudos.java.maratonajava.javacore.YColecoes.test;

import estudos.java.maratonajava.javacore.YColecoes.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Pedro");
        Consumidor consumidor2 = new Consumidor("Joao");

        NavigableMap<String,String> map = new TreeMap<>(); // se for importar uma classe, precisa ter cum coparable / comparator
        map.put("A","Letra A");
        map.put("B","Letra B");
        map.put("C","Letra C");
        map.put("D","Letra D");
        map.put("E","Letra E");

        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry.getKey() + " - " + stringStringEntry.getValue());
        }
        System.out.println("----");
        System.out.println(map.remove("A")); // removendo a chave A
        System.out.println(map.headMap("C")); // tudo antes do C (tirando o C)
        System.out.println(map.headMap("C",true)); // tudo antes do C (inclusive o proprio C)

        // metodos do NavigableSetTest02 tambem funcionam aqui

    }
}
