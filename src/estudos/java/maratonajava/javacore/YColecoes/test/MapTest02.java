package estudos.java.maratonajava.javacore.YColecoes.test;

import estudos.java.maratonajava.javacore.YColecoes.dominio.Consumidor;
import estudos.java.maratonajava.javacore.YColecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {

       Consumidor consumidor1 = new Consumidor("Pedro");
       Consumidor consumidor2 = new Consumidor("Joao");

        Manga manga1 = new Manga(3L, "Naruto", 109.90);
        Manga manga2 = new Manga(1L, "One Piece", 102.00);
        Manga manga3 = new Manga(2L, "AOT", 50.60);

        System.out.println(consumidor1);

        //  exemplificando uso do Map, aqui dizemos que o objeto Consumidor comprou o objeto Manga
        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1,manga2);
        consumidorManga.put(consumidor2,manga3);


        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }


    }
}
