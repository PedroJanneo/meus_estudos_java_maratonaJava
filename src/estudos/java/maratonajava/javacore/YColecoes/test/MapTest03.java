package estudos.java.maratonajava.javacore.YColecoes.test;

import estudos.java.maratonajava.javacore.YColecoes.dominio.Consumidor;
import estudos.java.maratonajava.javacore.YColecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {

       Consumidor consumidor1 = new Consumidor("Pedro");
       Consumidor consumidor2 = new Consumidor("Joao");

        Manga manga1 = new Manga(3L, "Naruto", 109.90);
        Manga manga2 = new Manga(1L, "One Piece", 102.00);
        Manga manga3 = new Manga(2L, "AOT", 50.60);

        System.out.println(consumidor1);

       List<Manga> mangaConsumidor1List = List.of(manga1,manga2);
       List<Manga> mangaConsumidor2List = List.of(manga1,manga2,manga3);

        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1,mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2,mangaConsumidor2List);

        for(Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.println("----");
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());

            }
        }





    }
}
