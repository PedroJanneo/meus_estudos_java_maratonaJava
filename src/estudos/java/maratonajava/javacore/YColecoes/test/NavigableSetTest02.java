package estudos.java.maratonajava.javacore.YColecoes.test;

import estudos.java.maratonajava.javacore.YColecoes.dominio.Manga;
import estudos.java.maratonajava.javacore.YColecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Quando usar o TreeSet, quando implememtar carable ou criar um comparator
 */
class SmartphoneMarcacomparator2 implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
class MangaByPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest02 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcacomparator2()); // tree -> sort / tem que ter o comparable ou implementar o comparator
        Smartphone smartphone = new Smartphone("123","Nokia");
        set.add(smartphone);
        System.out.println(set);


        NavigableSet<Manga> mangasSet = new TreeSet<>(new MangaByPrecoComparator()); // criando um comparator por preço / se o preço for igual em dois objetos, nao ira se repetir
        mangasSet.add(new Manga(3L, "Naruto", 109.90, 3));
        mangasSet.add(new Manga(1L, "One Piece GOLD", 103.00, 0));
        mangasSet.add(new Manga(2L, "AOT", 50.60, 1));
        mangasSet.add(new Manga(4L, "HXH", 53.60, 0));
        mangasSet.add(new Manga(5L, "HXH221", 102.00, 0));
        for (Manga manga : mangasSet) { //.descendingSet() INVERTER ordem
            System.out.println(manga);
        }

        Manga onePiece = new Manga(1L, "One Piece", 102.00, 1);

        // Outros metodos:
        // lower retorna o MENOR
        // floor retorna MENOR ou IGUAL
        // higher retorna MAIOR
        // ceiling retorna MAIOR ou IGUAL
        System.out.println("------");
        System.out.println(mangasSet.lower(onePiece)); // menor preço da lista mangaSet é HXH (ele verifica o valor do onePiece (102.00), e qual o menor valor mais proximo dele (neste caso, HxH 53.6)
        System.out.println(mangasSet.floor(onePiece)); // valor menor ou igual ao onePiece (102) dentro da lista mangaSet (neste caso HXH221 102)
        System.out.println(mangasSet.higher(onePiece)); // valor maior ao onePiece (102) dentro da lista mangaSet (neste caso One Piece Gold 103)
        System.out.println(mangasSet.ceiling(onePiece));// valor maior ou igual ao onePiece (102) dentro da lista mangaSet (neste caso HXH221 102)


        System.out.println("-----");
        System.out.println("Tamanho atual: " + mangasSet.size()); // tamanho da lista
        System.out.println("Remvovendo " + mangasSet.pollFirst()); // retorna PRIMEIRO item da lista e REMOVE
        System.out.println("Tamanho atualizado: " + mangasSet.size());
        System.out.println("Removendo: " + mangasSet.pollLast()); // retorna ULTIMO item da lista e REMOVE
        System.out.println("Tamanho atualizado: " + mangasSet.size());

    }
}
