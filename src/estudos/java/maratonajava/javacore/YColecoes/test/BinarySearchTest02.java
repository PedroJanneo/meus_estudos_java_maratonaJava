package estudos.java.maratonajava.javacore.YColecoes.test;

import estudos.java.maratonajava.javacore.YColecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(3L,"Naruto",109.90));
        mangas.add(new Manga(1L,"One Piece",102.00));
        mangas.add(new Manga(2L,"AOT",50.60));

        Collections.sort(mangas); // ordenando a lista de mangas
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaSerach = new Manga(3L, "Naruto", 109.90); // criando um objeto
        System.out.println(Collections.binarySearch(mangas,mangaSerach)); // fazendo a pesquisa da lista mangas, procurando  objeto mangaSearch

        mangas.sort(new MangaBydComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println(Collections.binarySearch(mangas,mangaSerach));


    }
}
