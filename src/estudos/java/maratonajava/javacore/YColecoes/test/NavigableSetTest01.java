package estudos.java.maratonajava.javacore.YColecoes.test;

import estudos.java.maratonajava.javacore.YColecoes.dominio.Manga;
import estudos.java.maratonajava.javacore.YColecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Quando usar o TreeSet, quando implememtar carable ou criar um comparator
 */
class SmartphoneMarcacomparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcacomparator()); // tree -> sort / tem que ter o comparable ou implementar o comparator
        Smartphone smartphone = new Smartphone("123","Nokia");
        set.add(smartphone);
        System.out.println(set);


        NavigableSet<Manga> mangasSet = new TreeSet<>(); // TreeSet vai ordenar conforme o compareTo
        mangasSet.add(new Manga(3L, "Naruto", 109.90, 3));
        mangasSet.add(new Manga(1L, "One Piece", 102.00, 0));
        mangasSet.add(new Manga(2L, "AOT", 50.60, 1));
        mangasSet.add(new Manga(4L, "HXH", 50.60, 0));
        for (Manga manga : mangasSet) {
            System.out.println(manga);
        }

    }
}
