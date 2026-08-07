package estudos.java.maratonajava.javacore.YColecoes.test;

import estudos.java.maratonajava.javacore.YColecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// Quando usar Comparator e o compareTo?
// Comparator: customizar ordem (ou ordem secundaria) de um objeto.
// compareTo: ordem padrão/natural de um objeto.
// caso preciso customizar/ordenar os objetos, podemos usar o Comparator.
// comparar por Id
class MangaBydComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}
// comparar por String
class MangaByStringComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(3L,"Naruto",109.90));
        mangas.add(new Manga(1L,"One Piece",102.00));
        mangas.add(new Manga(2L,"AOT",50.60));

//        System.out.println(mangas);
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("----");
//        Collections.sort(mangas, new MangaBydComparator());

        mangas.sort(new MangaBydComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("-----");
        mangas.sort(new MangaByStringComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
