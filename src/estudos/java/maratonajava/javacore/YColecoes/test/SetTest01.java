package estudos.java.maratonajava.javacore.YColecoes.test;

import estudos.java.maratonajava.javacore.YColecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangasHashSet = new HashSet<>(); // nao permite duplicacao (elementos unicos, organizados pro hash)
        mangasHashSet.add(new Manga(3L, "Naruto", 109.90, 3));
        mangasHashSet.add(new Manga(1L, "One Piece", 102.00, 0));
        mangasHashSet.add(new Manga(2L, "AOT", 50.60, 1));
        mangasHashSet.add(new Manga(4L, "HXH", 50.60, 0));

        Set<Manga> mangaLinkedHashSet = new LinkedHashSet<>();  // manter a ordem de implementação
        mangaLinkedHashSet.add(new Manga(3L, "Naruto", 109.90, 3));
        mangaLinkedHashSet.add(new Manga(1L, "One Piece", 102.00, 0));
        mangaLinkedHashSet.add(new Manga(2L, "AOT", 50.60, 1));
        mangaLinkedHashSet.add(new Manga(4L, "HXH", 50.60, 0));

            System.out.println("HashSet");
        for (Manga manga : mangasHashSet) {
            System.out.println(manga);

        }
        System.out.println("LinkedHashSet");
        for (Manga manga2 : mangaLinkedHashSet) {
            System.out.println(manga2);
        }


    }
}
